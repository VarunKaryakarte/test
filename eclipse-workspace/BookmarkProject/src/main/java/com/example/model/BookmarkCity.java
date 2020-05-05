package com.example.model;


import java.io.Serializable;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import sun.util.calendar.BaseCalendar.Date;
@Entity
@Table(name = "bookmark_city")
public class BookmarkCity implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4562457745110222847L;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "city_id" , nullable = false)
	private City city;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bookmark_id" , nullable = false)
	@JsonIgnore
	private Bookmark bookmark;
	
	
	@Column(name = "creation_date", nullable = false)
	@CreationTimestamp
	private ZonedDateTime creationDate;

	/* g&s for id */
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	

	/*g&s for city */
	public City getCity() {
		return city;
	}
	
	public void setCity(City city) {
		this.city = city;
	}

	/* G&S for date */
	public ZonedDateTime getCreationDate() {
		return creationDate;
	}


	public void setCreationDate(ZonedDateTime creationDate) {
		this.creationDate = creationDate;
	}


	

	/*g&s for book mark table */
	public Bookmark getBookmark() {
		return bookmark;
	}

	public void setBookmark(Bookmark bmt) {
		this.bookmark = bmt;
	}
	
	public BookmarkCity() {
		
	}
	
	public BookmarkCity(City city , Bookmark bmt) {
		this.city = city;
		this.bookmark = bmt;
	}
}
