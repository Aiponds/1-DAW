DROP DATABASE IF EXISTS Startrek;
CREATE DATABASE Startrek;

USE Startrek;

DROP TABLE IF EXISTS Visitas;
DROP TABLE IF EXISTS Planetas;
DROP TABLE IF EXISTS Lanzaderas;
DROP TABLE IF EXISTS Naves;
DROP TABLE IF EXISTS Participa;
DROP TABLE IF EXISTS Capitulos;
DROP TABLE IF EXISTS Aparece;
DROP TABLE IF EXISTS Peliculas;
DROP TABLE IF EXISTS Actores;
DROP TABLE IF EXISTS Depende;
DROP TABLE IF EXISTS Humanos;
DROP TABLE IF EXISTS Vulcanos;
DROP TABLE IF EXISTS Klingons;
DROP TABLE IF EXISTS Personajes;

CREATE TABLE Personajes (
	Nombre varchar(40),
	Grado enum ('capitán', 'teniente', 'almirante'),
	CONSTRAINT pk_Personajes PRIMARY KEY (Nombre)
);

CREATE TABLE Humanos (
	Personaje varchar(40),
	Fecha_nac date,
	Ciudad varchar(2),
	CONSTRAINT pk_Humanos PRIMARY KEY (Personaje),
	CONSTRAINT fk_humanosPersonajes FOREIGN KEY (Personaje)
		REFERENCES Personajes (Nombre)
		ON UPDATE CASCADE 
        ON DELETE CASCADE
);

CREATE TABLE Vulcanos (
	Personaje varchar(40),
	Fecha_grad date,
	Mentor varchar(40),
	CONSTRAINT pk_Vulcanos PRIMARY KEY (Personaje),
	CONSTRAINT fk_vulcanosPersonajes FOREIGN KEY (Personaje)
		REFERENCES Personajes (Nombre)
		ON UPDATE CASCADE 
        ON DELETE CASCADE
);

CREATE TABLE Klingons (
	Personaje varchar(40),
	Fecha_combate date,
	Planeta varchar(30),
	CONSTRAINT pk_Klingons PRIMARY KEY (Personaje),
	CONSTRAINT fk_klingonsPersonajes FOREIGN KEY (Personaje)
		REFERENCES Personajes (Nombre)
		ON UPDATE CASCADE 
        ON DELETE CASCADE
);

CREATE TABLE Depende (
	Mando varchar(40),
	Subordinado varchar(40),
	CONSTRAINT pk_Depende PRIMARY KEY (Mando, Subordinado),
	CONSTRAINT fk_dependePersonajes1 FOREIGN KEY (Mando)
		REFERENCES Personajes (Nombre)
		ON UPDATE CASCADE 
        ON DELETE CASCADE,
	CONSTRAINT fk_dependePersonajes2 FOREIGN KEY (Subordinado)
		REFERENCES Personajes (Nombre)
		ON UPDATE CASCADE 
        ON DELETE CASCADE
);

CREATE TABLE Actores (
	Codigo char(7),
	Nombre varchar(40),
	Nacionalidad varchar(20),
	Fecha_nac date,
	Personaje varchar(40),
	CONSTRAINT pk_Actores PRIMARY KEY (Codigo),
	CONSTRAINT fk_actoresPersonajes FOREIGN KEY (Personaje)
		REFERENCES Personajes(Nombre)
		ON UPDATE CASCADE 
        ON DELETE RESTRICT
);

CREATE TABLE Peliculas (
	Titulo varchar(50),
	Director varchar(40),
	Anno year NOT NULL,
	Protagonista varchar(40),
	CONSTRAINT pk_Peliculas PRIMARY KEY (Titulo),
	CONSTRAINT fk_peliculasPersonajes FOREIGN KEY (Protagonista)
		REFERENCES Personajes(Nombre)
		ON UPDATE CASCADE
        ON DELETE RESTRICT
);

CREATE TABLE Aparece (
	Pelicula varchar(50),
	Personaje varchar(40),
	CONSTRAINT pk_Aparece PRIMARY KEY (Pelicula, Personaje),
	CONSTRAINT fk_aparecePeliculas FOREIGN KEY (Pelicula)
		REFERENCES Peliculas (Titulo)
		ON UPDATE CASCADE 
        ON DELETE CASCADE,
	CONSTRAINT fk_aparecePersonajes FOREIGN KEY (Personaje)
		REFERENCES Personajes (Nombre)
		ON UPDATE CASCADE 
        ON DELETE CASCADE
);

CREATE TABLE Capitulos (
	Temporada TINYINT,
	Orden TINYINT,
	Titulo varchar(50),
	Fecha date,
	CONSTRAINT pk_apitulos PRIMARY KEY (Temporada, Orden)
);

CREATE TABLE Participa (
	Personaje varchar(40),
	Cap_temp TINYINT,
	Cap_orden TINYINT,
	CONSTRAINT pk_Participa PRIMARY KEY (Personaje, Cap_temp, Cap_orden),
	CONSTRAINT fk_participaPersonajes FOREIGN KEY (Personaje)
		REFERENCES Personajes(Nombre)
		ON UPDATE CASCADE 
        ON DELETE CASCADE,
	CONSTRAINT fk_participaCapitulos FOREIGN KEY (Cap_temp, Cap_orden)
		REFERENCES Capitulos (Temporada, Orden)
		ON UPDATE CASCADE 
        ON DELETE CASCADE
);

CREATE TABLE Naves (
	Codigo char(3),
	N_tripulantes integer,
	CONSTRAINT pk_Naves PRIMARY KEY (Codigo)
);

CREATE TABLE Lanzaderas (
	Cod_nave char(3),
	Numero TINYINT,
	Capacidad integer,
	CONSTRAINT pk_Lanzaderas PRIMARY KEY (Cod_nave, Numero),
	CONSTRAINT fk_lanzaderasNaves FOREIGN KEY (Cod_nave)
		REFERENCES Naves (Codigo)
		ON UPDATE CASCADE 
        ON DELETE CASCADE
);

CREATE TABLE Planetas (
	Codigo char(5),
	Nombre varchar(20),
	Galaxia varchar(20),
	Problema text,
	CONSTRAINT pk_Planetas PRIMARY KEY (Codigo)
);

CREATE TABLE Visitas (
	Codigo char(5),
	Cod_temp TINYINT,
	Cod_orden TINYINT,
	Cod_planeta char(5),
	Cod_nave char (3),
	CONSTRAINT pk_Visitas PRIMARY KEY (Codigo),
	CONSTRAINT fk_visitasCapitulos FOREIGN KEY(Cod_temp, Cod_orden)
		REFERENCES Capitulos(Temporada, Orden)
		ON UPDATE CASCADE 
        ON DELETE CASCADE,
	CONSTRAINT fk_visitasPlanetas FOREIGN KEY(Cod_planeta)
		REFERENCES Planetas (Codigo)
		ON UPDATE CASCADE 
        ON DELETE RESTRICT,
	CONSTRAINT fk_visitasNaves FOREIGN KEY(Cod_nave)
		REFERENCES Naves(Codigo)
		ON UPDATE CASCADE 
        ON DELETE RESTRICT
);
