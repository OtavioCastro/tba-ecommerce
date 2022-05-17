package br.com.io.ecommerce.catalogo.integration.converter;

import br.com.io.ecommerce.catalogo.domain.request.AddProdutoRequest;
import br.com.io.ecommerce.catalogo.integration.model.ProdutoModel;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AddProdutoRequestToProdutoModelConverter {

    private final ModelMapper modelMapper = new ModelMapper();

    public ProdutoModel convert(AddProdutoRequest produtoRequest){
        return modelMapper.map(produtoRequest, ProdutoModel.class);
    }

}
