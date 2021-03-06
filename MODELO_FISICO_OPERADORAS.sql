-- Gera��o de Modelo f�sico
-- Sql ANSI 2003 - brModelo.



CREATE TABLE CLIENTE (
CLIENTE_COD BIGINT NOT NULL PRIMARY KEY,
CLIENTE_NASC DATE NOT NULL,
CLIENTE_NOME VARCHAR(100) NOT NULL
);

CREATE TABLE TELEFONE (
FONE_COD BIGINT NOT NULL PRIMARY KEY,
FONE_NUMERO CHAR(10) NOT NULL,
FONE_TIPO VARCHAR(50) NOT NULL,
CLIENTE_COD BIGINT NOT NULL,
OPERADORA_COD BIGINT NOT NULL,
FOREIGN KEY(CLIENTE_COD) REFERENCES CLIENTE (CLIENTE_COD)
);

CREATE TABLE OPERADORA (
OPERADORA_COD BIGINT NOT NULL PRIMARY KEY,
OPERADORA_NOME VARCHAR(50) NOT NULL
);

ALTER TABLE TELEFONE ADD FOREIGN KEY(OPERADORA_COD) REFERENCES OPERADORA (OPERADORA_COD)
