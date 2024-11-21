package com.cursoJavaUdemy.projeto_web_services.repositories;

import com.cursoJavaUdemy.projeto_web_services.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
