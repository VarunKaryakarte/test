package com.FlightReservation.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
public class AbstractClass {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
}