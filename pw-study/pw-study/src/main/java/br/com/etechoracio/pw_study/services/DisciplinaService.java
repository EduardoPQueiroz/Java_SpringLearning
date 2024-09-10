package br.com.etechoracio.pw_study.services;

import br.com.etechoracio.pw_study.entitye.Disciplina;
import br.com.etechoracio.pw_study.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaRepository repository;

    public List<Disciplina> listar(){
        return repository.findAll();
    }

    public Disciplina cadastrarDisciplina(Disciplina disciplina){
        return repository.save(disciplina);
    }


}
