-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema TournamentDB
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `TournamentDB` ;

-- -----------------------------------------------------
-- Schema TournamentDB
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `TournamentDB` DEFAULT CHARACTER SET utf8 ;
USE `TournamentDB` ;

-- -----------------------------------------------------
-- Table `Tournaments`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Tournaments` ;

CREATE TABLE IF NOT EXISTS `Tournaments` (
  `TournamentID` INT NOT NULL AUTO_INCREMENT,
  `PlayerID` INT NULL,
  `Date` DATETIME NULL,
  `BuyInAmount` DECIMAL(10,2) NULL,
  `Entries` INT NULL,
  `CashOut` DECIMAL(10,2) NULL,
  `TotalEntrants` INT NULL,
  `PrizePool` DECIMAL(10,2) NULL,
  `FinishedPosition` INT NULL,
  `ROI` DECIMAL(10,2) NULL,
  `ITMPercentage` DECIMAL(10,2) NULL,
  PRIMARY KEY (`TournamentID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Player`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Player` ;

CREATE TABLE IF NOT EXISTS `Player` (
  `PlayerID` INT NOT NULL AUTO_INCREMENT,
  `Name` VARCHAR(255) NULL,
  `Ranking` INT NULL,
  `Tournaments_TournamentID` INT NOT NULL,
  PRIMARY KEY (`PlayerID`),
  INDEX `fk_Player_Tournaments_idx` (`Tournaments_TournamentID` ASC),
  CONSTRAINT `fk_Player_Tournaments`
    FOREIGN KEY (`Tournaments_TournamentID`)
    REFERENCES `Tournaments` (`TournamentID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS pokeruser@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'pokeruser'@'localhost' IDENTIFIED BY 'pokeruser';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'pokeruser'@'localhost';
GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'pokeruser'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `Tournaments`
-- -----------------------------------------------------
START TRANSACTION;
USE `TournamentDB`;
INSERT INTO `Tournaments` (`TournamentID`, `PlayerID`, `Date`, `BuyInAmount`, `Entries`, `CashOut`, `TotalEntrants`, `PrizePool`, `FinishedPosition`, `ROI`, `ITMPercentage`) VALUES (1, 1, NULL, 1, 1, 1, 1, 1, 1, 1, 1);

COMMIT;


-- -----------------------------------------------------
-- Data for table `Player`
-- -----------------------------------------------------
START TRANSACTION;
USE `TournamentDB`;
INSERT INTO `Player` (`PlayerID`, `Name`, `Ranking`, `Tournaments_TournamentID`) VALUES (1, 'Chris', 1, 1);

COMMIT;

