package br.com.votehub.api.service.impl;

import br.com.votehub.api.entity.Client;
import br.com.votehub.api.exceptions.EmailAlreadyExistsException;
import br.com.votehub.api.exceptions.InvalidPasswordException;
import br.com.votehub.api.exceptions.ResourceNotFoundException;
import br.com.votehub.api.repository.ClientRepository;
import br.com.votehub.api.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client createClient(Client client) {
        Optional<Client> existingClient = clientRepository.findByEmail(client.getEmail());

        if (existingClient.isPresent()) {
            throw new EmailAlreadyExistsException("Email de cliente já existe.");
        }
        if (client.getPassword().isBlank()) {
            throw new InvalidPasswordException("Insira uma senha válida.");
        }
        return clientRepository.save(client);
    }

    @Override
    public Client getClientById(Long id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cliente não encontrado."));
    }

    @Override
    public void deleteClientById(Long id) { //TODO: tornar um soft delete.
        if (!clientRepository.existsById(id)) {
            throw new ResourceNotFoundException("Cliente não encontrado no banco de dados.");
        }

        clientRepository.deleteById(id);
    }

    @Override
    public List<Client> getAll() { //A resposta será uma lista de objetos Client.
        return clientRepository.findAll();
    }

    @Override
    public Client updateClient(Client client) { //TODO: validar o cliente através do token para que ele possa atualizar apenas a própria conta e não Id de terceiros.
        if (!clientRepository.findById(client.getId()).isPresent()) {
            throw new ResourceNotFoundException("Cliente não encontrado na base para atualização.");
        }

        return clientRepository.save(client);
    }

}
