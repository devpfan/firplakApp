package com.firplak.firplakApp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CollectionId;

@Entity
public class Cliente {

    @Id
    @Getter
    @Setter
    private long cliente_id;

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


}
