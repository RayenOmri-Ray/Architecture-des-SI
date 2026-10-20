package tn.esprit.autolock.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolock.Services.IClientService;
import tn.esprit.autolock.entities.Client;

import java.util.List;

@RestController
@RequestMapping("/Client")
@AllArgsConstructor
public class ClientController {

    private IClientService clientService;

    @PostMapping("/ajouterClient")
    public Client ajouterClient(@RequestBody Client client) {
        return clientService.ajouterClient(client);
    }

    @DeleteMapping("/supprimerClient/{id}")
    public void supprimerClient(@PathVariable Long id) {
        clientService.supprimerClient(id);
    }

    @GetMapping("/getClients")
    public List<Client> afficherClients() {
        return clientService.recupererClients();
    }

    @PutMapping("/modifierClient")
    public Client modifierClient(@RequestBody Client client) {
        return clientService.modifierClient(client);
    }
}
