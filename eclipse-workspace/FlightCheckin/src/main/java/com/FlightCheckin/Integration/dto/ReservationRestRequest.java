package com.FlightCheckin.Integration.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor 
public class ReservationRestRequest {
	
	private Long  id;
	private Boolean checkedIn;
	
	private Integer numberOfBags;
	

}
