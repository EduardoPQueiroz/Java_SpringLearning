package br.com.etechoracio.pw_study.repository;

import br.com.etechoracio.pw_study.entitye.Conexoes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConexoesRepository extends JpaRepository<Conexoes, Long> {
        List<Conexoes> findByIdConexao(Long id);
}
