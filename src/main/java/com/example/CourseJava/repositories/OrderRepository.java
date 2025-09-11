package com.example.CourseJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CourseJava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
