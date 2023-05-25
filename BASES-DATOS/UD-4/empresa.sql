CREATE TABLE Clientes(  
    Dni CHAR(9) PRIMARY KEY,
    Nombre VARCHAR(20),
    Apellidos VARCHAR(40),
    Direccion VARCHAR(40),
    Fecha_nac DATE
);
CREATE TABLE Proveedores(
    Nif CHAR(9) PRIMARY KEY,
    Nombre VARCHAR(20),
    Direccion VARCHAR(40)
);
CREATE TABLE Productos(
    Codigo SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(20),
    Precio FLOAT UNSIGNED,
    Nif_proveedor CHAR(9),
    Foreign Key (Nif_proveedor) REFERENCES Proveedores(Nif) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE Compras (
    Dni_cliente CHAR(9),
    Cod_producto SMALLINT UNSIGNED,
    PRIMARY KEY(Dni_cliente, Cod_producto),
    Foreign Key (Dni_cliente) REFERENCES Clientes(Dni) ON UPDATE CASCADE ON DELETE CASCADE,
    Foreign Key (Cod_producto) REFERENCES Productos(Codigo) ON UPDATE CASCADE ON DELETE CASCADE
);