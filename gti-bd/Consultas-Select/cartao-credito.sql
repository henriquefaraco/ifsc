create database if not exists cartao;

use cartao;

create table if not exists credito(
	numero int(30) primary key,
    titular varchar(200),
    bandeira varchar(100),  
    banco varchar(100),
    data_vencimento date,
    codigo_seguranca int(3),
    internacional boolean
) Engine = InnoDB;

insert credito values(
	0001,
    'Neymar',
    'Visa',
    'HSBC',
    '2022-01-01',
    123,
    false),(
	0002,
    'Gabriel Jesus',
    'Elo',
    'Itau',
    '2021-05-01',
    234,
    true),(
	0003,
    'William',
    'Mastercard',
    'Bradesco',
    '2025-07-01',
    345,
    true),(
	0004,
    'Firmino',
    'Mastercard',
    'Banco do Brasil',
    '2020-03-01',
    456,
    true);
    
-- D. Contar quantos pertencem à bandeira visa
select count(*) from credito where bandeira = 'visa';

-- E. Mostre todos os campos de cada registro que contenha o termo do no nome do banco
select * from credito where banco like '%do%';

-- F. Ordene os registros pelo codico de seguranca
select * from credito order by codigo_seguranca;

-- G. Conte a quantidade de cartoes de credito internacionais 
select count(*) from credito where internacional = true;

-- H. mostrar numero, titular e data de todos cartoes com vencimento antes de 01/01/2015 ou apos 1/1/16
select numero, titular, data_vencimento from credito where data_vencimento < '2015-01-01' or data_vencimento > '2016-01-01';

-- I. Mostre todos valores dos cartoes do BB, Mastercard e codigo de seguranca diferente de 345, 213, 768, 577
select * from credito where banco = 'banco do brasil' and bandeira='mastercard' and codigo_seguranca != 345 and codigo_seguranca != 213 and codigo_seguranca != 768 and codigo_seguranca != 577;

-- J. Crie um apelido para armazenar a quantidade total de registros na tabela
select count(*) as apelido from credito;