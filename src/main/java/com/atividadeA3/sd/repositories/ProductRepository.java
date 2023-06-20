package com.atividadeA3.sd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atividadeA3.sd.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}