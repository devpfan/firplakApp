package com.firplak.firplakApp.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="documentosentrega")
public class DocumentoEntrega {

    @Id
    @Column(name="documento_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long documentoID;

    @ManyToOne
    @JoinColumn(name="guia_id")
    private GuiaTransporte guiaTransporte;

    @Column(name="fecha_entrega")
    @Temporal(TemporalType.DATE)
    private Date fechaEntrega;

    @Column(name="estado_documento")
    private String estadoDocumento;

}
