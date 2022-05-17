package br.com.io.ecommerce.catalogo.integration.impl;

import br.com.io.ecommerce.catalogo.domain.Produto;
import br.com.io.ecommerce.catalogo.domain.request.AddProdutoRequest;
import br.com.io.ecommerce.catalogo.gateway.CatalogoGateway;
import br.com.io.ecommerce.catalogo.integration.CatalogoRepository;
import br.com.io.ecommerce.catalogo.integration.converter.AddProdutoRequestToProdutoModelConverter;
import br.com.io.ecommerce.catalogo.integration.converter.ProdutoModelToProdutoConverter;
import br.com.io.ecommerce.catalogo.integration.model.ProdutoModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CatalogoGatewayImpl implements CatalogoGateway {

    private final CatalogoRepository repository;
    private final ProdutoModelToProdutoConverter toProdutoConverter;
    private final AddProdutoRequestToProdutoModelConverter toProdutoModelConverter;

    @Override
    public List<Produto> getProdutos() {
        return repository.findAll()
                .stream()
                .map(toProdutoConverter::convert)
                .collect(Collectors.toList());
    }

    @Override
    public Produto getProduto(Long id) {
        return repository.findById(id)
                .map(toProdutoConverter::convert)
                .orElseGet(Produto::new);
    }

    @Override
    public Produto addProduto(AddProdutoRequest produtoRequest) {
        final ProdutoModel produtoModel = toProdutoModelConverter.convert(produtoRequest);
        final ProdutoModel produtoToSave = repository.save(produtoModel);
        return toProdutoConverter.convert(produtoToSave);
    }
}
