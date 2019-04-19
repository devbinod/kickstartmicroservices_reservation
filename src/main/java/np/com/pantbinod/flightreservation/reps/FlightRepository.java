package np.com.pantbinod.flightreservation.reps;

import np.com.pantbinod.flightreservation.modal.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    @Query("from Flight  f where  f.departureCity=:departureCity and f.arrivalCity=:arrivalCity and f.dateDeparture=:departureDate")
    List<Flight> findFlights(@Param("departureCity") String from,@Param("arrivalCity") String to,@Param("departureDate") Date departureDate);
}
