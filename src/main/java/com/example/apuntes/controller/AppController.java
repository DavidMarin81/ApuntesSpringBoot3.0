package com.example.apuntes.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
 Navegando de una pagina a otra
 1.- Se anota la clase con @Controller
 2.- Se anota el metodo con GetMapping y se indica la ruta a donde navegar
 3.- El return hace referencia a la pagina .html
 4.- Se crea un archivo formulario.html en /templates
 5.- En el index, se pone un <a href> para navegar a formulario.html
 */

@Controller
public class AppController {

    @GetMapping("/formulario.html")
    public String mostrarFormulario() {
        return "formulario";
    }
}
