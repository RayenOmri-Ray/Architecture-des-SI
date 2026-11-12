package tn.esprit.autolock.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolock.Repositories.AgenceRepository;
import tn.esprit.autolock.Repositories.VehiculeRepository;
import tn.esprit.autolock.entities.Agence;
import tn.esprit.autolock.entities.Vehicule;

import java.util.List;

@Service
@AllArgsConstructor
public class AgenceService implements IAgenceService {

    private AgenceRepository agenceRepo;
    private VehiculeRepository vehiculeRepo;

    @Override
    public Agence ajouterAgence(Agence agence) {
        return agenceRepo.save(agence);
    }

    @Override
    public Agence modifierAgence(Agence agence) {
        return agenceRepo.save(agence);
    }

    @Override
    public void supprimerAgence(Long id) {
        agenceRepo.deleteById(id);
    }

    @Override
    public List<Agence> recupererlAgences() {
        return agenceRepo.findAll();
    }

    @Override
    public void affecterVehiculeAAgence(Long idVehicule, Long idAgence) {
        Vehicule vehicule = vehiculeRepo.findById(idVehicule).get();
        Agence agence = agenceRepo.findById(idAgence).get();
        vehicule.setAgence(agence);
        vehiculeRepo.save(vehicule);
    }
}