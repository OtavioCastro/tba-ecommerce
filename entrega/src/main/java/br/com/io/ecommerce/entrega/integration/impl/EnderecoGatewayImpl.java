package br.com.io.ecommerce.entrega.integration.impl;

import br.com.io.ecommerce.entrega.domain.Endereco;
import br.com.io.ecommerce.entrega.gateway.EnderecoGateway;
import br.com.io.ecommerce.entrega.integration.EnderecoRepository;
import br.com.io.ecommerce.entrega.integration.converter.EnderecoModelToEnderecoConverter;
import br.com.io.ecommerce.entrega.integration.model.EnderecoModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EnderecoGatewayImpl implements EnderecoGateway {

    private final EnderecoRepository enderecoRepository;

    private final EnderecoModelToEnderecoConverter toEnderecoConverter;

    @Override
    public Endereco getEndereco(Long id) {
        final EnderecoModel enderecoDb = enderecoRepository.findById(id).orElse(null);
        return toEnderecoConverter.convert(enderecoDb);
    }
}
