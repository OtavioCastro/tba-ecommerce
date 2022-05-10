package br.com.io.ecommerce.entrega.usecase;

import br.com.io.ecommerce.entrega.domain.Endereco;

public interface GetEnderecoUseCase {

    Endereco execute(Long id);
}
