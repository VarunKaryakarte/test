package com.FlightReservation.Model;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "reservation")
public class ReservationDetails extends AbstractClass implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Column(name = "checked_in")
	private Boolean checkedIn;
	
	
	@OneToOne
	@JoinColumn(name = "FLIGHT_ID")
	private FlightDetails flightId ;
	
	
	@ManyToOne
	@JoinColumn(name = "PASSENGER_ID")
	private PassengerDetails passengerId;
	
	@Column(name = "number_of_bags")
	private Integer numberOfBags;
	
	@Column(name = "created_time")
	private ZonedDateTime createdTime;
	
	public ReservationDetails(Boolean checkIn , FlightDetails flight , PassengerDetails passenger , Integer bags) {
		this.checkedIn = checkIn;
		this.flightId = flight;
		this.passengerId = passenger;
		this.numberOfBags = bags;
	//	this.createdTime = time;
	}
	
	
	@Override
	public String toString() {
		return "checkedIn = " +checkedIn + "flightId = " +flightId + "passengerId = " +passengerId + "numberOfBags = " + numberOfBags
				+ "createdTime = " +createdTime;
	}
 	
}
