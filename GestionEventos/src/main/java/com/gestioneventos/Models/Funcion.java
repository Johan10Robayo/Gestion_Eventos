package com.gestioneventos.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;

@Entity
@Table(name="funcion",uniqueConstraints = {
        @UniqueConstraint(columnNames = {"id_evento", "fecha","hora"})
})

@NoArgsConstructor
@Getter
@Setter
public class Funcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_evento")
    private Evento evento;

    @Column(name = "fecha",nullable = false)
    private Date fecha;

    @Column(name = "hora",nullable = false)
    private Time hora;

    @Column(name = "descripcion",nullable = false,length = 45)
    private String descripcion;

    public Long getId() {
        return id;
    }

}
