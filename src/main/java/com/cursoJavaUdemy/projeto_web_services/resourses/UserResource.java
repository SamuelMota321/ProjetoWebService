package com.cursoJavaUdemy.projeto_web_services.resourses;

import com.cursoJavaUdemy.projeto_web_services.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class  UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "samuel", "samuel.mota.2010@gmail.com", "(61)99353-3322", "35221119");
        return ResponseEntity.ok().body(user);
    }
}
