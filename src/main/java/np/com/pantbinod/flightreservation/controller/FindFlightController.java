package np.com.pantbinod.flightreservation.controller;

import np.com.pantbinod.flightreservation.modal.Flight;
import np.com.pantbinod.flightreservation.reps.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
public class FindFlightController {

    @Autowired
    private FlightRepository flightRepository;

    @RequestMapping(

    )
    public String findFlights(@RequestParam("from") String from, @RequestParam("to") String to, @RequestParam("departureDate")
    @DateTimeFormat(pattern = "MM-dd-yyyy") Date departureDate, ModelMap modelMap){

       List<Flight> flights= flightRepository.findFlights(from,to,departureDate);
       modelMap.addAttribute("flights",flights);
        return "displayFlight";
    }

}
