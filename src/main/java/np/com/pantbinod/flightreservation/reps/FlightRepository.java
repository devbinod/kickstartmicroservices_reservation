package np.com.pantbinod.flightreservation.reps;

import np.com.pantbinod.flightreservation.modal.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}
