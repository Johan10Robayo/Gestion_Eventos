package com.gestioneventos.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;


@Entity
@Table(name="cuenta")
@NoArgsConstructor
@Getter
@Setter
public class Cuenta {
    @Id
    @Column(name = "correo", nullable = false, length = 30)
    private String correo;


    @ManyToOne(cascade = {CascadeType.REMOVE, CascadeType.REFRESH})
    @JoinColumn(name = "id_persona")
    private Persona persona;

    @Column(name = "tipo", nullable = false, length = 45)
    private String tipo;


    @Column(name = "password", nullable = false, length = 300)
    private String password;

}
