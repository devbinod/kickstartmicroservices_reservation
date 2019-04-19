package np.com.pantbinod.flightreservation.reps;

import np.com.pantbinod.flightreservation.modal.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
