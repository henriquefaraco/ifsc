-- resolução do exercício 2
create database if not exists cursos_ifsc;
use cursos_ifsc;

create table if not exists professor(
	matricula smallint auto_increment primary key,
    nome varchar(200),
    titulacao varchar(255)
) engine=innoDB;

create table if not exists curso(
	id varchar(30) primary key,
    nome varchar(200),
    matricula_professor smallint,
    
    foreign key (matricula_professor) references professor(matricula)
) engine=innoDB;


