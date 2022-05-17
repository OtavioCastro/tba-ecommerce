package br.com.io.ecommerce.catalogo.restapi;

import br.com.io.ecommerce.catalogo.controller.CatalogoController;
import br.com.io.ecommerce.catalogo.controller.resources.ProdutoResource;
import br.com.io.ecommerce.catalogo.controller.resources.request.AddProdutoRequestResource;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public ProdutoResource getProduto(@PathVariable ("id") Long id) { return controller.getProduto(id); }

    @PostMapping
    public ProdutoResource addProduto(@RequestBody AddProdutoRequestResource produtoRequestResource) {
        return controller.addProduto(produtoRequestResource);
    }
}
