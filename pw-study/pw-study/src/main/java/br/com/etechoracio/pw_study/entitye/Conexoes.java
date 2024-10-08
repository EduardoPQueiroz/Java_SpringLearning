package br.com.etechoracio.pw_study.entitye;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "TBL_CONEXAO")
@Getter
@Setter
public class Conexoes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CONEXAO")
    private Long id;

    @Column(name = "DT_CRIACAO")
    private LocalDateTime dataCriacao;

    @JoinColumn(name = "ID_MONITOR")
    @ManyToOne
    private Monitor monitor;


}
