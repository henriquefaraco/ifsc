create database if not exists maternidade;

use maternidade;

create table if not exists bebe(
	id smallint primary key auto_increment,
    nome varchar(200),
    sexo varchar(15),  
    data_hora datetime,
    peso decimal(4,3) unsigned,
    tipo_sanguineo varchar(5)
) Engine = InnoDB;

insert bebe values(
	null,
    'Genoveva',
    'Feminino',
    '2016-01-05 20:10:00',
    2.540,
    'AB+'),(
	null,
    'Godofredo',
    'Masculino',
    '2015-01-20 18:10:00',
    2.100,
    '0-'),(
	null,
    'Aricleia',
    'Feminino',
    '2016-01-05 20:10:00',
    1.800,
    'O+'),(
	null,
    'Tiburcio',
    'Masculino',
    '2017-01-01 20:10:00',
    3.120,
    'A+');
    
-- D. Quantos pertencem ao sexo masculino, exibido com apelido
select count(*) as quantidade from bebe where sexo = 'masculino';

-- E. Quantos não possuem tipo sanguineo AB+, AB- e O-
select count(*) from bebe where tipo_sanguineo != 'AB+' and tipo_sanguineo != 'AB-' and tipo_sanguineo != 'O-';
select count(*) from bebe where tipo_sanguineo not in ('AB+', 'AB-','O-');

-- F. Mostrar nome e data e hr de nascimento dos que nasceram após as 19h do dia 20/01/2015
select nome, data_hora from bebe where data_hora > '2015-01-20 19:00:00';

-- G. Contar quantos bebes nasceram entre 1,5kg e 2,5kg 
select count(*) from bebe where peso between 1.5 and 2.5;

-- H. mostrar todas informaçoes dos bebes que contem maria no nome
select * from bebe where nome like 'maria';

-- I. ordene tudo pela data de nascimento
select * from bebe order by data_hora desc;
