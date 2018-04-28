CREATE DATABASE IF NOT EXISTS exerc3;
USE exerc3;
CREATE TABLE IF NOT EXISTS clientes(
		numero_conta VARCHAR(20) PRIMARY KEY,
        titular VARCHAR(100) NOT NULL,
        data_abertura DATE DEFAULT "2018-01-01",
        saldo_atual DECIMAL(9,2),
		conta_conjunta BOOLEAN
        );
        
INSERT clientes VALUES(
		"1010-1",
        "Maria das Graças",
        '2017-01-28',
        8970.12,
		true
		);
		
-- inserir um registro com valor default para data de abertura
        
INSERT clientes(numero_conta, titular, saldo_atual, conta_conjunta) VALUES(
		"1010-2",
		"Carlos de Almeida",
		15788,
		false
		);
        
INSERT clientes VALUES(
		"1010-3",
        "Ana de Almeida",
        "2018-04-05",
		150080.12,
		false),
        (
        "1010-4",
        "Paulo de Castro",
        "2017-06-05",
		120456.12,
		true),
        (
        "1010-5",
        'Carla de Almeida',
        '2015-01-07',
		15700,
		true);
        
CREATE INDEX indice_titular ON clientes(titular);

UPDATE clientes SET saldo_atual = 10000.00 WHERE data_abertura < '2017-01-01';

UPDATE clientes SET conta_conjunta = true WHERE numero_conta < "1010-3";

DELETE FROM clientes WHERE conta_conjunta = true;

RENAME TABLE clientes TO novo_clientes;

DROP INDEX indice_titular ON novo_clientes;

alter table novo_clientes drop column conta_conjunta;

alter table novo_clientes add column gerente varchar(200);

alter table novo_clientes change gerente gerentes varchar(200);
