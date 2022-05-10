package br.com.io.ecommerce.catalogo.integration.impl;

import br.com.io.ecommerce.catalogo.domain.Produto;
import br.com.io.ecommerce.catalogo.gateway.CatalogoGateway;
import br.com.io.ecommerce.catalogo.integration.CatalogoRepository;
import br.com.io.ecommerce.catalogo.integration.converter.ProdutoModelToProdutoConverter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CatalogoGatewayImpl implements CatalogoGateway {

    private final CatalogoRepository repository;
    private final ProdutoModelToProdutoConverter toProdutoConverter;

    @Override
    public List<Produto> getProdutos() {
        return repository.findAll()
                .stream()
                .map(toProdutoConverter::convert)
                .collect(Collectors.toList());
    }

}
