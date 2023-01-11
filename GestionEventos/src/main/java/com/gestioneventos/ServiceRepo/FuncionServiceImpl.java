package com.gestioneventos.ServiceRepo;

import com.gestioneventos.Models.Evento;
import com.gestioneventos.Repository.FuncionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionServiceImpl implements FuncionService {

    @Autowired
    FuncionRepo funcionRepo;

    @Override
    public List<Evento> findCartelera(String tipo) {

         return funcionRepo.findCartelera(tipo);
    }
}
