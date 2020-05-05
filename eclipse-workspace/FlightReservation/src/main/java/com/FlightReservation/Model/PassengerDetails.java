package com.FlightReservation.Model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "passenger")
public class PassengerDetails extends AbstractClass implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone")
	private String phoneNumber;
	
//	@OneToOne(mappedBy = "passengerId" , orphanRemoval = true)
//	private ReservationDetails reservation;
	
	public PassengerDetails(String firstName , String lastName , String email , String number) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = number;
	}
	@Override
	public String toString() {
		return "first Name" +firstName  + "last Name" +lastName + "email" +email + "phone" +phoneNumber; 
	}

}