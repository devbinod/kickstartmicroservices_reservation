package np.com.pantbinod.flightreservation.reps;

import np.com.pantbinod.flightreservation.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
