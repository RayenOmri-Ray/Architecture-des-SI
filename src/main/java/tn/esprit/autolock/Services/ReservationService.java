package tn.esprit.autolock.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolock.Repositories.ReservationRepository;
import tn.esprit.autolock.entities.Reservation;

import java.util.List;

@AllArgsConstructor
@Service
public class ReservationService implements IReservationService {

    private ReservationRepository reservationRepo;

    @Override
    public Reservation ajouterReservation(Reservation reservation) {
        return reservationRepo.save(reservation);
    }

    @Override
    public Reservation modifierReservation(Reservation reservation) {
        return reservationRepo.save(reservation);
    }

    @Override
    public void supprimerReservation(Long id) {
        reservationRepo.deleteById(id);
    }

    @Override
    public List<Reservation> recupererReservations() {
        return reservationRepo.findAll();
    }
    @Override
    public void affecterContratAReservation(Long idContrat, Long idReservation) {
        Contrat contrat = contratRepo.findById(idContrat).get();
        Reservation reservation = reservationRepo.findById(idReservation).get();
        reservation.setContrat(contrat);
        reservationRepo.save(reservation);
    }

    @Override
    public void desaffecterContratDeReservation(Long idReservation) {
        Reservation reservation = reservationRepo.findById(idReservation).get();
        reservation.setContrat(null);
        reservationRepo.save(reservation);
    }

    @Override
    public void affecterClientAReservation(Long idClient, Long idReservation) {
        Client client = clientRepo.findById(idClient).get();
        Reservation reservation = reservationRepo.findById(idReservation).get();
        reservation.setClient(client);
        reservationRepo.save(reservation);
    }
}