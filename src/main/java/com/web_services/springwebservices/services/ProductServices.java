package com.web_services.springwebservices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_services.springwebservices.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

import com.web_services.springwebservices.entities.Product;

@Service
public class ProductServices{

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
