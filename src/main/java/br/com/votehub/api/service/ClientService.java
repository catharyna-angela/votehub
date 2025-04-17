package br.com.votehub.api.service;

import br.com.votehub.api.entity.Client;

import java.util.List;

public interface ClientService {
    Client createClient(Client client);
    Client getClientById(Long id);
    void deleteClientById(Long id);
    List<Client> getAll();
    Client updateClient(Client client);
}
