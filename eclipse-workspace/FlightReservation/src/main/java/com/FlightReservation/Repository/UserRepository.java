package com.FlightReservation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FlightReservation.Model.User;

public interface UserRepository extends JpaRepository<User , Long>{

	User getByEmail(String email);

}