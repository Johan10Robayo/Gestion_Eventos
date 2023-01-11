package com.gestioneventos;

import com.gestioneventos.Models.Evento;
import com.gestioneventos.Repository.FuncionRepo;
import com.gestioneventos.ServiceRepo.FuncionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class GestionEventosApplication {


    public static void main(String[] args) {
        SpringApplication.run(GestionEventosApplication.class, args);


    }

}
