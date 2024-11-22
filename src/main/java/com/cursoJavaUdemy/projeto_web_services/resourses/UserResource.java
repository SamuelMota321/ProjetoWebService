package com.cursoJavaUdemy.projeto_web_services.resourses;

import com.cursoJavaUdemy.projeto_web_services.entities.User;
import com.cursoJavaUdemy.projeto_web_services.repositories.UserRepository;
import com.cursoJavaUdemy.projeto_web_services.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @Autowired
    private UserServices services;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = services.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User obj = services .findById(id);
        return ResponseEntity.ok().body(obj);
    }
}

