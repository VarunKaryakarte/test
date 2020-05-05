package com.FlightCheckin.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.FlightCheckin.Integration.ReservationRestClient;
import com.FlightCheckin.Integration.dto.ReservationDetails;
import com.FlightCheckin.Integration.dto.ReservationRestRequest;

@Controller
public class CheckInController {
	
	@Autowired
	private ReservationRestClient restClient;

	@RequestMapping("/showCheckin")
	public String showCheckin() {
		return "showCheckin";
		
	}
	
	@RequestMapping(value = "/startCheckIn", method = RequestMethod.POST)
	public String startCheckIn(@RequestParam("reservationId") Long reservationId , ModelMap modelMap) {
	ReservationDetails reservation =	restClient.findReservation(reservationId);
		modelMap.addAttribute("reservation", reservation);
		return "displayReservationDetails";
	}
	
	@RequestMapping(value = "/completeCheckIn" ,method = RequestMethod.POST )
	public String completeCheckIn(@RequestParam("numberOfBags") Integer numberOfBags ,
											@RequestParam("reservationId") Long reservationId ,ModelMap modelMap) {
		ReservationRestRequest request = new ReservationRestRequest();
		request.setCheckedIn(true);
		request.setId(reservationId);
		request.setNumberOfBags(numberOfBags);
	    restClient.updateReservation(request);
		
		return "completeReservation";
	}
}
