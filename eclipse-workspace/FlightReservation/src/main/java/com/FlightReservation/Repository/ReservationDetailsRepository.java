package com.FlightReservation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.FlightReservation.Model.ReservationDetails;

public interface ReservationDetailsRepository extends JpaRepository<ReservationDetails,Long> {

	@Query("Select r from ReservationDetails r where r.id = :id") 
	ReservationDetails getEverything(@Param("id")Long id);

}
