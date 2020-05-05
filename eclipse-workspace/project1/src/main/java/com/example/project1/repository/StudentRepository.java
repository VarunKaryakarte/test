package com.example.project1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project1.Student;

public interface StudentRepository extends JpaRepository< Student , Long> {

}

