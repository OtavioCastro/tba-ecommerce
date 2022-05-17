package br.com.io.ecommerce.catalogo.usecase;

import br.com.io.ecommerce.catalogo.domain.Produto;
import br.com.io.ecommerce.catalogo.domain.request.AddProdutoRequest;

public interface AddProdutoUseCase {
    Produto execute(AddProdutoRequest produtoRequest);
}
