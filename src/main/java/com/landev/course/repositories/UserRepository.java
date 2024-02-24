package com.landev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.landev.course.entities.User;

public interface  UserRepository extends JpaRepository<User,Long> {
	
}