package br.com.io.ecommerce.catalogo.integration.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUTO")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoModel {
    @Id
    private Long id;
    private String nome;
    private Integer quantidade;
    private Double valor;
    private String categoria;
}
