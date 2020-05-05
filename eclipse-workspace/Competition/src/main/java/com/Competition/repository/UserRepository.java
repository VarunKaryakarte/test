package com.Competition.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Competition.entity.User;

public interface UserRepository extends JpaRepository<User , Long> {

}
