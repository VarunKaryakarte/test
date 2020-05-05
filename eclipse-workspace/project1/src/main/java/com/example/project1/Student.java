package com.example.project1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;



@Entity
@Table(name ="student")
//@EntityListeners(AuditingEntityListener.class)
@ToString
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long stu_id;
	
	
	@Column(name = "stu_name")
	//@NotNull
	private String stu_name;
	
	@Column(name = "grade")
	//@NotNull
	private int stu_class;

	 @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	 @JoinTable(name = "stu_fac" , 
	 joinColumns = @JoinColumn(name = "stuId", referencedColumnName = "stu_id") , 
	 inverseJoinColumns = @JoinColumn(name = "facId" , referencedColumnName = "id"))
	 private List<Faculty> faculties = new ArrayList<>();

	public List<Faculty> getFaculty() {
		return faculties;
	}

	public void setFaculty(List<Faculty> faculties) {
		this.faculties = faculties;
	}

	public Long getStu_id() {
		return stu_id;
	}

	public void setStu_id(Long stu_id) {
		this.stu_id = stu_id;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public int getStu_class() {
		return stu_class;
	}

	public void setStu_class(int stu_class) {
		this.stu_class = stu_class;
	}
	
	public Student() {
		
	}
	
	public Student (String name , int cls , Faculty... faculties) {
		this.stu_name = name;
		this.stu_class = cls;
		this.faculties =  Stream.of(faculties).collect(Collectors.toList());
		//this.faculties.forEach(x -> x.getStudent().add(this));
		
	}
	
	
}