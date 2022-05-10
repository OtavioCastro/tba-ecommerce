package br.com.io.ecommerce.entrega.domain;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {
    private Long id;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estadoUf;
    private Long idCliente;
}