package com.bookmark.main;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name  = "user")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3868269731826822792L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Long id;
	
	@Column(name = "user_name")
	private String name;
	
	@Column(name = "user_email")
	private String email;

//	@OneToMany(fetch = FetchType.LAZY ,mappedBy = "user")
//	private List<Bookmark> bmt = new ArrayList<>();
	
	/* G&S for id */
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	/* G&S for Name */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/* G&S for email */
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	/* G&S for BookMarkTable */
	
//	public List<Bookmark> getBmt() {
//		return bmt;
//	}
//
//	public void setBmt(List<Bookmark> bmt) {
//		this.bmt = bmt;
//	}
	
	public User() {
		
	}
	
	public User(String name , String email , Bookmark...bmt ) {
		this.name = name;
		this.email = email;
		//this.bmt = Stream.of(bmt).collect(Collectors.toList());
	}

}
