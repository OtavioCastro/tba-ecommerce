package br.com.io.ecommerce.catalogo.controller;

import br.com.io.ecommerce.catalogo.controller.converter.AddProdutoRequestResourceToAddProdutoRequestConverter;
import br.com.io.ecommerce.catalogo.controller.converter.ProdutoToProdutoResourceConverter;
import br.com.io.ecommerce.catalogo.controller.resources.ProdutoResource;
import br.com.io.ecommerce.catalogo.controller.resources.request.AddProdutoRequestResource;
import br.com.io.ecommerce.catalogo.domain.Produto;
import br.com.io.ecommerce.catalogo.domain.request.AddProdutoRequest;
import br.com.io.ecommerce.catalogo.usecase.AddProdutoUseCase;
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
    private final AddProdutoUseCase addProdutoUseCase;
    private final ProdutoToProdutoResourceConverter toProdutoResourceConverter;
    private final AddProdutoRequestResourceToAddProdutoRequestConverter toAddProdutoRequestConverter;

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

    public ProdutoResource addProduto(AddProdutoRequestResource addProdutoRequestResource){
        final AddProdutoRequest addProdutoRequest = toAddProdutoRequestConverter.convert(addProdutoRequestResource);
        final Produto produtoToAdd = addProdutoUseCase.execute(addProdutoRequest);
        return toProdutoResourceConverter.convert(produtoToAdd);
    }
}
