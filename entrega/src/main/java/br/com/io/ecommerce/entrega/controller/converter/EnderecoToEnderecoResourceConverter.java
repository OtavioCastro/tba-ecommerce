package br.com.io.ecommerce.entrega.controller.converter;

import br.com.io.ecommerce.entrega.controller.resources.response.EnderecoResource;
import br.com.io.ecommerce.entrega.domain.Endereco;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class EnderecoToEnderecoResourceConverter {

    private final ModelMapper modelMapper  = new ModelMapper();

    public EnderecoResource convert(Endereco endereco){
        return modelMapper.map(endereco, EnderecoResource.class);
    }
}
