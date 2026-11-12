package tn.esprit.autolock.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.autolock.Repositories.AgenceRepository;
import tn.esprit.autolock.Repositories.EquipementRepository;
import tn.esprit.autolock.Repositories.VehiculeRepository;
import tn.esprit.autolock.entities.Agence;
import tn.esprit.autolock.entities.Equipement;
import tn.esprit.autolock.entities.Vehicule;

import java.util.List;

@AllArgsConstructor
@Service
public class VehiculeService implements IVehiculeService {

    private VehiculeRepository vehiculeRepo;
    private AgenceRepository agenceRepo;
    private EquipementRepository equipementRepo;

    @Override
    public Vehicule ajouterVehicule(Vehicule vehicule) {
        return vehiculeRepo.save(vehicule);
    }

    @Override
    public Vehicule modifierVehicule(Vehicule vehicule) {
        return vehiculeRepo.save(vehicule);
    }

    @Override
    public void supprimerVehicule(Long id) {
        vehiculeRepo.deleteById(id);
    }

    @Override
    public List<Vehicule> recupererVehicules() {
        return vehiculeRepo.findAll();
    }

    @Override
    public void affecterVehiculeAAgence(Long idVehicule, Long idAgence) {
        Vehicule vehicule = vehiculeRepo.findById(idVehicule).get();
        Agence agence = agenceRepo.findById(idAgence).get();
        vehicule.setAgence(agence);
        vehiculeRepo.save(vehicule);
    }

    @Override
    public void desaffecterVehiculeDAgence(Long idVehicule) {
        Vehicule vehicule = vehiculeRepo.findById(idVehicule).get();
        vehicule.setAgence(null);
        vehiculeRepo.save(vehicule);
    }

    @Override
    @Transactional
    public void affecterEquipementAVehicule(Long idEquipement, Long idVehicule) {
        Equipement equipement = equipementRepo.findById(idEquipement).get();
        Vehicule vehicule = vehiculeRepo.findById(idVehicule).get();
        vehicule.getEquipements().add(equipement);
        vehiculeRepo.save(vehicule);
    }

    @Override
    @Transactional
    public void desaffecterEquipementDeVehicule(Long idEquipement, Long idVehicule) {
        Vehicule vehicule = vehiculeRepo.findById(idVehicule).get();
        vehicule.getEquipements().removeIf(e -> e.getIdEquipement().equals(idEquipement));
        vehiculeRepo.save(vehicule);
    }
}