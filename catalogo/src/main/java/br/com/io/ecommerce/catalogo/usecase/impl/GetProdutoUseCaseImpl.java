package br.com.io.ecommerce.catalogo.usecase.impl;

import br.com.io.ecommerce.catalogo.domain.Produto;
import br.com.io.ecommerce.catalogo.gateway.CatalogoGateway;
import br.com.io.ecommerce.catalogo.usecase.GetProdutoUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetProdutoUseCaseImpl implements GetProdutoUseCase {

    private final CatalogoGateway gateway;

    @Override
    public Produto execute(Long id) {
        return gateway.getProduto(id);
    }

}
