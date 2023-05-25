/* Para crear la base de datos empresa:*/
alter session set "_ORACLE_SCRIPT"=true;
create user empresa identified by empresa;
grant ALL PRIVILEGES to empresa;
connect empresa/empresa;

/* 1. CREA EL SIGUIENTE ESQUEMA DE BASE DE DATOS*/
CREATE TABLE Empleado (
    cod_emp varchar2(5) PRIMARY KEY,
    Nombre varchar2(20) NOT NULL,
    Apellidos varchar2(40) NOT NULL,
    encargado varchar2(5) NOT NULL,
    Sede_trabajo varchar2(5) NOT NULL,
    sueldo number(4) NOT NULL,
    CONSTRAINT ch_sueldo CHECK (Sueldo BETWEEN 1200 AND 3000)
);
CREATE TABLE Sede (
    Cod_sede varchar2(5) PRIMARY KEY,
    Nombre varchar2(40) NOT NULL,
    Ciudad varchar2(40) NOT NULL
);
ALTER TABLE Empleado
    ADD CONSTRAINT fk_sede
    FOREIGN KEY (Sede_trabajo)
    REFERENCES Sede (Cod_sede);

/*2. INSERTA LOS SIGUIENTES DATOS*/
INSERT INTO Sede VALUES ('S1','Leon','Madrid');
INSERT INTO Sede VALUES ('S2','Tigre','Barcelona');
INSERT INTO Sede VALUES ('S3','Pantera','Bilbao');
INSERT INTO Sede VALUES ('S4','Jaguar','Sevilla');
INSERT INTO Sede VALUES ('S5','Puma','Valencia');
INSERT INTO Empleado VALUES ('C1', 'Pedro', 'Toribio', 'C3', 'S1', 1600);
INSERT INTO Empleado VALUES ('C2', 'Juan', 'Ares', 'C4', 'S1', 1900);
INSERT INTO Empleado VALUES ('C3', 'Mateo', 'Berrizo', 'C2', 'S2', 1900);
INSERT INTO Empleado VALUES ('C4', 'Jesús', 'Cea', 'C3', 'S3', 1600);
INSERT INTO Empleado VALUES ('C5', 'Lucas', 'Dones', 'C3', 'S4', 1500);
INSERT INTO Empleado VALUES ('C6', 'Manuel', 'Espinosa', 'C3', 'S5', 2000);

/*3. REALIZA LAS SIGUIENTES OPERACIONES*/
/* AUMENTA EL SUELDO DE TODOS LOS EMPLEADOS EN 50 EUROS*/
UPDATE Empleado
    SET sueldo=sueldo+50;
/* MUESTRA EL NOMBRE DE TODOS LOS EMPLEADOS JUNTO AL NOMBRE DE SU ENCARGADO*/
SELECT empleado.Nombre AS Empleado, encargado.Nombre AS Encargado
    FROM Empleado empleado, Empleado encargado
    WHERE empleado.encargado = encargado.cod_emp;

