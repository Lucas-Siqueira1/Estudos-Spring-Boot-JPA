package com.lucassiqueira.webservice.repositories;

import com.lucassiqueira.webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
