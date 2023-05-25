CREATE TABLE Clientes(  
    Cod_cliente SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Nif CHAR(9) UNIQUE,
    Nombre VARCHAR(20),
    Direccion VARCHAR(40),
    Ciudad VARCHAR(40),
    Telefono VARCHAR(15)
);
CREATE TABLE Vehiculos(
    Matricula CHAR(7) PRIMARY KEY,
    Marca VARCHAR(20),
    Modelo VARCHAR(40),
    Color VARCHAR(40),
    Precio FLOAT(8,2) UNSIGNED
);
CREATE TABLE Compras(
    Matricula CHAR(7),
    Cod_comprador SMALLINT UNSIGNED,
    PRIMARY KEY(Matricula, Cod_comprador),
    Foreign Key (Matricula) REFERENCES Vehiculos(Matricula) ON UPDATE CASCADE ON DELETE CASCADE,
    Foreign Key (Cod_comprador) REFERENCES Clientes(Cod_cliente) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE Revisiones(
    Cod_revision SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Filtro BOOLEAN,
    Aceite BOOLEAN,
    Frenos BOOLEAN,
    Otros VARCHAR(100),
    Matricula CHAR(7),
    Foreign Key (Matricula) REFERENCES Vehiculos(Matricula) ON UPDATE CASCADE ON DELETE RESTRICT
);