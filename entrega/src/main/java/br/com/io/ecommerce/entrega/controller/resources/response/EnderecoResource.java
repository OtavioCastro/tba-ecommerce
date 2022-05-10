package br.com.io.ecommerce.entrega.controller.resources.response;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoResource {
    private Long id;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private Long idCliente;
}
