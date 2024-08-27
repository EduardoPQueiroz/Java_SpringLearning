package br.com.etechoracio.pw_study.entitye;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Table(name = "TBL_MONITOR")
@Entity
public class Monitor {
    @Column(name = "ID_MONITOR")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMonitor;

    @Column(name = "TX_NOME")
    private String nomeTX;

    @Column(name = "TX_FOTO")
    private String foto;

    @Column(name = "TX_WHATSAPP")
    private String whatsapp;

    @Column(name = "TX_EMAIL")
    private String email;

    @Column(name = "TX_CONTEUDO")
    private String conteudo;

    @JoinColumn(name = "ID_DISCIPLINA")
    @ManyToOne
    private Disciplina disciplina;

    @ManyToMany
    @JoinTable(name = "TBL_REL_MONITOR_DISPONIBILIDADE",
            joinColumns = @JoinColumn(name = "ID_MONITOR"),
            inverseJoinColumns = @JoinColumn(name = "ID_DISPONIBILIDADE")
    )
    private List<Disponibilidade> idDisponibilidade;
}
