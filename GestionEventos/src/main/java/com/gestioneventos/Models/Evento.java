package com.gestioneventos.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="evento")
@NoArgsConstructor
@Getter
@Setter
public class Evento {

    @Id
    @Column(name="id",nullable = false,length = 10)
    private String id;

    @Column(name="nombre",nullable = false,length = 45)
    private String nombre;

    @Column(name="tematica",nullable = false,length = 45)
    private String tematica;

    @Column(name = "duracion",nullable = false)
    private float duracion;

    @Column(name="reparto",nullable = false,length = 400)
    private String reparto;

    @Column(name="director",nullable = false,length = 45)
    private String director;

    @Column(name="descripcion",nullable = false,length = 200)
    private String descripcion;

    @Column(name="poster",nullable = false,length = 45)
    private String poster;


}
