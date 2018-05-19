-- resolução do exercício 3
create database if not exists professores_ifsc;
use professores_ifsc;

create table if not exists professores(
	matricula smallint primary key,
    formacao varchar(100),
    id_curso smallint
) engine=innoDB;

create table if not exists curso(
	id smallint primary key,
    descricao text,
    matricula_professor smallint
) engine=innoDB;

create table if not exists professores_curso(
	id smallint primary key,
    id_curso smallint,
    matricula_professor smallint,
    
    foreign key (id_curso) references curso(id) on delete cascade on update cascade,
    foreign key (matricula_professor) references professores(matricula) on delete cascade on update cascade
) engine=innoDB;