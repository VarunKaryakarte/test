package com.FlightReservation.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.FlightReservation.Model.FlightDetails;
import com.FlightReservation.Repository.FlightDetailsRepository;

@Controller
public class FlightController {
	
	@Autowired
  FlightDetailsRepository flightRepository;

	@RequestMapping(value = "/findFlights" , method = RequestMethod.POST)
	public String findFlights(@RequestParam("to") String to , @RequestParam("from")String from ,
			@RequestParam("departureDate") @DateTimeFormat(pattern = "MM-dd-yyyy")Date departureDate ,  ModelMap modelMap) {

		List<FlightDetails> flights =	flightRepository.findFlights(from, to , departureDate );
		modelMap.addAttribute("flights", flights);
		return "displayFlights";
		
	}
	
	@RequestMapping("admin/addFlights")
	public String showAddFlights() {
		return "showAddFlights";
	}
	
}
