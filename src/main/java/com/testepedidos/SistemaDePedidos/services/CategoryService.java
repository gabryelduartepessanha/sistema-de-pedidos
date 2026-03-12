package com.testepedidos.SistemaDePedidos.services;

import com.testepedidos.SistemaDePedidos.entities.Category;
import com.testepedidos.SistemaDePedidos.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> objs = repository.findById(id);
        return objs.get();
    }
}
