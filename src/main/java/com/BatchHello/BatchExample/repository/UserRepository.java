package com.BatchHello.BatchExample.repository;

import com.BatchHello.BatchExample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {



}
