-- resolução do exercício 3
create database if not exists clinica;
use clinica;

create table if not exists medico(
	crm varchar (50) primary key,
    nome varchar(200),
    especialidade text
) engine=innoDB;

create table if not exists convenio(
	codigo smallint primary key,
    descricao text
) engine=innoDB;

create table if not exists paciente(
	cpf varchar(20) primary key,
    nome varchar(200),
    data_internacao date,
    crm_medico varchar(50),
    codigo_convenio smallint,
    
    foreign key (crm_medico) references medico(crm),
    foreign key (codigo_convenio) references convenio(codigo)
) engine=innoDB;

