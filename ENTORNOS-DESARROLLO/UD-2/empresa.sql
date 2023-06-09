SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS Compra;
DROP TABLE IF EXISTS Cliente;
DROP TABLE IF EXISTS Producto;
DROP TABLE IF EXISTS Proveedor;




/* Create Tables */

CREATE TABLE Cliente
(
	Dni char(9) NOT NULL,
	Nombre varchar(20) NOT NULL,
	Apellidos varchar(20) NOT NULL,
	Direccion varchar(50) NOT NULL,
	Fecha_nac date NOT NULL,
	PRIMARY KEY (Dni)
);


CREATE TABLE Compra
(
	Dni char(9) NOT NULL,
	Codigo int NOT NULL,
	Fecha date
);


CREATE TABLE Producto
(
	Codigo int NOT NULL,
	Nombre varchar(20),
	Precio numeric,
	NIF char(9) NOT NULL,
	PRIMARY KEY (Codigo)
);


CREATE TABLE Proveedor
(
	NIF char(9) NOT NULL,
	Nombre varchar(20),
	Direccion varchar(50),
	PRIMARY KEY (NIF)
);



/* Create Foreign Keys */

ALTER TABLE Compra
	ADD FOREIGN KEY (Dni)
	REFERENCES Cliente (Dni)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Compra
	ADD FOREIGN KEY (Codigo)
	REFERENCES Producto (Codigo)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Producto
	ADD FOREIGN KEY (NIF)
	REFERENCES Proveedor (NIF)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



