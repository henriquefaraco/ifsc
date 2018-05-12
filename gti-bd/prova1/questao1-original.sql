-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema prova1-questao1
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema prova1-questao1
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `prova1-questao1` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `prova1-questao1` ;

-- -----------------------------------------------------
-- Table `prova1-questao1`.`cidade`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `prova1-questao1`.`cidade` (
  `codigo` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NULL,
  `uf` CHAR(2) NULL,
  `pontos_turisticos` TINYINT NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `prova1-questao1`.`hotel`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `prova1-questao1`.`hotel` (
  `codigo` SMALLINT NOT NULL,
  `quantidade_estrelas` TINYINT NULL DEFAULT 1,
  `valor_diaria` DECIMAL(12,2) NULL,
  `cidade_codigo` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`codigo`),
  INDEX `fk_hotel_cidade_idx` (`cidade_codigo` ASC),
  CONSTRAINT `fk_hotel_cidade`
    FOREIGN KEY (`cidade_codigo`)
    REFERENCES `prova1-questao1`.`cidade` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
