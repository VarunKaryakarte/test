package com.FlightCheckin.Integration.dto;

import java.sql.Timestamp;
import java.util.Date;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FlightDetails {
	
	
	private Long id;
	
	private String flightNumber;
	
	
	private String operatingAirlines;
	

	private String arrivalCity;
	
	
	private String departureCity;
	
	
	private Date dateOfDeparture;
	
	
	private Timestamp arrivalTime;
	
			
	
}
