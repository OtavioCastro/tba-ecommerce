package br.com.io.ecommerce.catalogo.gateway;

import br.com.io.ecommerce.catalogo.domain.Produto;
import br.com.io.ecommerce.catalogo.domain.request.AddProdutoRequest;

import java.util.List;

public interface CatalogoGateway {

    List<Produto> getProdutos();
    Produto getProduto(Long id);
    Produto addProduto(AddProdutoRequest produtoRequest);
}
