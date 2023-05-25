DROP DATABASE IF EXISTS stala_Ajedrez;
CREATE DATABASE  stala_Ajedrez;
USE stala_Ajedrez;
CREATE TABLE Pais (
    Numero SMALLINT UNSIGNED NOT NULL PRIMARY KEY,
    Nombre VARCHAR(40) NOT NULL,
    N_clubes SMALLINT UNSIGNED NOT NULL,
    Pais_representador SMALLINT UNSIGNED NOT NULL,
    Foreign Key (Pais_representador) REFERENCES Pais(Numero) ON UPDATE CASCADE ON DELETE RESTRICT
);
CREATE TABLE Persona (
    N_asociado SMALLINT UNSIGNED NOT NULL PRIMARY KEY,
    Nombre VARCHAR(40) NOT NULL,
    Direccion VARCHAR(100) NOT NULL,
    Telefono CHAR(9) NOT NULL,
    Pais SMALLINT UNSIGNED NOT NULL,
    Foreign Key (Pais) REFERENCES Pais(Numero) ON UPDATE CASCADE ON DELETE RESTRICT
);
CREATE TABLE Hotel (
    Nombre VARCHAR(100) NOT NULL PRIMARY KEY,
    Direccion VARCHAR(100) NOT NULL,
    Telefono CHAR(9) NOT NULL
);
CREATE TABLE Aloja (
    N_asociado SMALLINT UNSIGNED NOT NULL,
    Nombre_hotel VARCHAR(100) NOT NULL,
    Fecha DATE NOT NULL,
    PRIMARY KEY(N_asociado, Nombre_hotel),
    Foreign Key (N_asociado) REFERENCES Persona(N_asociado) ON UPDATE CASCADE ON DELETE CASCADE,
    Foreign Key (Nombre_hotel) REFERENCES Hotel(Nombre) ON UPDATE CASCADE ON DELETE RESTRICT
);
CREATE TABLE Campeonatos_Persona (
    N_asociado SMALLINT UNSIGNED NOT NULL,
    Campeonato VARCHAR(200) NOT NULL,
    PRIMARY KEY(N_asociado, Campeonato),
    Foreign Key (N_asociado) REFERENCES Persona(N_asociado) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE Arbitro (
    N_asociado SMALLINT UNSIGNED NOT NULL PRIMARY KEY,
    Foreign Key (N_asociado) REFERENCES Persona(N_asociado) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE Jugador (
    N_asociado SMALLINT UNSIGNED NOT NULL PRIMARY KEY,
    Nivel ENUM('1','2','3','4','5','6','7','8','9','10'),
    Foreign Key (N_asociado) REFERENCES Persona(N_asociado) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE Sala (
    Id_sala SMALLINT UNSIGNED NOT NULL PRIMARY KEY,
    Nombre_hotel VARCHAR(100) NOT NULL,
    Capacidad INTEGER UNSIGNED NOT NULL,
    Foreign Key (Nombre_hotel) REFERENCES Hotel(Nombre) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE Medios_Sala (
    Id_sala SMALLINT UNSIGNED NOT NULL,
    Medio VARCHAR(100) NOT NULL,
    PRIMARY KEY(Id_sala, Medio),
    Foreign Key (Id_sala) REFERENCES Sala(Id_sala) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE Partida (
    Cod_partida SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Dia_jornada CHAR(2) NOT NULL,
    Mes_jornada CHAR(2) NOT NULL,
    Anio_jornada CHAR(4) NOT NULL,
    Jugador1 SMALLINT UNSIGNED NOT NULL,
    Color_jugador1 ENUM('Blancas','Negras') NOT NULL,
    Jugador2 SMALLINT UNSIGNED NOT NULL,
    Color_jugador2 ENUM('Blancas','Negras') NOT NULL,
    Arbitro SMALLINT UNSIGNED NOT NULL,
    Id_sala SMALLINT UNSIGNED,
    Entradas_vendidas INTEGER UNSIGNED NOT NULL,
    Foreign Key (Jugador1) REFERENCES Jugador(N_asociado) ON UPDATE CASCADE ON DELETE RESTRICT,
    Foreign Key (Jugador2) REFERENCES Jugador(N_asociado) ON UPDATE CASCADE ON DELETE RESTRICT,
    Foreign Key (Arbitro) REFERENCES Arbitro(N_asociado) ON UPDATE CASCADE ON DELETE RESTRICT,
    Foreign Key (Id_sala) REFERENCES Sala(Id_sala) ON UPDATE CASCADE ON DELETE SET NULL
);
CREATE TABLE Movimiento (
    Codigo BIGINT UNSIGNED NOT NULL PRIMARY KEY,
    Comentario TEXT NOT NULL,
    Jugada VARCHAR(40),
    Cod_partida SMALLINT UNSIGNED NOT NULL,
    Foreign Key (Cod_partida) REFERENCES Partida(Cod_partida) ON UPDATE CASCADE ON DELETE CASCADE
);