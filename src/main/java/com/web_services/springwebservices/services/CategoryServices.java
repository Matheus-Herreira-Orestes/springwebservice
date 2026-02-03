package com.web_services.springwebservices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_services.springwebservices.repositories.CategoryRepository;

import java.util.List;
import java.util.Optional;

import com.web_services.springwebservices.entities.Category;

@Service
public class CategoryServices{

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
