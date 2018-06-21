CREATE DATABASE IF NOT EXISTS aabbcc;

USE aabbcc;

CREATE TABLE IF NOT EXISTS vendedores(
			matricula VARCHAR(20) PRIMARY KEY,
			nome VARCHAR(100), 
			data_admissao DATE,
			cidade VARCHAR(200)
            ) ENGINE=innoDB;
			
CREATE TABLE IF NOT EXISTS faturas(
			id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
			descricao VARCHAR(1000),
			valor_venda DECIMAL(8,2),
			matricula_vendedor VARCHAR(20), 
            
            foreign key (matricula_vendedor) references vendedores(matricula)
            on delete cascade
            on update cascade
            )
			ENGINE=innoDB;

INSERT vendedores VALUES("10-10", "José", "2010-01-01", "Florianópolis");
INSERT vendedores VALUES("10-11", "Maria", "2012-01-01", NULL);
INSERT vendedores VALUES("10-12", "João", "2013-01-01", "Florianópolis");
INSERT vendedores VALUES("10-13", "Joana", "2014-01-01", "Criciúma");
INSERT vendedores VALUES("10-14", "Carlos", "2014-01-01", "Criciúma");
INSERT vendedores VALUES("10-15", "Sílvia", "2015-01-01", "São José");
INSERT vendedores VALUES("10-16", "Renata", "2017-01-01", "Chapecó");

INSERT faturas VALUES(DEFAULT, "Componentes elétricos", 500.20, "10-10");
INSERT faturas VALUES(DEFAULT, "Componentes hidráulicos", 1500.20, "10-10");
INSERT faturas VALUES(DEFAULT, "Material de construção", 500.20, "10-10");
INSERT faturas VALUES(DEFAULT, NULL, 100, "10-12");
INSERT faturas VALUES(DEFAULT, "Computadores", 5500, "10-13");
INSERT faturas VALUES(DEFAULT, "Impressoras", 800, "10-13");
INSERT faturas VALUES(DEFAULT, NULL, 500.20, "10-15");

-- d
select * from vendedores where cidade is null;

-- e
select id, descricao from faturas where descricao is not null;

-- f
update vendedores set cidade = 'São Paulo' where cidade is null;

-- g. Exclua qualquer vendedor com valor total de venda abaixo de 200 e que n trabalha em criciuma ou sao jose
delete from vendedores where matricula in(select matricula_vendedor from faturas where valor_venda < 200.00) and cidade not in('Criciúma', 'São Jose');

-- h. Exclua de faturas qualquer registro com descricao nula cujo vendedor ingressou na empresa em 2015
delete from faturas where matricula_vendedor in(select matricula from vendedores where year(data_admissao) = '2015') and descricao is not null;

-- i. Nome de todos vendedores que venderam menos do quem 1000
select nome from vendedores, faturas where valor_venda < 1000 and matricula = matricula_vendedor;

-- j. Mostre o nome dos vendedores cujo valor venda seja menor do que 1500, agrupado por vendedor 
select nome from vendedores, faturas where matricula = matricula_vendedor and valor_venda < 1500 group by matricula_vendedor;

-- K. Nome dos vendedores, cuja a venda pra cada fatura é menor do que a media de todas as vendas
select nome from vendedores, faturas where matricula = matricula_vendedor and valor_venda < (select avg(valor_venda) from faturas);

-- L. Conte o numero de vendedores que residam numa cidade, agrupado por cidade
select count(*), cidade from vendedores group by cidade;

-- M. Conte a quantidade de vendedores por ano de admissao
select count(*), year(data_admissao) from vendedores group by year(data_admissao);

-- N. Mostrar a soma do valor de venda por vendedor, mas somente onde a soma da venda do vendedor for > 1000 mostre tbem a matricula
select sum(valor_venda), matricula_vendedor from faturas group by matricula_vendedor having sum(valor_venda) >= 1000;

-- O. O item anterior novamente, mas mostrando tambem o nome do vendedor 
select sum(valor_venda), matricula_vendedor, nome from faturas, vendedores where matricula = matricula_vendedor group by matricula_vendedor having sum(valor_venda) >= 1000;

