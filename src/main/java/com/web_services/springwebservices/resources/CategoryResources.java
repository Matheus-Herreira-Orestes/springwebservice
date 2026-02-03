package com.web_services.springwebservices.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_services.springwebservices.entities.Category;
import com.web_services.springwebservices.services.CategoryServices;


@RestController
@RequestMapping(value = "/categories")
public class CategoryResources {

    @Autowired
    private CategoryServices services;

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){

        List<Category> list = services.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        Category obj = services.findById(id);
        return ResponseEntity.ok().body(obj);
    }
    
}
