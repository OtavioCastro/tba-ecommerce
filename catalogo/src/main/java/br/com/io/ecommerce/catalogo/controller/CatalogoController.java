package br.com.io.ecommerce.catalogo.controller;

import br.com.io.ecommerce.catalogo.controller.converter.ProdutoToProdutoResourceConverter;
import br.com.io.ecommerce.catalogo.controller.resources.ProdutoResource;
import br.com.io.ecommerce.catalogo.domain.Produto;
import br.com.io.ecommerce.catalogo.usecase.GetProdutoUseCase;
import br.com.io.ecommerce.catalogo.usecase.GetProdutosUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@AllArgsConstructor
public class CatalogoController {

    private final GetProdutosUseCase getProdutosUseCase;
    private final GetProdutoUseCase getProdutoUseCase;
    private final ProdutoToProdutoResourceConverter toProdutoResourceConverter;

    public List<ProdutoResource> getProdutos() {
        return getProdutosUseCase.execute()
                .stream()
                .map(toProdutoResourceConverter::convert)
                .collect(Collectors.toList());
    }

    public ProdutoResource getProduto(Long id){
        final Produto produto = getProdutoUseCase.execute(id);
        return toProdutoResourceConverter.convert(produto);
    }
}
