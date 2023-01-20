package com.example.postgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.postgresql.model.Product;

// JPA repository : already defined API in the data JPA and we can use it in order to query our model and DB; it is already annotated with @Repository in the JPA
public interface ProductRepository extends JpaRepository<Product, Long>{

}
