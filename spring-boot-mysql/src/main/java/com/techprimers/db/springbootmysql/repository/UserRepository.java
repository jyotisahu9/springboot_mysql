package com.techprimers.db.springbootmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techprimers.db.springbootmysql.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{

}
