package br.com.etechoracio.pw_study.services;

import br.com.etechoracio.pw_study.entitye.Disciplina;
import br.com.etechoracio.pw_study.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaRepository repository;

    public List<Disciplina> listar(){
        return repository.findAll();
    }

    public Optional<Disciplina> buscarPorId(Long id){
        return repository.findById(id);
    }
    public Disciplina cadastrarDisciplina(Disciplina disciplina){
        var existe = repository.findByNomeIgnoreCase(disciplina.getNome());
        if(!existe.isEmpty()){
            throw new RuntimeException("Nome da disciplina já cadastrado!");
        }
        return repository.save(disciplina);
    }

    public void exclude(Long id){
        repository.deleteById(id);
    }

}
