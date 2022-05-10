package br.com.io.ecommerce.catalogo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Produto {
    @JsonProperty("codigo")
    private Long id;
    private String nome;
    private Integer quantidade;
    private Double valor;
    private String categoria;
}

