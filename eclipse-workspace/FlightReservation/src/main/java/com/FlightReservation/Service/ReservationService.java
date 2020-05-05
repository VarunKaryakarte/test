package com.FlightReservation.Service;

import com.FlightReservation.Model.ReservationDetails;
import com.FlightReservation.dto.ReservationRequest;

public interface ReservationService {

	public ReservationDetails bookFlight(ReservationRequest request);
}
