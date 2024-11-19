package br.com.etechoracio.pw_study.controller;

import br.com.etechoracio.pw_study.entitye.Conexoes;
import br.com.etechoracio.pw_study.entitye.Monitor;
import br.com.etechoracio.pw_study.services.ConexoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conexoes")
public class ConexoesController {
    @Autowired
    private ConexoesService service;
    @GetMapping
    public Long contar(){
        return service.contar();
    }

    @PostMapping
    public Conexoes inserirConexao(@RequestBody Monitor monitor){return service.inserirConexao(monitor);}
}
