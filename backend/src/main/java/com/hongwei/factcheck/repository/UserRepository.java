package com.hongwei.factcheck.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hongwei.factcheck.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
