package com.example.apuntes.controller;
import com.example.apuntes.model.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 Pasando un objeto de tipo "Persona" entre paginas
    1.- Se crea una clase "Persona"
    2.- Se pasa por parametro un objeto de tipo "Persona"
    3.- Se recoge el parametro en el html
            <p>Nombre: <span th:text="${persona.nombre}"></span></p>

 */

@Controller
public class AppController {

    @PostMapping("/confirmacion.html")
    public String mostrarConfirmacion(Persona persona,
                                      Model model){
        model.addAttribute("persona", persona);

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
