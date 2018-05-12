-- resolução do exercício 1
create database if not exists livraria;
use livraria;

create table if not exists autor(
	id smallint auto_increment primary key,
    nome varchar(200),
    area_atuacao varchar(255)
) engine=innoDB;

create table if not exists editora(
	codigo varchar(30) primary key,
    nome varchar(200),
    email varchar(300),
    id_autor smallint,
    
    foreign key (id_autor) references autor(id)) engine=innoDB;

