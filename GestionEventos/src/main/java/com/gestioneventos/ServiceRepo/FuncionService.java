package com.gestioneventos.ServiceRepo;

import com.gestioneventos.Models.Evento;

import java.util.List;

public interface FuncionService {

    public List<Evento> findCartelera(String tipo);
}
