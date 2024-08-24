SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

CREATE DATABASE IF NOT EXISTS `bd_institución`;
USE `bd_institución`;

CREATE TABLE `alumnos` (
  `ID` int(50) NOT NULL,
  `NombreAlumno` varchar(50) NOT NULL,
  `Grupo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `alumnos` (`ID`, `NombreAlumno`, `Grupo`) VALUES
(1, 'Brian Hazel', '4IV8'),
(3, 'Juan', '4IV8'),
(4, 'Andrea Jiménez', '4IV8');

ALTER TABLE `alumnos`
  ADD PRIMARY KEY (`ID`);

ALTER TABLE `alumnos`
  MODIFY `ID` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;
