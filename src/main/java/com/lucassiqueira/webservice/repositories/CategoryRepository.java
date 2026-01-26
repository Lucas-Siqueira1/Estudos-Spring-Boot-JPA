package com.lucassiqueira.webservice.repositories;

import com.lucassiqueira.webservice.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
