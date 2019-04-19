package np.com.pantbinod.flightreservation.reps;

import np.com.pantbinod.flightreservation.modal.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassangerRepository extends JpaRepository<Passenger, Long> {
}
