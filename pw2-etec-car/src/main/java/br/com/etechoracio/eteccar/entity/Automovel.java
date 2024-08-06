package br.com.etechoracio.eteccar.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_AUTOMOVEL")
public class Automovel {
    @Column(name = "ID_AUTOMOVEL")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAuto;

    @Column(name = "NR_ANO_FABRICACAO")
    private int anoFabric;

    @Column(name = "NR_ANO_MODELO")
    private int anoModelo;

    @Column(name = "TP_COMBUSTIVEL")
    private String tipoCombustivel;

    @Column(name = "NR_PRECO", columnDefinition = "NUMERIC")
    private double preco;

    @Column(name = "NR_KM_ATUAL")
    private int kmAtual;

    @Column(name = "ID_MODELO")
    private Long idModelo;

}
