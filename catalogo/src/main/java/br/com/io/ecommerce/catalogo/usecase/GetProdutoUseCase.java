package br.com.io.ecommerce.catalogo.usecase;

import br.com.io.ecommerce.catalogo.domain.Produto;

public interface GetProdutoUseCase {

    Produto execute(Long id);
}
