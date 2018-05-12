CREATE DATABASE IF NOT EXISTS prova1;
USE prova1;

CREATE TABLE IF NOT EXISTS cidade(
		codigo INT PRIMARY KEY AUTO_INCREMENT,
        nome VARCHAR(100),
        uf char(2),
        pontos_turisticos TINYINT
        )ENGINE = InnoDB;
       
INSERT cidade VALUES(
		null,
        "Florianópolis",
        "SC",
        65
		), (
        null,
        "Rio de Janeiro",
        "RJ",
        125
		), (
        null,
        "Belo Horizonte",
        "MG",
        95
		);
        
UPDATE cidade SET pontos_turisticos = 10 WHERE uf = "SC";

DELETE FROM cidades WHERE uf = "MG";

ALTER TABLE cidade ADD COLUMN descricao TEXT;

ALTER TABLE cidade DROP COLUMN descricao;
