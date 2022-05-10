package br.com.io.ecommerce.catalogo.usecase.impl;

import br.com.io.ecommerce.catalogo.domain.Produto;
import br.com.io.ecommerce.catalogo.gateway.CatalogoGateway;
import br.com.io.ecommerce.catalogo.usecase.GetProdutosUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GetProdutosUseCaseImpl implements GetProdutosUseCase {

    private final CatalogoGateway gateway;

    @Override
    public List<Produto> execute() {
        return gateway.getProdutos();
    }

}
