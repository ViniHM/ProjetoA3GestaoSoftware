package com.atividadeA3.sd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atividadeA3.sd.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}