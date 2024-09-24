package br.com.etechoracio.pw_study.controller;

import br.com.etechoracio.pw_study.entitye.Disciplina;
import br.com.etechoracio.pw_study.services.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/{id}")
    public ResponseEntity<Disciplina> buscarPorId(@PathVariable Long id){
        var existe = service.buscarPorId(id);
        if(existe.isPresent()){
            return ResponseEntity.ok(existe.get());
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            //return ResponseEntity.notFound().build();
        }
        //return service.buscarPorId(id).map(e -> ResponseEntity.ok(e))
        //        .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Disciplina cadastrar(@RequestBody Disciplina disciplina){
        return  service.cadastrarDisciplina(disciplina);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Disciplina> deletarDisciplina(@PathVariable Long id){
        var existe = service.buscarPorId(id);
        if(existe.isPresent()){
            service.exclude(id);
            return ResponseEntity.ok(existe.get());
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            //return ResponseEntity.notFound().build();
        }
    }

}
