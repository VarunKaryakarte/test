package com.FlightReservation.Model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.servlet.Registration;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "flight")
public class FlightDetails extends AbstractClass implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "flight_number")
	private String flightNumber;
	
	@Column(name = "operating_airlines")
	private String operatingAirlines;
	
	@Column(name = "arrival_city")
	private String arrivalCity;
	
	@Column(name = "departure_city")
	private String departureCity;
	
	@Column(name = "date_of_departure")
	private Date dateOfDeparture;
	
	@Column(name = "estimated_arrival_time")
	private Timestamp arrivalTime;
	
//	@OneToOne(mappedBy = "flightId" ,orphanRemoval = true)
//	private ReservationDetails reservation;
	
	public FlightDetails(String flightNumber , String airlines , String aCity , String dCity ) {
		this.flightNumber = flightNumber;
		this.operatingAirlines = airlines;
		this.arrivalCity= aCity;
		this.departureCity = dCity;
//		this.dateOfDeparture = dateOfDep;
	//	this.arrivalTime = arrivalTime;
	}
	
	@Override
	public String toString() {
		return "flight number = " +flightNumber + "operating airlines = " +operatingAirlines + "Arrival City = " +arrivalCity +
				"departure city = " +departureCity + "date of departure = " +dateOfDeparture;
	}
		
	
}
