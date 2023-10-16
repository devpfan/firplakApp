package com.firplak.firplakApp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name="entregas")
public class Entrega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name="entrega_id")
    private Long entregaID;

    @ManyToOne
    @JoinColumn(name="pedido_id")
    @Getter
    @Setter
    private Pedido pedido;

    @Column(name="fecha_entrega")
    @Temporal(TemporalType.DATE)
    @Getter
    @Setter
    private Date fechaEntrega;

    @Column(name="firma_cliente")
    @Getter
    @Setter
    private String firmaCLiente;

    @Column(name="observaciones", columnDefinition = "TEXT")
    @Getter
    @Setter
    private String observaciones;

}
