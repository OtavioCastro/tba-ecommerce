package br.com.io.ecommerce.entrega.usecase.impl;

import br.com.io.ecommerce.entrega.domain.Endereco;
import br.com.io.ecommerce.entrega.gateway.EnderecoGateway;
import br.com.io.ecommerce.entrega.usecase.GetEnderecoUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetEnderecoUseCaseImpl implements GetEnderecoUseCase {

    private final EnderecoGateway gateway;

    @Override
    public Endereco execute(Long id) {
        final Endereco endereco = gateway.getEndereco(id);
        return endereco;
    }
}
