package br.com.io.ecommerce.entrega.integration.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ENDERECO")
@Data
public class EnderecoModel {
    @Id
    private Long id;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estadoUf;
    private Long idCliente;
}
