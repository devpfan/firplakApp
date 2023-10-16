package com.firplak.firplakApp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name ="clientes")
public class Cliente {

    @Id
    @Getter
    @Setter
    private Long cliente_id;

    @Getter
    @Setter
    @Column
    private String nombre_cliente;

    @Getter
    @Setter
    @Column
    private String telefono;

    @Getter
    @Setter
    @Column
    private String correo;

    @Getter
    @Setter
    @Column
    private String direccion;

    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos;
}
