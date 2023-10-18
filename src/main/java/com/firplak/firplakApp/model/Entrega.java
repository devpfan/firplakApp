package com.firplak.firplakApp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

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
    @JsonIgnore
    @Getter
    @Setter
    private Pedido pedido;

    @Column(name="fecha_entrega")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Getter
    @Setter
    private Date fechaEntrega;

    @Column(name="firma_cliente")
    @Getter
    @Setter
    private String firmaCliente;

    @Column(name="observaciones", columnDefinition = "TEXT")
    @Getter
    @Setter
    private String observaciones;

}
