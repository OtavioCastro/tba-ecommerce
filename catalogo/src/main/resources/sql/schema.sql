CREATE TABLE IF NOT EXISTS PRODUTO(
  ID                        BIGINT AUTO_INCREMENT PRIMARY KEY,
  NOME                      VARCHAR,
  QUANTIDADE                INT,
  VALOR                     DOUBLE,
  CATEGORIA                 VARCHAR
);