package br.com.io.ecommerce.entrega.integration;

import br.com.io.ecommerce.entrega.integration.model.EnderecoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<EnderecoModel, Long> {
}
