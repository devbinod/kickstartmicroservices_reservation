package np.com.pantbinod.flightreservation.modal;

import javax.persistence.*;

@Table(name = "reservation")
@Entity
public class Reservation extends AbastractEntity {

    private Boolean checkedIn;
    private int numberOfBag;
    @OneToOne
    private Passenger passenger;
    @OneToOne
    private Flight flight;


    public Boolean getCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(Boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public int getNumberOfBag() {
        return numberOfBag;
    }

    public void setNumberOfBag(int numberOfBag) {
        this.numberOfBag = numberOfBag;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
