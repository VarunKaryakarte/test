package com.FlightReservation.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ReservationRequest {

	private Long flightId;
	
	private String passengerFirstName;
	
	private String passengerLastName;
	
	private String passengerPhone;
	
	private String passengerEmail;
	
	private String nameOnTheCard;
	
	private String cardNumber;
	
	private String expiryDate;
	
	private String securityCode;
	
	public ReservationRequest(long flightId , String firstName ,String lName , String number , String email , String cardName , 
											String cnumber , String expDate , String secCode) {
		this.flightId = flightId;
		this.passengerFirstName = firstName;
		this.passengerLastName = lName;
		this.passengerPhone = number;
		this.passengerEmail = email;
		this.nameOnTheCard = cardName;
		this.cardNumber = cnumber;
		this.expiryDate = expDate;
		this.securityCode = secCode;
	}
	
	
	
}