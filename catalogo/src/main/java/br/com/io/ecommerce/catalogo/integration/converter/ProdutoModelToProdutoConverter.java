package br.com.io.ecommerce.catalogo.integration.converter;

import br.com.io.ecommerce.catalogo.domain.Produto;
import br.com.io.ecommerce.catalogo.integration.model.ProdutoModel;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ProdutoModelToProdutoConverter {

    private final ModelMapper modelMapper = new ModelMapper();

    public Produto convert(ProdutoModel produtoModel){
        return modelMapper.map(produtoModel, Produto.class);
    }
}
