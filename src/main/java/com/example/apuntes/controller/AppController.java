package com.example.apuntes.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 Pasando parámetros entre paginas
    1.- Se crea un metodo y se anota con @PostMapping("/fin_formulario.html")
    2.- El metodo lleva los parametros anotados con @RequestParam
    2.1.- El nombre del parametro del @RequestParam coincide con el "name="nombre" del <input>
    2.2.- El primer parametro del model.addAttribute coincide con el ${nombre} en confirmacion.html
    3.- En los parametros se le pasa un objeto de tipo Model
    4.- En confirmacion.html se añade este espacio de nombre:
        <html lang="en" xmlns:th="http://www.thymeleaf.org">
    5.- Con el th del espacio de nombre, se recogen los parametros pasados en el post
    6.- El formulario lleva el metodo post
        <form action="/confirmacion.html" method="post">

 */

@Controller
public class AppController {

    @PostMapping("/confirmacion.html")
    public String mostrarConfirmacion(@RequestParam String nombre,
                                      @RequestParam String apellidos,
                                      @RequestParam int edad,
                                      Model model){
        model.addAttribute("nombre", nombre);
        model.addAttribute("apellidos", apellidos);
        model.addAttribute("edad", edad);

        return "confirmacion";
    }

    @GetMapping("/formulario")
    public String mostrarFormulario() {
        return "formulario";
    }

    @GetMapping("/index")
    public String mostrarIndex() {
        return "redirect:/index.html";
    }
}
