package br.com.etechoracio.pw_study.repository;

import br.com.etechoracio.pw_study.entitye.Conexoes;
import br.com.etechoracio.pw_study.entitye.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface ConexoesRepository extends JpaRepository<Conexoes, Long> {
        Optional<Conexoes> findByMonitor(Monitor monitor);
}
