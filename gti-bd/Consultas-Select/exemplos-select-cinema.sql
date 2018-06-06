create database if not exists cinema;

use cinema;

create table if not exists filmes(
	cod varchar(30) primary key,
    titulo varchar(200),
    orcamento decimal(10,2) unsigned,  
    data_lancamento date,
    faixa_etaria tinyint unsigned,
    genero varchar(50),
    faturamento decimal(12,2) unsigned,
    origem boolean
) Engine = InnoDB;

insert filmes values(
	'F1',
    'E o vento levou',
    2000,
    '1997-05-01',
    3,
    'Drama, Romance',
    10000,
    false),('F2',
    'E o vento levou',
    2000,
    '1997-05-01',
    3,
    'Drama, Romance',
    10000,
    false),('F3',
    'E o vento levou',
    2000,
    '1997-05-01',
    3,
    'Drama, Romance',
    10000,
    false);
    
-- conta registros de uma tabela que atendem determinada condição, contando todos os registros sejam null ou não
select count(*) from funcionario;
select * from empresa.funcionario;

-- conta registros de uma tabela // esse formato não contará os valores nulos como existentes.
select count(cidade) from funcionario;

-- contar o numero de funcionarios que ganham acima de 5000
select count(*) from funcionario where salario > 5000;

-- mostrar somente os dois primeiros registros da tabela
select * from empresa.funcionario limit 2;

-- mostra nome e sobrenome, ordena pelo sobrenome em ordem decrescente
select nome, sobrenome from funcionario order by sobrenome desc;

-- contar quantos funcionarios nao moram em criciuma e florianopolis
select count(*) from funcionario where cidade != "Florianopolis" and cidade != "Criciuma";

-- outra forma de fazer a consulta especificada acima, mas com possibilidade de ampliar a quantidade de condições, o que foi feito com o salário
select count(*) from funcionario where cidade not in ('Florianopolis', 'Criciuma') and salario between 5000 and 8000;

-- mostrar o salario de todos que ganham entre mil e cinco mil
select salario from funcionario where salario >= 1000 and salario <=5000;

-- mesma coisa que o exemplo acima, mas usando o operador between
select salario from funcionario where salario between 1000 and 5000;

-- mostrar o nome e o sobrenome de todos funcionarios onde o nome comece com a letra B
select nome, sobrenome from funcionario where nome like 'B%';

-- mostar nome e sobrenome de todos funcionarios cujo o nome comece com j e termine com o
select nome, sobrenome from funcionario where nome like 'j%o';

-- mostar nome e sobrenome de todos funcionarios cujo o nome comece contenha 5 caracteres
select nome, sobrenome from funcionario where nome like '_____';

-- mostrar nome e sobrenome de todos funcionarios cujo o sobrenome não contenha a terminação DES
select nome, sobrenome from funcionario where sobrenome not like '%des';

-- mostrar quantos funcionarios tem salario acima de 5mil mas usando apelido
select count(*) as salario_maior_que_5_mil from funcionario where salario > 5000;



  
    
    
							