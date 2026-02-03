package com.web_services.springwebservices.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_services.springwebservices.entities.Product;
import com.web_services.springwebservices.services.ProductServices;


@RestController
@RequestMapping(value = "/products")
public class ProductResources {

    @Autowired
    private ProductServices services;

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){

        List<Product> list = services.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product obj = services.findById(id);
        return ResponseEntity.ok().body(obj);
    }
    
}
