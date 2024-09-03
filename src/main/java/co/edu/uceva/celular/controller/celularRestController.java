package co.edu.uceva.celular.controller;


import co.edu.uceva.celular.model.entities.Celular;
import co.edu.uceva.celular.model.service.CelularServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/celular")
public class celularRestController {

    @Autowired
    private CelularServiceImpl celularService;

    @GetMapping("/Celulares")
    public List<Celular> listar(){
        return this.celularService.listar();
    }

    @GetMapping("/Celulares/{id}")
    public Celular buscarCellPorId(@PathVariable long id) {
        return this.celularService.findById(id);
    }

    @PostMapping("/celular")
    public Celular guardarCell(@RequestBody Celular celular) {
        return this.celularService.save(celular);
    }

    @PutMapping("/celular")
    public Celular actualizarCell(@RequestBody Celular celular) {
        return this.celularService.save(celular);
    }

    @DeleteMapping("/Celulares/{id}")
    public Celular eliminarCell(@PathVariable long id) {
        return this.celularService.findById(id);
    }






}
