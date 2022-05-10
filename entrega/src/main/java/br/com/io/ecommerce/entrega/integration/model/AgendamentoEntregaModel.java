package br.com.io.ecommerce.entrega.integration.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AGENDAMENTO_ENTREGA")
public class AgendamentoEntregaModel {
    @Id
    private Long id;
    private String data;
    private String turno;
    private Long pedido;
    private Long enderecoId;
}

