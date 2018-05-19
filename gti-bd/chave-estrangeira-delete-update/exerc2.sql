-- resolução do exercício 2
create database if not exists empresa;
use empresa;

create table if not exists fornecedor(
	codigo smallint primary key,
    cidade varchar(100)
) engine=innoDB;

create table if not exists produto(
	id smallint(30) auto_increment primary key,
    preco decimal(12,2),
    codigo_fornecedor smallint,
    
    foreign key (codigo_fornecedor) references fornecedor(codigo)
    on delete cascade
    on update cascade
) engine=innoDB;

insert fornecedor values 	(10,
							"Florianopolis"),
							(20,
                            "Criciuma");
                            
insert produto values 	(null,
						120.12,
                        10),
                        (null,
                        145.50,
                        20);

