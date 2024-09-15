/*André e Eduardo*/
package br.com.etechoracio.pw_study.controller;


import br.com.etechoracio.pw_study.entitye.Monitor;
import br.com.etechoracio.pw_study.repository.MonitorRepository;
import br.com.etechoracio.pw_study.services.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/monitores")
@RestController
public class MonitorController {


    @Autowired
    MonitorService monitorService;

    @GetMapping
    public List<Monitor> listarMonitores(){
        return monitorService.listaMonitor();
    }

    @PostMapping
    public Monitor inserirMonitor(@RequestBody Monitor monitor){
        return  monitorService.inserirMonitor(monitor);
    }



}
