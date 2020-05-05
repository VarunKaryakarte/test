package com.example.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "bookmark")
public class Bookmark implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "bookmark_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "bookmark_title")
	private String title;
	
	@Column(name = "user_id")
	private Long userId;
	
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "user_id")
//	private User user;
	
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY , mappedBy = "bookmark")
	@JsonIgnore
	private List<BookmarkCity> bmc = new ArrayList<>(); 
	
	
	/* G&S for bookmark Id */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/* G&S for user Id */
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	

	/* G&S for bookmark Title */
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

//	/* G&S for user */
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}

	/* G&S for BOOKMARK CITY */
	public List<BookmarkCity> getBookmarkcity() {
		return bmc;
	}

	public void setBookmarkcity(List<BookmarkCity> bmc) {
		this.bmc = bmc;
	}

	public Bookmark() {
		
	}
	
	public Bookmark(String title ) {
		this.title = title;	
	//	this.bmc = Stream.of(bmc).collect(Collectors.toList());
		}
}
