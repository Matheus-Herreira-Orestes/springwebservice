package com.web_services.springwebservices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_services.springwebservices.repositories.OrderRepository;

import java.util.List;
import java.util.Optional;

import com.web_services.springwebservices.entities.Order;

@Service
public class OrderServices{

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
