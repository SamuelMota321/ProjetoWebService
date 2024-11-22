package com.cursoJavaUdemy.projeto_web_services.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@Entity
@Table(name = "Users")
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;


    // a notação abaixo não é obrigatória, fica apenas de exemplo para melhorar a ideia do relacionamento no banco de dados
    @JsonIgnore // com o 'JsonIgnore' no lado do usuário o comportamento será trazer com o pedido seu usuário
    @Getter
    @OneToMany(mappedBy = "client")
    private List<Order> orders = new ArrayList<>(); // quando a relação for uma collection(list), ela não terá ‘setters’ e nem estará no construtor

    public User(Long id, String name, String email, String phone, String password) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.id = id;
    }
}
