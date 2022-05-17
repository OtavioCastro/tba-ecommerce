package br.com.io.ecommerce.catalogo.controller.converter;

import br.com.io.ecommerce.catalogo.controller.resources.request.AddProdutoRequestResource;
import br.com.io.ecommerce.catalogo.domain.request.AddProdutoRequest;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AddProdutoRequestResourceToAddProdutoRequestConverter {

    private final ModelMapper modelMapper = new ModelMapper();

    public AddProdutoRequest convert(AddProdutoRequestResource addProdutoRequestResource){
        return modelMapper.map(addProdutoRequestResource, AddProdutoRequest.class);
    }
}
