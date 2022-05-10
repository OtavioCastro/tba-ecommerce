package br.com.io.ecommerce.entrega.gateway;

import br.com.io.ecommerce.entrega.domain.Endereco;

public interface EnderecoGateway {

    Endereco getEndereco(Long id);
}
