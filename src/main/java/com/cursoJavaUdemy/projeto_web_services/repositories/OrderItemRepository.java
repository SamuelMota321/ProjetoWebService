package com.cursoJavaUdemy.projeto_web_services.repositories;

import com.cursoJavaUdemy.projeto_web_services.entities.Category;
import com.cursoJavaUdemy.projeto_web_services.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {}
