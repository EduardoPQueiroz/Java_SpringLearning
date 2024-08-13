package br.com.etechoracio.eteccar.entity;

import br.com.etechoracio.eteccar.enums.TipoCombustivelEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

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
    @Enumerated(EnumType.STRING)
    private TipoCombustivelEnum tipoCombustivel;

    @Column(name = "NR_PRECO", columnDefinition = "NUMERIC")
    private Double preco;

    @Column(name = "NR_KM_ATUAL")
    private int kmAtual;

    @JoinColumn(name = "ID_MODELO")
    @ManyToOne
    private Modelo modelo;

    @Transient
    private List<Acessorio> acessorios;
}
