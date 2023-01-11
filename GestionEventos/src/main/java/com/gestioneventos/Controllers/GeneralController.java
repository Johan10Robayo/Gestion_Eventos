package com.gestioneventos.Controllers;
import com.gestioneventos.Models.Evento;
import com.gestioneventos.ServiceRepo.FuncionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class GeneralController {

    @GetMapping("/inicio")
    public String principal (){

        return "index";
    }
    @GetMapping("/login")
    public String ligin (){

        return "login";
    }


}
