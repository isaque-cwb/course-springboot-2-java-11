package com.isaquelourenco.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isaquelourenco.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
