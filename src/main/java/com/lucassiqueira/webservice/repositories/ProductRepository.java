package com.lucassiqueira.webservice.repositories;

import com.lucassiqueira.webservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
