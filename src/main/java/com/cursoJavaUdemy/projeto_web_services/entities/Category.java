package com.cursoJavaUdemy.projeto_web_services.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Categorias")
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Category implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "categories")
    private final Set<Product> products = new HashSet<>();

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
