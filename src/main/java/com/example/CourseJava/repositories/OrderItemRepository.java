package com.example.CourseJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.CourseJava.entities.OrderItem;
import com.example.CourseJava.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
