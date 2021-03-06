CREATE SCHEMA `test` DEFAULT CHARACTER SET utf8;

CREATE TABLE `test`.`user` (
`ID` INT(8) NOT NULL AUTO_INCREMENT PRIMARY KEY,
`NAME` VARCHAR(25) NOT NULL,
`AGE` INT NOT NULL,
`IS_ADMIN` BIT(1) NOT NULL DEFAULT 0,
`CREATED_DATE` TIMESTAMP DEFAULT CURRENT_TIMESTAMP);

INSERT INTO `test`.`user` (`NAME`, `AGE`) VALUES ('Artem', '21');
INSERT INTO `test`.`user` (`NAME`, `AGE`) VALUES ('Anton', '23');
INSERT INTO `test`.`user` (`NAME`, `AGE`) VALUES ('Vadim', '56');
