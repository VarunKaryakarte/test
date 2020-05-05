package com.FlightCheckin.Integration.dto;

import java.time.ZonedDateTime;




import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class ReservationDetails{

	private Long id;
	
	private Boolean checkedIn;
	
	
	private FlightDetails flightId;
	
	
	private PassengerDetails passengerId;
	
	
	private Integer numberOfBags;
	
	
	private ZonedDateTime createdTime;
	
}
