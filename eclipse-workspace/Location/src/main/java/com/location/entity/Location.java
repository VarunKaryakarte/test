package com.location.entity;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "location")
public class Location {

		@Column(name = "location_id")
		private Long id;
		
		@Column(name = "location_name")
		private String locationName;
		
		@Column(name = "location_type")
		private String type;
		
		@Column(name = "created_time")
		@CreationTimestamp
		private ZonedDateTime createdDate;
		
		
		
	
}
