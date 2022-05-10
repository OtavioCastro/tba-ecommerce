package br.com.io.ecommerce.entrega.controller;

import br.com.io.ecommerce.entrega.controller.converter.EnderecoToEnderecoResourceConverter;
import br.com.io.ecommerce.entrega.controller.resources.response.EnderecoResource;
import br.com.io.ecommerce.entrega.domain.Endereco;
import br.com.io.ecommerce.entrega.usecase.GetEnderecoUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class EnderecoController {

    private final GetEnderecoUseCase getEnderecoUseCase;
    private final EnderecoToEnderecoResourceConverter toEnderecoResourceConverter;

    public EnderecoResource getEndereco(Long id){
        final Endereco endereco = getEnderecoUseCase.execute(id);
        return toEnderecoResourceConverter.convert(endereco);
    }
}
