package br.com.etechoracio.pw_study.entitye;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "TBL_DISCIPLINA")
@Entity
@Getter
@Setter
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DISCIPLINA")
    private Long id;

    @Column(name = "TX_NOME")
    private String nome;

}
