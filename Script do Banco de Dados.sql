-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema jogodaforca
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema jogodaforca
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `jogodaforca` DEFAULT CHARACTER SET utf8 ;
USE `jogodaforca` ;

-- -----------------------------------------------------
-- Table `jogodaforca`.`tbl_palavra`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `jogodaforca`.`tbl_palavra` (
  `codigo` INT(11) NOT NULL AUTO_INCREMENT,
  `palavra` VARCHAR(50) NOT NULL,
  `categoria` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB
AUTO_INCREMENT = 7
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
