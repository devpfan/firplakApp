package com.firplak.firplakApp.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="guiastransporte")
public class GuiaTransporte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="guia_id")
    private Long guiaID;

    @Column(name="fecha_despacho")
    @Temporal(TemporalType.DATE)
    private Date fechaDespacho;

    @ManyToOne
    @JoinColumn(name="cliente_id")
    private Cliente cliente;

    @Column(name="destino")
    private String destino;

    @Column(name="estado_guia")
    private String estadoGuia;

}
