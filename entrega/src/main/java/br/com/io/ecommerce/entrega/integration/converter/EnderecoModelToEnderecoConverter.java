package br.com.io.ecommerce.entrega.integration.converter;

import br.com.io.ecommerce.entrega.domain.Endereco;
import br.com.io.ecommerce.entrega.integration.model.EnderecoModel;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class EnderecoModelToEnderecoConverter {

    //private final ModelMapper modelMapper = new ModelMapper();

    public Endereco convert(EnderecoModel enderecoModel){
        ModelMapper modelmapper = new ModelMapper();
        return modelmapper.map(enderecoModel, Endereco.class);
    }
}
