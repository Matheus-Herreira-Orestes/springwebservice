package com.web_services.springwebservices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.web_services.springwebservices.repositories.UserRepository;
import com.web_services.springwebservices.services.exceptions.DatabaseException;
import com.web_services.springwebservices.services.exceptions.ResourceNotFoundException;

import java.util.List;
import java.util.Optional;

import com.web_services.springwebservices.entities.User;

@Service
public class UserServices{

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException(id);
        }
        try{
            repository.deleteById(id);

        }catch(DataIntegrityViolationException e){
            throw new DatabaseException(e.getMessage());
        }
    }

    public User update (Long id, User obj){
        User entity = repository.getReferenceById(id);
        UpdateData(entity,obj);
        return repository.save(entity);
    }

    private void UpdateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
