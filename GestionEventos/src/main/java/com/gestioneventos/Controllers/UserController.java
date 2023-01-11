package com.gestioneventos.Controllers;


import com.gestioneventos.Models.Evento;
import com.gestioneventos.ServiceRepo.FuncionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private FuncionService funcionService;

    @GetMapping("/registro")
    public  String registro (){

        return "user/registro";
    }
    @GetMapping("/eventos_teatro")
    public String carteleraTeatros(Model modelo){

        List<Evento> eventos = funcionService.findCartelera("teatro");

        modelo.addAttribute("eventos",eventos);

        return "user/carteleras";
    }

    @GetMapping("/eventos_auditorio")
    public String carteleraAuditorios(Model modelo){

        List<Evento> eventos = funcionService.findCartelera("auditorio");

        modelo.addAttribute("eventos",eventos);

        return "user/carteleras";
    }


}
