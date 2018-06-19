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

-- G. Buscar o termpo "sovaco" na descrição e trocar pelo termo "saco"
-- Na função replace(coluna-alvo, termo-substituido, termo-novo)
select descricao, replace(descricao, 'sovaco', 'saco') as trocar_descricao from produtos;

-- H. Exibir os dados da coluna descricao com uppercase
select descricao, upper(descricao) as maiusculo from produtos;

-- I. Mostrar apenas o dia do mes da validade da coluna
select descricao, dayofmonth(data_hora) from produtos; 

-- J. Recuperar o ano em que termina a validade do produto
select descricao, year(data_hora) from produtos;

-- k. Mostra a data no formato requerido
select descricao, date_format(data_hora, '%d/%m/%Y') from produtos;

-- L. Mostar a data de validade mostrando apenas hora, minuto e segundo
select descricao, date_format(data_hora, '%H-%i-%S') from produtos;

-- M. Adicionar 2 meses a data de validade dos produtos
select descricao, data_hora as data_antiga, date_add(data_hora, interval 2 month) as nova_data from produtos;

-- N. Arredondar o preço com uma casa decimal
select descricao, preco_venda as precoantigo, round(preco_venda, 1) as preconovo from produtos;

-- O. Arredondar para o valor inteiro imediatamente inferior ao preco dado
select descricao, preco_venda as precoantigo, floor(preco_venda) as preconovo from produtos;
-- O2. Se fosse pra arredondar pra cima
select descricao, preco_venda as precoantigo, ceiling(preco_venda) as preconovo from produtos;

-- P. Calcular a potencia do preco de venda, elevando ao quadrado
select descricao, preco_venda as preco, pow(preco_venda, 2) as preconovo from produtos;

-- Q. contar onde o codigo for menor q 2 e a data maior do que 2015-02-10 12:12:40
select count(*) from produtos where cod < 2 and data_hora > '2015-02-10 12:12:40';

-- R. Calcular a soma dos precos de venda mas somente dos produtos que possuem preco entre 0 e 2500
select sum(preco_venda) from produtos where preco_venda between 0 and 2500;

-- S. Calcular a media do preco de venda dos produtos que sao pereciveis
select avg(preco_venda) from produtos where perecivel = true;

-- T. Recupera a descricao do produto mais caro da tabela // Aqui faz-se uma consulta dentro da outra
select descricao from produtos where preco_venda = (select max(preco_venda) from produtos);