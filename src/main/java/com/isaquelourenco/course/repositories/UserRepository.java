package com.isaquelourenco.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isaquelourenco.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
