create database if not exists clinica;

use clinica;

create table if not exists medicos(
	id smallint primary key auto_increment,
    nome varchar(200),
    data_contrato date,
    salario decimal(10,2) unsigned
    
) Engine = InnoDb;

create table if not exists pacientes(
	cpf varchar(15) primary key,
    cidade varchar(200),
    data_internacao date,
    idade tinyint unsigned,
    n_exames tinyint unsigned,
    id_medicos smallint,
    
    foreign key (id_medicos) references medicos(id)
)Engine = InnoDb;

-- A. Inserir valores
insert medicos values(
	null,
    'Claudio de Almeida',
    '2012-01-01',
    15000),(
	null,
    'Claudia de Almeida',
    '2016-01-01',
    30000.01),(
	null,
    'Ana Carolina',
    '2016-05-01',
    35000),(
	null,
    'Joana Alencastro',
    '2010-01-01',
    12000),(
	null,
    'Antônio Castro Tavares',
    '2010-01-01',
    15000);

insert pacientes values(
	'1010',
    'Florianópolis',
    '2017-01-01',
    50,
    2,
    1),(
	'1011',
    'Florianópolis',
    '2016-01-01',
    30,
    null,
    1),(
	'1012',
    'Florianópolis',
    '2016-06-01',
    60,
    6,
    1),(
	'1013',
    'Criciúma',
    '2015-01-01',
    25,
    0,
    2),(
	'1014',
    'Criciúma',
    '2017-01-01',
    55,
    3,
    2),(
	'1015',
    'São José',
    '2017-01-01',
    70,
    null,
    3);

-- B. Contar quantos pacientes foram cadastrados com valor null no n de exames
select count(*) from pacientes where n_exames is null;

-- C. Mostre o cpf de todos os pacientes que não tiveram null cadastrado em exames
select cpf from pacientes where n_exames is not null;

-- D. Conte a quantidad de pacientes cadastrados para cada medico
select count(*) from pacientes group by id_medicos;

-- E. Mostra a idade e a cidade do paciente mais velho, em cada cidade que aparece
select cidade, max(idade) from pacientes group by cidade;

-- F. Mostre o total de exames solicitados por cada medico, mostrando tb o id deles
select id_medicos, sum(n_exames) from pacientes group by id_medicos;
    
-- G. Mostrar total de exames, agrupado por médicos. Mostre junto o id do medico, mas somente com id entre 1 e 2
select id_medicos, sum(n_exames) from pacientes group by id_medicos having id_medicos =1 or id_medicos = 2;

-- H. Mostre os dados de todos medicos que estão cuidando algum paciente (consulta 1: tabela medicos / consulta 2 tabela pacientes)
select * from medicos where id in(select id_medicos from pacientes);

-- I. Mostre os dados de todos os médicos que não estão cuidando ninguém    
select * from medicos where id not in(select id_medicos from pacientes);

-- J. Mostre o id do medico que atende o paciente mais antigo da clinica (o que está internado a mais tempo)
select id_medicos from pacientes where data_internacao in (select min(data_internacao) from pacientes);

-- K. Mostre todas as infos do medico que trata o paciente mais antigo
select * from medicos where id = (select id_medicos from pacientes where data_internacao in (select min(data_internacao) from pacientes));

-- L. Mostre o id e o nome de todos os medicos cujos pacientes tem realizado 3 exames ou mais
select nome from medicos where id in(select id_medicos from pacientes where n_exames >= 3);

-- M. Mostra a idade do paciente mais idoso da clinica, bem como o nome do seu medico
select idade, nome from pacientes, medicos where idade = (select max(idade) from pacientes) and id_medicos = id;

-- N. Mostre, para cada medico que atende um conjunto de pacientes, qual o maior numero de exames pedidos, o id do medico, o nome do medico. Agrupe por medico
select nome, id_medicos, max(n_exames) from pacientes, medicos where id_medicos = id group by id_medicos;

