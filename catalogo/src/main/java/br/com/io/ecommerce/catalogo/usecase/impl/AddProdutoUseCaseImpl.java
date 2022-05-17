package br.com.io.ecommerce.catalogo.usecase.impl;

import br.com.io.ecommerce.catalogo.domain.Produto;
import br.com.io.ecommerce.catalogo.domain.request.AddProdutoRequest;
import br.com.io.ecommerce.catalogo.gateway.CatalogoGateway;
import br.com.io.ecommerce.catalogo.usecase.AddProdutoUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AddProdutoUseCaseImpl implements AddProdutoUseCase {

    private final CatalogoGateway gateway;

    @Override
    public Produto execute(AddProdutoRequest produtoRequest) {
        return gateway.addProduto(produtoRequest);
    }

}
