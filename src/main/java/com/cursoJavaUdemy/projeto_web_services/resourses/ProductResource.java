package com.cursoJavaUdemy.projeto_web_services.resourses;

import com.cursoJavaUdemy.projeto_web_services.entities.Category;
import com.cursoJavaUdemy.projeto_web_services.entities.Product;
import com.cursoJavaUdemy.projeto_web_services.services.CategoryServices;
import com.cursoJavaUdemy.projeto_web_services.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/produtos")
public class ProductResource {

    @Autowired
    private ProductServices services;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = services.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product obj = services.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}

