package com.cursoJavaUdemy.projeto_web_services.resourses;

import com.cursoJavaUdemy.projeto_web_services.entities.Order;
import com.cursoJavaUdemy.projeto_web_services.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderServices services;

    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        List<Order> list = services.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        Order obj = services.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}

