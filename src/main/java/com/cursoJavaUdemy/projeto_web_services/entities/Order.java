package com.cursoJavaUdemy.projeto_web_services.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Orders")
public class Order implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant moment;

    // a notação Join sempre vai estar na tabela onde será colocada a chave estrangeira
    @ManyToOne
    @JoinColumn(name = "client_id")
//    @JsonIgnore // com o 'JsonIgnore' do lado do pedido o comportamento será trazer com o usuário os seus pedidos
    private User client;

}
