package com.FlightCheckin.Integration;

import com.FlightCheckin.Integration.dto.ReservationDetails;
import com.FlightCheckin.Integration.dto.ReservationRestRequest;

public interface ReservationRestClient {

	public ReservationDetails findReservation(Long id);
	
	public ReservationDetails updateReservation(ReservationRestRequest request);
}
