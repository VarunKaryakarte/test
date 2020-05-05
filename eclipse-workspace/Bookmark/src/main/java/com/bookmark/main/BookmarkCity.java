package com.bookmark.main;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Bookmark_city")
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
	private City city;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Bookmark bmt;

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

	/*g&s for book mark table */
	public Bookmark getBookmark() {
		return bmt;
	}

	public void setBookmark(Bookmark bmt) {
		this.bmt = bmt;
	}
	
	public BookmarkCity() {
		
	}
	
	public BookmarkCity(City city , Bookmark bmt) {
		this.city = city;
		this.bmt = bmt;
	}
}
