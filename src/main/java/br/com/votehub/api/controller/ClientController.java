package br.com.votehub.api.controller;

import br.com.votehub.api.entity.Client;
import br.com.votehub.api.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/clients")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping(path = "/createaccount")
    public ResponseEntity<Client> createClient(@RequestBody Client client){
        return ResponseEntity.ok(clientService.createClient(client));
    }

    @GetMapping(path = "/{id}") //TODO: tornar este endpoint privado.
    public ResponseEntity<Client> getClientById(@PathVariable Long id){
        return ResponseEntity.ok(clientService.getClientById(id));
    }

    @GetMapping(path = "/all")
    public ResponseEntity<List<Client>> getAllClients(){
        return ResponseEntity.ok(clientService.getAll());
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteClientById(@PathVariable Long id){
        clientService.deleteClientById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(path = "/update")
    public ResponseEntity<Client> updateClient(@RequestBody Client client){
        return ResponseEntity.ok(clientService.updateClient(client));
    }

}
