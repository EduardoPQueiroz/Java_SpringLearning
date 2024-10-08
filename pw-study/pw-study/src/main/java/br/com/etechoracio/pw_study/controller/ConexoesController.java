package br.com.etechoracio.pw_study.controller;

import br.com.etechoracio.pw_study.entitye.Conexoes;
import br.com.etechoracio.pw_study.services.ConexoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
