package tn.esprit.autolock.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolock.Services.IVehiculeService;
import tn.esprit.autolock.entities.Vehicule;

import java.util.List;

@RestController
@RequestMapping("/Vehicule")
@AllArgsConstructor
public class VehiculeController {

    private IVehiculeService vehiculeService;

    @PostMapping("/ajouterVehicule")
    public Vehicule ajouterVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.ajouterVehicule(vehicule);
    }

    @PutMapping("/modifierVehicule")
    public Vehicule modifierVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.modifierVehicule(vehicule);
    }

    @DeleteMapping("/supprimerVehicule/{id}")
    public void supprimerVehicule(@PathVariable Long id) {
        vehiculeService.supprimerVehicule(id);
    }

    @GetMapping("/getVehicules")
    public List<Vehicule> recupererVehicules() {
        return vehiculeService.recupererVehicules();
    }

    @PutMapping("/affecter-vehicule/{idVehicule}/agence/{idAgence}")
    public void affecterVehiculeAAgence(@PathVariable Long idVehicule, @PathVariable Long idAgence) {
        vehiculeService.affecterVehiculeAAgence(idVehicule, idAgence);
    }

    @PutMapping("/desaffecter-vehicule/{idVehicule}/agence")
    public void desaffecterVehiculeDAgence(@PathVariable Long idVehicule) {
        vehiculeService.desaffecterVehiculeDAgence(idVehicule);
    }

    @PutMapping("/affecter-equipement/{idEquipement}/vehicule/{idVehicule}")
    public void affecterEquipementAVehicule(@PathVariable Long idEquipement, @PathVariable Long idVehicule) {
        vehiculeService.affecterEquipementAVehicule(idEquipement, idVehicule);
    }

    @PutMapping("/desaffecter-equipement/{idEquipement}/vehicule/{idVehicule}")
    public void desaffecterEquipementDeVehicule(@PathVariable Long idEquipement, @PathVariable Long idVehicule) {
        vehiculeService.desaffecterEquipementDeVehicule(idEquipement, idVehicule);
    }
}
