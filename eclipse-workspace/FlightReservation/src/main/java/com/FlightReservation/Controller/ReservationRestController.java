package com.FlightReservation.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FlightReservation.Model.ReservationDetails;
import com.FlightReservation.Repository.ReservationDetailsRepository;
import com.FlightReservation.dto.ReservationRestRequest;

@RestController
public class ReservationRestController {
	
	@Autowired
	private ReservationDetailsRepository reservationRepository;

	@GetMapping("/getReservation/{id}")
	public ReservationDetails getResevation(@PathVariable("id") Long id) {
		//ReservationDetails rev =  reservationRepository.getOne(id);
		ReservationDetails rev = reservationRepository.getEverything(id);
		return rev;
	
	}
	
	@RequestMapping("/updateReservation")
	public ReservationDetails updateReservation(@RequestBody ReservationRestRequest reservationRequest) {
		ReservationDetails reservation = reservationRepository.getOne(reservationRequest.getId());
		reservation.setCheckedIn(reservationRequest.getCheckedIn());
		reservation.setNumberOfBags(reservationRequest.getNumberOfBags());
		return reservationRepository.save(reservation);
		
	}
}
