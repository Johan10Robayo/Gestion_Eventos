package com.gestioneventos.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="silla",uniqueConstraints = {
        @UniqueConstraint(columnNames = {"id_seccion","nombre_recinto"}),
        @UniqueConstraint(columnNames = {"id","nombre_recinto"})
})
@IdClass(SillaId.class)
@Getter
@Setter
@NoArgsConstructor
public class Silla {

    @Id
    @Column(name="id")
    private String id;

    @ManyToOne(cascade = {CascadeType.REMOVE, CascadeType.REFRESH})
    @JoinColumn(name = "nombre_recinto",referencedColumnName = "nombre")
    private Recinto nombre_recinto;

    @Id
    @Column(insertable=false, updatable=false)
    @JoinColumn(name = "id_seccion", referencedColumnName = "id")
    private int id_seccion;


    @ManyToOne(cascade = {CascadeType.REMOVE, CascadeType.REFRESH})
    @JoinColumns({
            @JoinColumn(name = "id_seccion",referencedColumnName = "id",nullable = false),
            @JoinColumn(name = "tipo_seccion",referencedColumnName = "tipo",nullable = false),
            @JoinColumn(name = "ancho_seccion",referencedColumnName = "ancho",nullable = false),
            @JoinColumn(name = "largo_seccion",referencedColumnName = "largo",nullable = false)
    })
    private Seccion seccion;

}
