CREATE TABLE IF NOT EXISTS CLIENTE(
  ID                        BIGINT PRIMARY KEY,
  NOME                      VARCHAR,
  DOC                       VARCHAR,
  TELEFONE                  VARCHAR,
  TIPO_TELEFONE             VARCHAR,
  EMAIL                     VARCHAR
);


CREATE TABLE IF NOT EXISTS ENDERECO(
  ID                        BIGINT AUTO_INCREMENT PRIMARY KEY,
  LOGRADOURO                VARCHAR,
  BAIRRO                    VARCHAR,
  CIDADE                    VARCHAR,
  ESTADO_UF                 VARCHAR,
  --ID_CLIENTE                BIGINT
  ID_CLIENTE                BIGINT,
  FOREIGN KEY (ID_CLIENTE) REFERENCES CLIENTE(ID)
);

CREATE TABLE IF NOT EXISTS AGENDAMENTO_ENTREGA(
  ID                        BIGINT AUTO_INCREMENT PRIMARY KEY,
  DATA                      VARCHAR,
  TURNO                     VARCHAR,
  PEDIDO                    BIGINT,
  ID_CLIENTE                BIGINT,
  FOREIGN KEY (ID_CLIENTE) REFERENCES CLIENTE(ID)
);