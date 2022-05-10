package br.com.io.ecommerce.catalogo.integration;

import br.com.io.ecommerce.catalogo.integration.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogoRepository extends JpaRepository<ProdutoModel, Long> {
}
