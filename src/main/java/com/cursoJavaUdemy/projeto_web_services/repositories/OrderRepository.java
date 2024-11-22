package com.cursoJavaUdemy.projeto_web_services.repositories;

import com.cursoJavaUdemy.projeto_web_services.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {}
