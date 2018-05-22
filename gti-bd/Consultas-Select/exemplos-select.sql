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
  
    
    
							