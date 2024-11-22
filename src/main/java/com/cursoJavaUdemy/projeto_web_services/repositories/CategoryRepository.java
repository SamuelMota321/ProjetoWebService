package com.cursoJavaUdemy.projeto_web_services.repositories;

import com.cursoJavaUdemy.projeto_web_services.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {}
