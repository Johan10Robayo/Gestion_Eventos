package com.gestioneventos.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Embeddable
@NoArgsConstructor
@Getter
@Setter
public class SeccionId implements Serializable {

    @Column(name="id")
    private int id;

    @Column(name="tipo",length = 10)
    private String tipo;

    @Column(name="ancho")
    private int ancho;

    @Column(name="largo")
    private int largo;

}
