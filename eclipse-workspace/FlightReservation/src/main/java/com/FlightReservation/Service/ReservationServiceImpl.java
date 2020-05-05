package com.FlightReservation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.FlightReservation.Model.FlightDetails;
import com.FlightReservation.Model.PassengerDetails;
import com.FlightReservation.Model.ReservationDetails;
import com.FlightReservation.Repository.FlightDetailsRepository;
import com.FlightReservation.Repository.PassengerDetailsRepository;
import com.FlightReservation.Repository.ReservationDetailsRepository;
import com.FlightReservation.dto.ReservationRequest;
@ComponentScan


@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	FlightDetailsRepository flightRepository;

	@Autowired
	PassengerDetailsRepository passengerRepository;
	
	@Autowired
	ReservationDetailsRepository reservationRepository;
	
	@Override
	public ReservationDetails bookFlight(ReservationRequest request) {
		
		Long flightId = request.getFlightId();
		FlightDetails flight =	flightRepository.getOne(flightId);
		
		PassengerDetails passenger = new PassengerDetails();
		passenger.setFirstName(request.getPassengerFirstName());
		passenger.setLastName(request.getPassengerLastName());
		passenger.setEmail(request.getPassengerEmail());
		passenger.setPhoneNumber(request.getPassengerPhone());
		PassengerDetails savedPassenger = passengerRepository.save(passenger);
		
		ReservationDetails reservation = new ReservationDetails();
		reservation.setFlightId(flight);
		reservation.setPassengerId(savedPassenger);
		reservation.setCheckedIn(false);
		
		ReservationDetails savedReservation =reservationRepository.save(reservation);
		return savedReservation;
	}

}
