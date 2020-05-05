package com.FlightReservation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FlightReservation.Model.PassengerDetails;

public interface PassengerDetailsRepository extends JpaRepository<PassengerDetails, Long>{

}

