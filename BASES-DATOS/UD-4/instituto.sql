CREATE DATABASE stala_Instituto;
USE stala_Instituto;
DROP TABLE IF EXISTS Profesores;
DROP TABLE IF EXISTS Modulos;
DROP TABLE IF EXISTS Matriculas;
DROP TABLE IF EXISTS Alumnos;
DROP TABLE IF EXISTS Grupos;
CREATE TABLE Profesores (
    Dni CHAR(9) PRIMARY KEY,
    Nombre VARCHAR(20),
    Direccion VARCHAR(40),
    Tfno VARCHAR(12)
);
CREATE TABLE Modulos (
    Codigo SMALLINT PRIMARY KEY,
    Nombre VARCHAR(20),
    Dni_profesor CHAR(9),
    Foreign Key (Dni_profesor) REFERENCES Profesores(Dni) ON UPDATE CASCADE ON DELETE RESTRICT
);
CREATE TABLE Grupos (
    Curso SMALLINT,
    Letra CHAR(1),
    Aula VARCHAR(20),
    Delegado SMALLINT,
    PRIMARY KEY(Curso, Letra)
);
CREATE TABLE Alumnos (
    N_expdte SMALLINT PRIMARY KEY,
    Nombre VARCHAR(20),
    Apellidos VARCHAR(20),
    Fecha_nac DATE,
    Curso SMALLINT,
    Letra CHAR(1),
    Foreign Key (Curso, Letra) REFERENCES Grupos(Curso, Letra) ON UPDATE CASCADE ON DELETE RESTRICT
);
ALTER TABLE `grupos` ADD FOREIGN KEY (`Delegado`) REFERENCES `alumnos`(`N_expdte`) ON UPDATE CASCADE ON DELETE RESTRICT;
CREATE TABLE Matriculas (
    Modulo SMALLINT,
    Alumno SMALLINT,
    Foreign Key (Modulo) REFERENCES Modulos(Codigo) ON UPDATE CASCADE ON DELETE CASCADE,
    Foreign Key (Alumno) REFERENCES Alumnos(N_expdte) ON UPDATE CASCADE ON DELETE CASCADE
);