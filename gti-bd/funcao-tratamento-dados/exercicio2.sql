create database if not exists ifsc;

use ifsc;

create table if not exists alunos(
	matricula varchar(250) primary key,
    nome varchar(250),
    unidade_curricular varchar(250),  
    prova1 decimal(4,2) unsigned, 
    prova2 decimal(4,2) unsigned
) Engine = InnoDB;

insert alunos values(
	'1010-1',
    'Marco Antônio de Souza',
    'Banco de Dados',
    7.85,
    8.55),(
	'1010-2',
    'Marco de Souza',
    'Banco de Dados',
    4,
    9),(
	'1010-3',
    'Joana de Souza',
    'Banco de Dados',
    7.10,
    8.70),(
	'1010-4',
    'José Antônio de Souza',
    'Rede de Computadores',
    6.85,
    9.55);

select * from alunos;    

-- E. Mostrar para todos alunos nomes e notas, arredondadas para o inteiro mais proximo
select nome, round(prova1) as nota_1_arredondada, round(prova2) as nota_2_arredondada from alunos;

-- F. Mostrar o valor da primeira nota de cada aluno truncada, com apenas uma casa decimal
select truncate(prova1, 1) from alunos;

-- G. Mostrar a segunda nota de todos arredondando pra cima sem casa decimal
select nome, ceiling(prova2) as nota2 from alunos; 

-- H. Mostrar a segunda nota de todos arredondando pra baixo sem casa decimal
select nome, floor(prova2) as nota2 from alunos; 

-- I. Mostrar a raiz quadrada da nota1 mas somente dos antonios // poderia ser usado o operador sqrt que só serve para raízes quadradas
select nome, pow(prova1,1/2) from alunos where nome like '%antonio%'; 

-- J. Mostrar a nota da segunda avaliacao elevada ao quadrado
select pow(prova2,2) from alunos;

-- K. Mostrar o resto da divisão da primeira avaliacao pela segunda
select mod(prova1,prova2) as resto from alunos;

-- L. Mostrar a soma da segunda nota de todos alunos arredondada para inteiros
select round(sum(prova2)) from alunos;

-- M. Mostrar a media da primeira nota apenas para os alunos de banco de dados
select avg(prova1) from alunos where unidade_curricular = 'banco de dados';

-- N. Mostrar a nota do aluno com nota mais baixa na prova2
select min(prova2) from alunos;

-- O. Mostrar a nota do aluno com nota mais alta na prova2
select max(prova2) from alunos;

-- P. Calcular a media das notas das provas 2 mas somente das notas pares
select avg(prova1) from alunos where mod(prova1,2) = 0;

 


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