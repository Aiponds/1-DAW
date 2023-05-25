CREATE DATABASE stala_Super;
USE stala_Super;
DROP TABLE IF EXISTS Incluye;
DROP TABLE IF EXISTS Pedidos;
DROP TABLE IF EXISTS Clientes;
DROP TABLE IF EXISTS Repartidores;
DROP TABLE IF EXISTS Zonas;
DROP TABLE IF EXISTS Productos;
DROP TABLE IF EXISTS Categorias;

CREATE TABLE Categorias (
	Nombre varchar(20) PRIMARY KEY,
	Observaciones VARCHAR(100),
	Condiciones enum ('frio', 'congelado', 'seco')
);

CREATE TABLE Productos (
	Nombre varchar(20),
	Marca varchar(20),
	Origen varchar(20),
	Volumen integer,
	Peso integer,
	Foto varchar(60),
	Caracteristicas text,
	Stock integer,
	Cod_categoria varchar(20),
	CONSTRAINT pk_Productos PRIMARY KEY (Nombre, Marca),
	CONSTRAINT fk_productosCategorias FOREIGN KEY (Cod_categoria)
		REFERENCES Categorias (Nombre)
		ON UPDATE CASCADE 
        ON DELETE RESTRICT
);

CREATE TABLE Zonas (
	Codigo_postal char(5),
	CONSTRAINT pk_Zonas PRIMARY KEY (Codigo_postal)
);

CREATE TABLE Repartidores (
	Codigo char(5),
	Nombre varchar(40),
	Matricula char(9),
	Zona char(5),
	CONSTRAINT pk_Repartidores PRIMARY KEY (Codigo),
	CONSTRAINT fk_repartidoresZonas FOREIGN KEY (Zona)
		REFERENCES Zonas (Codigo_postal)
		ON UPDATE CASCADE 
        ON DELETE RESTRICT
);

CREATE TABLE Clientes (
	Dni char(9),
	Nombre varchar(40),
	Direccion varchar(60),
	Tfno char(9),
	Mail varchar(30),
	Password varchar(15),
	Zona char(5),
	CONSTRAINT pk_Clientes PRIMARY KEY (Dni),
	CONSTRAINT fk_clientesZonas FOREIGN KEY (Zona)
		REFERENCES Zonas (Codigo_postal)
		ON UPDATE CASCADE 
        ON DELETE RESTRICT
);

CREATE TABLE Pedidos (
	Codigo char(10),
	Fecha date,
	Direccion varchar(60),
	Importe float,
	Tarjeta char(20),
	Fecha_cad_tjta date,
	Dni_cliente char(9),
	CONSTRAINT pk_Pedidos PRIMARY KEY (Codigo),
	CONSTRAINT fk_pedidosClientes FOREIGN KEY (Dni_cliente)
		REFERENCES Clientes (Dni)
		ON UPDATE CASCADE 
        ON DELETE RESTRICT
);

CREATE TABLE Incluye (
	Cod_pedido char(10),
	Prod_nombre varchar(20),
	Prod_marca varchar(20),
	Cantidad integer,
	CONSTRAINT pk_Incluye PRIMARY KEY (Cod_pedido, Prod_nombre, Prod_marca),
	CONSTRAINT fk_incluyePedidos FOREIGN KEY (Cod_pedido)
		REFERENCES Pedidos (Codigo)
		ON UPDATE CASCADE 
        ON DELETE RESTRICT,
	CONSTRAINT fk_incluyeProductos FOREIGN KEY (Prod_nombre, Prod_marca)
		REFERENCES Productos (Nombre, Marca)
		ON UPDATE CASCADE 
        ON DELETE CASCADE	
);