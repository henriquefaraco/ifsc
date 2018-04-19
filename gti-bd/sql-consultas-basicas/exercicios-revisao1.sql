-- Criar manualmente um banco de dados qualquer, se ele ainda n existir
CREATE DATABASE IF NOT EXISTS ifsc;
USE IFSC;

-- Criar uma tabela simples
create table if not exists livraria(
	codigo smallint unsigned primary key auto_increment,
    nome varchar(200) not null,
    endereco varchar(500) not null, 
    email varchar(300) not null,
    gerente varchar(200) not null
);

-- Item b: inserir dados de tres livrarias
insert livraria values(
	null,
    "Ática",
    "Av. Sete de Setembro, 1080",
    "atica@atica.com.br",
    "José de Almeida"
);

-- Outra maneira de inserirmos dados em uma tabela com sql
insert livraria value(
	null,
    "Moderna",
    "Av. Rio Branco 110",
    "moderna@moderna.com",
    "Leoberta de Almeida"
),(
	null,
	"Makron Books",
    "Rua Felipe Schmidt, 110",
    "makron@makron.com.br",
    "Jonas de Almeida"
);
-- Item c: adicionar uma coluna
alter table livraria add site varchar(200);

-- Item d: mudar o nome da coluna criada em c
alter table livraria change pagina_web pagina_web varchar(200) default "-" not null;

-- Item e: modificar a coluna nome, q já existe, transformando-a em indice
create index nome_livraria on livraria (nome);

-- item f: trocar o nome do gerente da segunda livraria
update livraria set gerente = "Maria do Carmo";

-- item g excluir tudo da linha da editora ática
delete from livraria where nome = "Ática";

/*Esse é um comentário de 
várias linhas */

-- Item i: renomear a tabela livraria

rename table livraria to editor;
rename table editor to editora;

show index from editora;

-- item j: excluir o indice
drop index nome_livraria on editora;

-- item k excluir a coluna q guarda o nome do gerente da editora
alter table editora drop column gerente;