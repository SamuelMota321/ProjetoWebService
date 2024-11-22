package com.cursoJavaUdemy.projeto_web_services.repositories;

import com.cursoJavaUdemy.projeto_web_services.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}
