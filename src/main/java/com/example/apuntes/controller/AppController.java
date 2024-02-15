package com.example.apuntes.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
 Volviendo al index.html desde formulario.html
 1.- Se crea un metodo que regrese al index.html

 - El atributo del GetMapping hace referencia al href="" del .html
 */

@Controller
public class AppController {

    @GetMapping("/formulario")
    public String mostrarFormulario() {
        return "formulario";
    }

    @GetMapping("/index")
    public String mostrarIndex() {
        return "redirect:/index.html";
    }
}
