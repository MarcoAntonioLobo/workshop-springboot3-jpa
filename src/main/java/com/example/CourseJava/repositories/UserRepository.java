package com.example.CourseJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CourseJava.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
