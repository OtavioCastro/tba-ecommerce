package br.com.io.ecommerce.catalogo.usecase;

import br.com.io.ecommerce.catalogo.domain.Produto;

import java.util.List;

public interface GetProdutosUseCase {

    List<Produto> execute();
}
