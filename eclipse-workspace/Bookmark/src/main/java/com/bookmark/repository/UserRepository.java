package com.bookmark.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookmark.main.User;



public interface UserRepository extends JpaRepository <User , Long>{

}
