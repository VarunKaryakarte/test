package com.example.model;

import java.util.TimeZone;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import sun.util.calendar.BaseCalendar.Date;

@Entity
@Table(name = "city")
public class City implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4363394669323957472L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name ="city_name")
	private String name;
	
	@Column(name = "country")
	private String country;
	
//	@Column(name = "cre_date")
//	private Date date;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "city")
	@JsonIgnore
	private List<BookmarkCity> bmc = new ArrayList<>();

	/* g&s for id */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/*g&s for city */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/* g&s for country */
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

//	/*g&s for date */
//	public Date getDate() {
//		return date;
//	}
//
//	public void setDate(Date date) {
//		this.date = date;
//	}
//	

	/*g&s for bookmarkcity */
	public List<BookmarkCity> getBmc() {
		return bmc;
	}

	public void setBmc(List<BookmarkCity> bmc) {
		this.bmc = bmc;
	}
	
	public City() {
		
	}

	public City(String name , String country, BookmarkCity...bmc) {
		this.name = name;
		this.country = country;
	//	this.date = date;
		this.bmc = Stream.of(bmc).collect(Collectors.toList());
	}
}
