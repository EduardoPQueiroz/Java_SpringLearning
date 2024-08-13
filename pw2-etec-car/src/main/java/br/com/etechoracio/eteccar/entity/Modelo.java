package br.com.etechoracio.eteccar.entity;

import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_MODELO")
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MODELO")
    private Long id;

    @Column(name = "TX_NOME")
    private String nome;

    @Column(name = "NR_POTENCIA", columnDefinition = "numeric")
    private Double potencia;

    @JoinColumn(name = "ID_MARCA")
    @ManyToOne
    private Marca marca;

    /*
     aqui tem de fazer o foreign key
     */

}
