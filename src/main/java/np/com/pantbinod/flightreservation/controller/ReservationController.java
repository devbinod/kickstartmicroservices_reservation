package np.com.pantbinod.flightreservation.controller;

import np.com.pantbinod.flightreservation.modal.Flight;
import np.com.pantbinod.flightreservation.reps.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class ReservationController {


    @Autowired
    private FlightRepository flightRepository;
    @RequestMapping("/showCompleteReservation")
    public String showCompleteReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap){
        Flight flight = flightRepository.findById(flightId).orElse(new Flight());
        modelMap.addAttribute("flight", flight);
        return "completeReservation";


    }
}
