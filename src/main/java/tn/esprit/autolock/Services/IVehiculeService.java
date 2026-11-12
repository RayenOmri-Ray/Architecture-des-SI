package tn.esprit.autolock.Services;

import tn.esprit.autolock.entities.Vehicule;

import java.util.List;

public interface IVehiculeService {

    Vehicule ajouterVehicule(Vehicule vehicule);

    Vehicule modifierVehicule(Vehicule vehicule);

    void supprimerVehicule(Long id);

    List<Vehicule> recupererVehicules();

    void affecterVehiculeAAgence(Long idVehicule, Long idAgence);

    void desaffecterVehiculeDAgence(Long idVehicule);

    void affecterEquipementAVehicule(Long idEquipement, Long idVehicule);

    void desaffecterEquipementDeVehicule(Long idEquipement, Long idVehicule);
}


