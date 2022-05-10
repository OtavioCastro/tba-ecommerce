package br.com.io.ecommerce.catalogo.restapi;

import br.com.io.ecommerce.catalogo.controller.CatalogoController;
import br.com.io.ecommerce.catalogo.controller.resources.ProdutoResource;
import br.com.io.ecommerce.catalogo.domain.Produto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catalogo")
@AllArgsConstructor
public class CatalogoRestApi {

    private final CatalogoController controller;

    @GetMapping
    public List<ProdutoResource> getProdutos(){
        return controller.getProdutos();
    }
}
