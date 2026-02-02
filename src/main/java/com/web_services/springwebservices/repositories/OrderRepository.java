package com.web_services.springwebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web_services.springwebservices.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
