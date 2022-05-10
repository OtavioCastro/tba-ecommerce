package br.com.io.ecommerce.catalogo.controller.converter;

import br.com.io.ecommerce.catalogo.controller.resources.ProdutoResource;
import br.com.io.ecommerce.catalogo.domain.Produto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ProdutoToProdutoResourceConverter {

    private final ModelMapper modelMapper = new ModelMapper();

    public ProdutoResource convert (Produto produto){
        return modelMapper.map(produto, ProdutoResource.class);
    }
}
