package br.com.io.ecommerce.catalogo.domain.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddProdutoRequest {
    private String nome;
    private Integer quantidade;
    private Double valor;
    private String categoria;
}
