package tn.esprit.autolock.Services;

import tn.esprit.autolock.entities.Agence;

import java.util.List;

public interface IAgenceService {

    Agence ajouterAgence(Agence agence);

<<<<<<< HEAD
    Agence modifierAgence(Long id, Agence agence);
=======
    Agence modifierAgence(Agence agence);
>>>>>>> 2497522d32f98a6a5f919f759f3fd47c7697d934

    void supprimerAgence(Long id);

    List<Agence> recupererlAgences();

}
