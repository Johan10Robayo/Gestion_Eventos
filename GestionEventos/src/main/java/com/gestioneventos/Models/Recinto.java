package com.gestioneventos.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="recinto")
@NoArgsConstructor
@Getter
@Setter
public class Recinto {

    @Id
    @Column(name="nombre",length = 50)
    private String nombre;
    @Column(name="tipo",nullable = false,length = 20)
    private String tipo;


}
