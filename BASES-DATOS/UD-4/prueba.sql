DROP DATABASE IF EXISTS stala_SisMontanoso;
CREATE DATABASE stala_SisMontanoso;
USE stala_SisMontanoso;

DROP TABLE IF EXISTS Monte;
DROP TABLE IF EXISTS Encuentra;
DROP TABLE IF EXISTS Ocupa;
DROP TABLE IF EXISTS Provincia;
DROP TABLE IF EXISTS Pasa;
DROP TABLE IF EXISTS Rio;
DROP TABLE IF EXISTS Monitoriza;
DROP TABLE IF EXISTS Satelite;
DROP TABLE IF EXISTS Volcanico;
DROP TABLE IF EXISTS Plegamiento;
DROP TABLE IF EXISTS Sistema_Montanoso;

CREATE TABLE Sistema_Montanoso (
    Codigo SMALLINT UNSIGNED PRIMARY KEY,
    Nombre VARCHAR(40),
    Altura_maxima INTEGER UNSIGNED,
    Longitud INTEGER UNSIGNED,
    Orientacion ENUM('N','S','E','O')
);

CREATE TABLE Monte (
    Codigo SMALLINT UNSIGNED PRIMARY KEY,
    Nombre VARCHAR(40),
    Descripcion VARCHAR(100),
    Altura INTEGER UNSIGNED,
    Cod_Sistema_Montanoso SMALLINT UNSIGNED,
    Foreign Key (Cod_Sistema_Montanoso) REFERENCES Sistema_Montanoso(Codigo) ON UPDATE CASCADE ON DELETE SET NULL
);
CREATE TABLE Plegamiento (
    Codigo SMALLINT UNSIGNED PRIMARY KEY,
    Periodo_volcanico VARCHAR(50),
    Foreign Key (Codigo) REFERENCES Monte(Codigo) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE Volcanico (
    Codigo SMALLINT UNSIGNED PRIMARY KEY,
    Tipo VARCHAR(50),
    Foreign Key (Codigo) REFERENCES Monte(Codigo) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE Provincia (
    Codigo SMALLINT UNSIGNED PRIMARY KEY,
    Nombre VARCHAR(40),
    N_habitantes INTEGER UNSIGNED
);
CREATE TABLE Ocupa (
    Cod_Sistema_Montanoso SMALLINT UNSIGNED,
    Cod_Provincia SMALLINT UNSIGNED,
    PRIMARY KEY (Cod_Sistema_Montanoso, Cod_Provincia),
    Foreign Key (Cod_Sistema_Montanoso) REFERENCES Sistema_Montanoso(Codigo) ON UPDATE CASCADE ON DELETE CASCADE,
    Foreign Key (Cod_Provincia) REFERENCES Provincia(Codigo) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE Encuentra (
    Cod_Monte SMALLINT UNSIGNED,
    Cod_Provincia SMALLINT UNSIGNED,
    Foreign Key (Cod_Monte) REFERENCES Monte(Codigo) ON UPDATE CASCADE ON DELETE CASCADE,
    Foreign Key (Cod_Provincia) REFERENCES Provincia(Codigo) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE Satelite (
    Id_Satelite SMALLINT UNSIGNED PRIMARY KEY,
    Nombre VARCHAR(40),
    Descripcion VARCHAR(100)
);
CREATE TABLE Monitoriza (
    Cod_Monte SMALLINT UNSIGNED PRIMARY KEY,
    Cod_Satelite SMALLINT UNSIGNED,
    Fecha DATE,
    Foreign Key (Cod_Monte) REFERENCES Monte(Codigo) ON UPDATE CASCADE ON DELETE CASCADE,
    Foreign Key (Cod_Satelite) REFERENCES Satelite(Id_Satelite) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE Rio (
    Codigo SMALLINT UNSIGNED PRIMARY KEY,
    Nombre VARCHAR(40),
    Descripcion VARCHAR(100),
    Longitud INTEGER UNSIGNED,
    Rio_Principal SMALLINT UNSIGNED,
    Foreign Key (Rio_Principal) REFERENCES Rio(Codigo) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE Pasa (
    Cod_Rio SMALLINT UNSIGNED,
    Cod_Provincia SMALLINT UNSIGNED,
    Longitud INTEGER UNSIGNED,
    PRIMARY KEY (Cod_Rio, Cod_Provincia),
    Foreign Key (Cod_Rio) REFERENCES Rio(Codigo) ON UPDATE CASCADE ON DELETE CASCADE,
    Foreign Key (Cod_Provincia) REFERENCES Provincia(Codigo) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE Monitoriza2 (
    Cod_Rio SMALLINT UNSIGNED PRIMARY KEY,
    Cod_Satelite SMALLINT UNSIGNED,
    Fecha DATE,
    Foreign Key (Cod_Rio) REFERENCES Rio(Codigo) ON UPDATE CASCADE ON DELETE CASCADE,
    Foreign Key (Cod_Satelite) REFERENCES Satelite(Id_Satelite) ON UPDATE CASCADE ON DELETE CASCADE
);