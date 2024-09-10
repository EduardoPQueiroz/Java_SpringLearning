package br.com.etechoracio.pw_study.controller;

import br.com.etechoracio.pw_study.entitye.Disciplina;
import br.com.etechoracio.pw_study.services.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*essa classe é uma ouvinte de requisicoes http*/
@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {
    @Autowired
    private DisciplinaService service;

    @GetMapping
    public List<Disciplina> listar(){
        return service.listar();
    }

    @PostMapping
    public Disciplina cadastrar(@RequestBody Disciplina disciplina){
        return  service.cadastrarDisciplina(disciplina);
    }
}
