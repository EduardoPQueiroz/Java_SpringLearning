package br.com.etechoracio.pw_study.entitye;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "TBL_DISPONIBILIDADE")
public class Disponibilidade {
    @Column(name = "ID_DISPONIBILIDADE")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TX_DIA_SEMANA")
    private String diaSemana;

    @Column( name = "DT_DAS")
    private Timestamp dataDas;

    @Column(name = "DT_ATE")
    private Timestamp dataAte;


}
