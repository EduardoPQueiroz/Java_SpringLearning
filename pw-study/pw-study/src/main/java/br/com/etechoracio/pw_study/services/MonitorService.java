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
        return monitorRepository.save(monitor);
    }

}
