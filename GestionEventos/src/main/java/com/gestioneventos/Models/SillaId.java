package com.gestioneventos.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
public class SillaId implements Serializable {

    private String id;

    private Recinto nombre_recinto;


    private int id_seccion;


}
