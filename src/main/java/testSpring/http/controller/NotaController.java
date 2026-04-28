package testSpring.http.controller;


import testSpring.http.model.Nota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import testSpring.http.service.NotaService;

@Controller
@RequestMapping("/notas")
public class NotaController {

    @Autowired
    private NotaService service;

    // GET → ver lista
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("notas", service.listar());
        return "notas";
    }

    // GET → mostrar formulario
    @GetMapping("/nueva")
    public String nueva(Model model) {
        model.addAttribute("nota", new Nota());
        return "formulario";
    }

    // POST → guardar nota
    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Nota nota) {
        service.guardar(nota);
        return "redirect:/notas";
    }

    // DELETE simulado con GET
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        service.eliminar(id);
        return "redirect:/notas";
    }

}
