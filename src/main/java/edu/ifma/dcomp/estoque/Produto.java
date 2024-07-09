package edu.ifma.dcomp.estoque;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;



@Entity
public @Data class Produto {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String descricao;

    @Column(name = "preco_atual")
    private BigDecimal precoAtual;
}
