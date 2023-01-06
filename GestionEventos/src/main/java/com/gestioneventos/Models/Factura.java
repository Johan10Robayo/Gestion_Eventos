package com.gestioneventos.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="factura")
public class Factura {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "correo_cuenta",referencedColumnName = "correo",nullable = false)
    private Cuenta cuenta;

    @ManyToOne
    @JoinColumn(name = "id_funcion",referencedColumnName = "id",nullable = false)
    private Funcion funcion;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "id_silla",referencedColumnName = "id",nullable = false),
            @JoinColumn(name = "nombre_recinto",referencedColumnName = "nombre_recinto",nullable = false),
            @JoinColumn(name = "id_seccion",referencedColumnName = "id_seccion",nullable = false),
    })
    private Silla silla;

    @Column(name="valor",nullable = false)
    private float valor;
}
