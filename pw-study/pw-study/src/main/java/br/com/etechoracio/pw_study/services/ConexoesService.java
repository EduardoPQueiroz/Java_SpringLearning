package br.com.etechoracio.pw_study.services;

import br.com.etechoracio.pw_study.entitye.Conexoes;
import br.com.etechoracio.pw_study.entitye.Monitor;
import br.com.etechoracio.pw_study.repository.ConexoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConexoesService {
    @Autowired
    private ConexoesRepository conexoesRepository;
    public Long contar(){
        return conexoesRepository.count();
    }

//    public Conexoes inserirConexao(Monitor monitor){
//        return conexoesRepository.save(monitor);
//    }

}
