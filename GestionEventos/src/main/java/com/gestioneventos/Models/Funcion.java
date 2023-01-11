package com.gestioneventos.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;

@Entity
@Table(name="funcion",uniqueConstraints = {
        @UniqueConstraint(columnNames = {"id_evento", "nombre_recinto","fecha","hora"})
})

@NoArgsConstructor
@Getter
@Setter
public class Funcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(cascade = {CascadeType.REMOVE, CascadeType.REFRESH})
    @JoinColumn(name = "id_evento")
    private Evento evento;
    @ManyToOne(cascade = {CascadeType.REMOVE, CascadeType.REFRESH})
    @JoinColumn(name = "nombre_recinto")
    private Recinto recinto;
    @Column(name = "fecha",nullable = false)
    private Date fecha;

    @Column(name = "hora",nullable = false)
    private Time hora;

    @Column(name = "descripcion",nullable = false,length = 45)
    private String descripcion;

    @Column(name = "precio",nullable = false)
    private int precio;



}
