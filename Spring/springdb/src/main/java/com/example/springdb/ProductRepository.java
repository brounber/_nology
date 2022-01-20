package com.example.springdb;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springdb.entities.Product;

public interface ProductRepository extends JpaRepository<Long, Product> {
 
}
