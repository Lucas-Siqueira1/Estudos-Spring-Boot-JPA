package com.lucassiqueira.webservice.repositories;

import com.lucassiqueira.webservice.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
