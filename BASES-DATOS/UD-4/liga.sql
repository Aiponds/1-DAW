DROP DATABASE IF EXISTS Liga;
CREATE DATABASE Liga;

USE Liga;

DROP TABLE IF EXISTS Goles;
DROP TABLE IF EXISTS Jugadores;
DROP TABLE IF EXISTS Partidos;
DROP TABLE IF EXISTS Equipos;
DROP TABLE IF EXISTS Presidentes;

CREATE TABLE Presidentes(
	Dni char(9),
	Nombre varchar(40),
	Apellidos varchar(40),
	Fecha_nac date,
	Anno YEAR,
	CONSTRAINT pk_Presidentes PRIMARY KEY (Dni)
);

CREATE TABLE Equipos (
	Codigo char(5),
	Nombre varchar(40),
	Estadio varchar(40),
	Aforo integer,
	Fundacion date,
	Ciudad varchar(20),
	Presidente char(9),
	CONSTRAINT pk_Equipos PRIMARY KEY (Codigo),
	CONSTRAINT fk_equiposPresidentes FOREIGN KEY (Presidente)
		REFERENCES Presidentes (Dni)
		ON UPDATE CASCADE 
		ON DELETE RESTRICT
);

CREATE TABLE Partidos (
	Codigo char(4),
	Fecha date,
	Equipo_local char(6),
	Equipo_visitante char(6),
	CONSTRAINT pk_Partidos PRIMARY KEY (Codigo),
	CONSTRAINT fk_partidosEquipos1 FOREIGN KEY (Equipo_local)
		REFERENCES Equipos(Codigo)
		ON UPDATE CASCADE 
		ON DELETE RESTRICT,
	CONSTRAINT fk_partidosEquipos2 FOREIGN KEY (Equipo_visitante)
		REFERENCES Equipos(Codigo)
		ON UPDATE CASCADE 
		ON DELETE RESTRICT
);

CREATE TABLE Jugadores (
	Codigo char(5),
	Nombre varchar(40),
	Fecha date,
	Posicion enum('portero', 'defensa', 'centrocampista', 'delantero'),
	Cod_equipo char(5),
	CONSTRAINT pk_Jugadores PRIMARY KEY (Codigo),
	CONSTRAINT fk_jugadoresEquipos FOREIGN KEY (Cod_equipo)
		REFERENCES Equipos(Codigo)
		ON UPDATE CASCADE 
		ON DELETE RESTRICT
);

CREATE TABLE Goles (
	Cod_partido char (4),
	Minuto TINYINT,
	Descripcion text,
	Cod_jugador char(5),
	PropiaPuerta boolean,
	CONSTRAINT pk_Goles PRIMARY KEY (Cod_partido, minuto),
	CONSTRAINT fk_golesPartidos FOREIGN KEY (Cod_partido)
		REFERENCES Partidos(Codigo)
			ON UPDATE CASCADE 
			ON DELETE CASCADE,
	CONSTRAINT fk_golesJugadores FOREIGN KEY (Cod_jugador)
		REFERENCES Jugadores(Codigo)
		ON UPDATE CASCADE 
		ON DELETE RESTRICT
);
