package com.gestioneventos.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GeneralController {

    @GetMapping("/inicio")
    public String principal (){

        return "index";
    }


}
