package br.com.etechoracio.eteccar.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "TBL_ACESSORIO")
public class Acessorio {
    @Column(name = "ID_ACESSORIO")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAcessorio;

    @Column(name = "TX_DESCRICAO")
    private String textoDesc;
}
