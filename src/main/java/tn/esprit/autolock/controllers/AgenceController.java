package tn.esprit.autolock.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolock.Services.IAgenceService;
import tn.esprit.autolock.entities.Agence;

import java.util.List;

@RestController
@RequestMapping("/Agence")
@AllArgsConstructor
public class AgenceController {

    private IAgenceService agenceService;

    @PostMapping("/ajouterAgence")
    public Agence ajouterAgence(@RequestBody Agence agence) {
        return agenceService.ajouterAgence(agence);
    }


    @PutMapping("/modifierAgence/{id}")
    public Agence modifierAgence(@PathVariable Long id, @RequestBody Agence agence) {
        return agenceService.modifierAgence(id, agence);
    }

    @DeleteMapping("/supprimerAgence/{id}")
    public void supprimerAgence(@PathVariable Long id) {
        agenceService.supprimerAgence(id);
    }

    @GetMapping("/getAgences")
    public List<Agence> recupererAgences() {
        return agenceService.recupererlAgences();
    }
}