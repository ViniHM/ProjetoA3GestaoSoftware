package com.atividadeA3.sd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atividadeA3.sd.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}