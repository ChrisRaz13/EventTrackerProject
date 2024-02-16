-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema codingtrackerdb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `codingtrackerdb` ;

-- -----------------------------------------------------
-- Schema codingtrackerdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `codingtrackerdb` DEFAULT CHARACTER SET utf8 ;
-- -----------------------------------------------------
-- Schema new_schema1
-- -----------------------------------------------------
USE `codingtrackerdb` ;

-- -----------------------------------------------------
-- Table `coding`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `coding` ;

CREATE TABLE IF NOT EXISTS `coding` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `coder` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS codinguser@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'codinguser'@'localhost' IDENTIFIED BY 'codinguser';


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `coding`
-- -----------------------------------------------------
START TRANSACTION;
USE `codingtrackerdb`;
INSERT INTO `coding` (`id`, `coder`) VALUES (1, 'Chris');

COMMIT;

