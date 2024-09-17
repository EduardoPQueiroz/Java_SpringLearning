/*André Eduardo*/
package br.com.etechoracio.pw_study.services;


import br.com.etechoracio.pw_study.entitye.Monitor;
import br.com.etechoracio.pw_study.repository.MonitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonitorService {

    @Autowired
    MonitorRepository monitorRepository;


    public List<Monitor> listaMonitor(){
        return monitorRepository.findAll();
    }



    public Monitor inserirMonitor(Monitor monitor){
        var existeWhats = monitorRepository.findByWhatsapp(monitor.getWhatsapp());
        var exiteEmail = monitorRepository.findByEmail(monitor.getEmail());
        if(!existeWhats.isEmpty()){
            throw new RuntimeException("O número de zap já foi cadastrado!");
        } else if (!exiteEmail.isEmpty()) {
            throw new RuntimeException("O email inserido já foi cadastrado!");
        }
        return monitorRepository.save(monitor);
    }

}
