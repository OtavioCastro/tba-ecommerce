package br.com.io.ecommerce.entrega.integration.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class ClienteModel {
    @Id
    private Long id;
    private String nome;
    private String doc;
    private String telefone;
    private String tipoTelefone;
    private String email;
}

