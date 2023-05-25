DROP DATABASE IF EXISTS stala_Futbol;
CREATE DATABASE stala_Futbol;
USE stala_Futbol;
CREATE TABLE Provincia (
    Id SMALLINT UNSIGNED NOT NULL PRIMARY KEY,
    Nombre VARCHAR(40) NOT NULL
);
CREATE TABLE Representante (
    Id SMALLINT UNSIGNED NOT NULL PRIMARY KEY,
    Nombre VARCHAR(40) NOT NULL
);
CREATE TABLE Situacion_de_nacionalidad (
    Id SMALLINT UNSIGNED NOT NULL PRIMARY KEY,
    Situacion ENUM('opcion','residencia','carta de naturaleza','posesion de estado') NOT NULL
);
CREATE TABLE Pais (
    Id SMALLINT UNSIGNED NOT NULL PRIMARY KEY,
    Nombre VARCHAR(40) NOT NULL,
    Abreviatura CHAR(3) NOT NULL
);
CREATE TABLE Estadio (
    Id SMALLINT UNSIGNED NOT NULL PRIMARY KEY,
    Nombre VARCHAR(40) NOT NULL,
    Capacidad INTEGER UNSIGNED NOT NULL,
    Direccion VARCHAR(100) NOT NULL,
    CP CHAR(5) NOT NULL,
    Provincia SMALLINT UNSIGNED NOT NULL,
    Telefono CHAR(9) NOT NULL,
    Inauguracion DATE NOT NULL,
    Propietario VARCHAR(40) NOT NULL,
    Dimensiones VARCHAR(40) NOT NULL,
    Otras_Instalaciones TEXT,
    Localidad VARCHAR(50) NOT NULL,
    Foreign Key (Provincia) REFERENCES Provincia(Id) ON UPDATE CASCADE ON DELETE RESTRICT
);
CREATE TABLE Equipo (
    Id SMALLINT UNSIGNED NOT NULL PRIMARY KEY,
    Nombre VARCHAR(40) NOT NULL,
    Nombre_oficial VARCHAR(60) NOT NULL,
    Direccion VARCHAR(100) NOT NULL,
    CP CHAR(5) NOT NULL,
    Provincia SMALLINT UNSIGNED NOT NULL,
    Pais SMALLINT UNSIGNED NOT NULL,
    Direccion_Internet VARCHAR(200),
    Email VARCHAR(50),
    Telefono CHAR(9) NOT NULL,
    Fecha_de_fundacion DATE NOT NULL,
    Historia TEXT NOT NULL,
    Himno TEXT,
    Estadio SMALLINT UNSIGNED NOT NULL,
    Localidad VARCHAR(50) NOT NULL,
    Foreign Key (Provincia) REFERENCES Provincia(Id) ON UPDATE CASCADE ON DELETE RESTRICT,
    Foreign Key (Pais) REFERENCES Pais(Id) ON UPDATE CASCADE ON DELETE RESTRICT,
    Foreign Key (Estadio) REFERENCES Estadio(Id) ON UPDATE CASCADE ON DELETE RESTRICT
);
CREATE TABLE Penias (
    Id_Equipo SMALLINT UNSIGNED NOT NULL,
    Nombre VARCHAR(40) NOT NULL,
    PRIMARY KEY (Id_Equipo, Nombre),
    Foreign Key (Id_Equipo) REFERENCES Equipo(Id) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE Jugador (
    Id SMALLINT UNSIGNED NOT NULL PRIMARY KEY,
    Nombre_Futbolistico VARCHAR(40) NOT NULL,
    Nombre VARCHAR(40) NOT NULL,
    Apellidos VARCHAR(40) NOT NULL,
    Fecha_de_nacimiento DATE NOT NULL,
    Lugar_de_nacimiento VARCHAR(100),
    Provincia SMALLINT UNSIGNED NOT NULL,
    Pais SMALLINT UNSIGNED NOT NULL,
    Pie ENUM('Derecho','Izquierdo') NOT NULL,
    Situacion SMALLINT UNSIGNED NOT NULL,
    Altura FLOAT UNSIGNED NOT NULL,
    Peso FLOAT UNSIGNED NOT NULL,
    Cantera SMALLINT UNSIGNED NOT NULL,
    Internacional BOOLEAN NOT NULL,
    Representante SMALLINT UNSIGNED NOT NULL,
    Pais_Nacionalidad VARCHAR(40),
    Retirado BOOLEAN NOT NULL,
    Foreign Key (Provincia) REFERENCES Provincia(Id) ON UPDATE CASCADE ON DELETE RESTRICT,
    Foreign Key (Pais) REFERENCES Pais(Id) ON UPDATE CASCADE ON DELETE RESTRICT,
    Foreign Key (Situacion) REFERENCES Situacion_de_nacionalidad(Id) ON UPDATE CASCADE ON DELETE RESTRICT,
    Foreign Key (Cantera) REFERENCES Equipo(Id) ON UPDATE CASCADE ON DELETE RESTRICT,
    Foreign Key (Representante) REFERENCES Representante(Id) ON UPDATE CASCADE ON DELETE RESTRICT
);
CREATE TABLE Demarcacion (
    Jugador SMALLINT UNSIGNED NOT NULL,
    Demarcacion ENUM('Portero','Defensa','Centrocampista','Delantero'),
    PRIMARY KEY (Jugador, Demarcacion),
    Foreign Key (Jugador) REFERENCES Jugador(Id) ON UPDATE CASCADE ON DELETE CASCADE
);