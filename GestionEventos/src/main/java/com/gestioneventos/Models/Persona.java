package com.gestioneventos.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Entity
@Table(name = "persona")
@NoArgsConstructor
@Getter
@Setter
public class Persona {

    @Id
    @Column(name = "id", length = 20)
    private String id;



    @Column(name = "tipo_documento", nullable = false, length = 30)
    private String tipo_documento;

    @Column(name = "nombres", nullable = false, length = 30)
    private String nombres;
    @Column(name = "apellidos", nullable = false, length = 45)
    private String apellidos;
    @Column(name = "celular", nullable = false, length = 20)
    private String celular;


}
