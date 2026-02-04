package com.web_services.springwebservices.repositories;

import com.web_services.springwebservices.entities.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
}
