package com.example.project1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import sun.util.calendar.BaseCalendar.Date;
import lombok.EqualsAndHashCode;


@Entity
@Table(name = "faculty")
public class Faculty implements Serializable{

	
	private static final long serialVersionUID = 3449194012776616542L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long  id;
	
	@Column(name = "fac_name")
	@NotNull
	private String name;
	
	public String getName() {
		return name;
	}
	
	
	@Column(name = "fac_sub")
	@NotNull
	private String subject;

	@ManyToMany(mappedBy = "faculties")
	@JsonIgnore 
	public List<Student> student = new ArrayList<>();

	

	

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	
	public Faculty(String name , String sub) {
		this.name = name;
		this.subject = sub;
	}
	
	public Faculty() {
		
	}
	
	
	
}
