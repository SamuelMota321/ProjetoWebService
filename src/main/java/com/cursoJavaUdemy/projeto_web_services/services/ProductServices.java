package com.cursoJavaUdemy.projeto_web_services.services;

import com.cursoJavaUdemy.projeto_web_services.entities.Category;
import com.cursoJavaUdemy.projeto_web_services.entities.Product;
import com.cursoJavaUdemy.projeto_web_services.repositories.CategoryRepository;
import com.cursoJavaUdemy.projeto_web_services.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServices {
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}