package com.nagmat.springweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagmat.springweb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
