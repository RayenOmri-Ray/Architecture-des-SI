package tn.esprit.autolock.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolock.Repositories.AgenceRepository;
import tn.esprit.autolock.entities.Agence;

import java.util.List;
@AllArgsConstructor
@Service
public class AgenceService implements IAgenceService{

    private AgenceRepository agenceRepo;

    @Override
    public Agence ajouterAgence(Agence agence) {

        return agenceRepo.save(agence);
    }

    @Override
<<<<<<< HEAD
    public Agence modifierAgence(Long id, Agence agence) {
=======
    public Agence modifierAgence(Agence agence) {
>>>>>>> 2497522d32f98a6a5f919f759f3fd47c7697d934

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
}
