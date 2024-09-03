package br.com.etechoracio.pw_study.repository;

import  br.com.etechoracio.pw_study.entitye.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;


/*classe que trabalha com acesssos no banco de dados*/
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {

}
