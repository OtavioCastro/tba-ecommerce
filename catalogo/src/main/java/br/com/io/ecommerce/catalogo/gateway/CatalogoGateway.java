package br.com.io.ecommerce.catalogo.gateway;

import br.com.io.ecommerce.catalogo.domain.Produto;

import java.util.List;

public interface CatalogoGateway {

    List<Produto> getProdutos();
    Produto getProduto(Long id);
}
