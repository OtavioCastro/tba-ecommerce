package br.com.io.ecommerce.catalogo.controller.resources.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddProdutoRequestResource {
    private String nome;
    private Integer quantidade;
    private Double valor;
    private String categoria;
}
