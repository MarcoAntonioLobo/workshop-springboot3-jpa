package com.example.CourseJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CourseJava.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
