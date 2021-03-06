create database if not exists empresa;

use empresa;

create table if not exists funcionario(
	id smallint auto_increment primary key,
    nome varchar(100),
    sobrenome varchar (200), 
    data_nascimento date,
    cidade varchar(100),
    salario decimal(8,2)
) Engine = InnoDB;

insert funcionario values(
	null,
    'Pedro',
    'de Almeida Castro',
    '1997-05-01',
    'Florianopolis',
    7600.56),(
    null,
    'Joana',
    'da Silva',
    '1995-06-02',
    'São José',
    9600.16),(
    null,
    'Carlos',
    'Souza',
    '1981-12-31',
    'Palhoça',
    5800.56),(
    null,
    'Jacinto',
    'Paula Tejando',
    '1991-03-15',
    'Biguaçu',
    4600.16),(
    null,
    'Bia',
    'Fagundes',
    '1997-05-05',
    'Santo Amaro',
    6600.66),(
    null,
    'Paulo',
    'Fernandes',
    '1987-07-01',
    'Governador Celso Ramos',
    15600.56);
    
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



  
    
    
							