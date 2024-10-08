/*André Eduardo*/
package br.com.etechoracio.pw_study.repository;

import br.com.etechoracio.pw_study.entitye.Disciplina;
import br.com.etechoracio.pw_study.entitye.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MonitorRepository extends JpaRepository<Monitor, Long> {
    List<Monitor> findByEmail(String email);
    List<Monitor> findByWhatsapp(String whatsapp);
    Optional<Monitor> findById(Long id);
    Optional<Monitor> findByDisciplina(Disciplina disciplina);
}
