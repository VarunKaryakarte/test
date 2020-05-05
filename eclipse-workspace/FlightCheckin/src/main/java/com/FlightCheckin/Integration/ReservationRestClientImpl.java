package com.FlightCheckin.Integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.FlightCheckin.Integration.dto.ReservationDetails;
import com.FlightCheckin.Integration.dto.ReservationRestRequest;
@Component
public class ReservationRestClientImpl implements ReservationRestClient{

	public static final String REST_URI_GET = "http://localhost:8080/getReservation/";
	
	public static final String REST_URI_UPDATE = "http://localhost:8080/updateReservation";
	
	@Override
	public ReservationDetails findReservation(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(REST_URI_GET +id, ReservationDetails.class);
	}

	@Override
	public ReservationDetails updateReservation(ReservationRestRequest request) {
		RestTemplate restTemplate = new RestTemplate();
	return	restTemplate.postForObject(REST_URI_UPDATE, request, ReservationDetails.class);
	
	}

}
