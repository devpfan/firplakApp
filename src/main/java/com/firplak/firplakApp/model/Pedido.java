package com.firplak.firplakApp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Entity
@Table(name="pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    @Getter
    private long pedido_id;

    @Setter
    @Getter
    @Column
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date fecha_pedido;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    @Setter
    @Getter
    private Cliente cliente;//mapeo de la relacion para facilitar el acceso y las operaciones posteriores


    @Setter
    @Getter
    @Column
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date fecha_entrega;

    @Setter
    @Getter
    @Column
    private String estado_pedido;

}
