package com.p1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.p1.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{

}
