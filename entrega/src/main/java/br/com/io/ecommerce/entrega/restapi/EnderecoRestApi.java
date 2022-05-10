package br.com.io.ecommerce.entrega.restapi;

import br.com.io.ecommerce.entrega.controller.EnderecoController;
import br.com.io.ecommerce.entrega.controller.resources.response.EnderecoResource;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endereco")
@AllArgsConstructor
public class EnderecoRestApi {

    private final EnderecoController controller;

    @GetMapping("/{id}")
    public EnderecoResource getEndereco(@PathVariable ("id") Long id){
        return controller.getEndereco(id);
    }

}
