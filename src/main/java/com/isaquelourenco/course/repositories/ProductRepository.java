package com.isaquelourenco.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isaquelourenco.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
