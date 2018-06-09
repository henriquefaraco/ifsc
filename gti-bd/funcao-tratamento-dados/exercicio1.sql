create database if not exists funcoes;

use funcoes;

create table if not exists produtos(
	cod int primary key,
    descricao text,
    perecivel boolean,  
    data_hora datetime,
    preco_venda decimal(8,2) unsigned
) Engine = InnoDB;

insert produtos values(
	1,
    'Pó para tirar cheiro ruim do sovaco',
    false,
    '2016-01-05 20:10:00',
    12.54),(
	2,
    'Loção para evitar queda de membros',
    false,
    '2015-01-20 18:10:00',
    47.89
    ),(
	3,
    'Desentupidor de intestino',
    true,
    '2016-01-05 20:10:00',
    1.99
    ),(
	4,
    'Pasta de dente com soda caustica para eliminar cáries por completo',
    true,
    '2017-01-01 20:10:00',
    7.99
    );

select * from produtos;    

-- E. Contar quantos caracteres possuem cada descrição, mostrando as mesmas
select descricao, char_length(descricao) from produtos;

-- F. Juntar o codigo com a data de vencimento, separados por underline
select concat(cod, "_", data_hora) from produtos;