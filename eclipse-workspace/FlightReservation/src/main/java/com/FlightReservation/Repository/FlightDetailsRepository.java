package com.FlightReservation.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.FlightReservation.Model.FlightDetails;

public interface FlightDetailsRepository extends JpaRepository<FlightDetails , Long>{

	@Query("Select f from FlightDetails f where f.departureCity = :departureCity and f.arrivalCity = :arrivalCity and f.dateOfDeparture = :dateOfDeparture")
	List<FlightDetails> findFlights( @Param("departureCity")String from ,@Param("arrivalCity") String to,@Param("dateOfDeparture") Date dateOfDeparture);

}
