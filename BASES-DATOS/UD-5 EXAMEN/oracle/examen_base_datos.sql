Examen Tema 4


CREATE TABLE  costos(
id_costo char (5),
tipo varchar (40),
estado varchar (40),
precio float,
CONSTRAINT pk_costos PRIMARY KEY (id_costo)
);

CREATE TABLE pertenencias(
id_pertenencia char (5),
descripcion text,
tipo varchar (40),
estado varchar (40),
caracteristicas varchar (40),
extras varchar (40),
avaluo varchar (40),
observaciones text,
costo float,
fecha_ingreso date,
fecha_retiro date, 
fecha_limite date,
CONSTRAINT pk_pertenencias PRIMARY KEY (id_pertenencia),
CONSTRAINT fk_PertenenciasCostos FOREIGN KEY (costo) REFERENCES costos (precio) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE movimientos(
id_movimientos char (5),
tipo varchar (40),
fecha_movimiento date,
nombre_cliente varchar (40),
pertenencia varchar (40),
cantidad integer,
adeudo varchar (40),
CONSTRAINT pk_movimientos PRIMARY KEY (id_movimientos),
CONSTRAINT fk_movimientosPertenencia FOREIGN KEY (pertenencia) REFERENCES pertenencias (id_pertenencia) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE cliente(
id_cliente char(5),
nombre_cliente varchar (40),
direccion varchar (40),
telefono char (9),
IFE varchar (40),
correo_electronico varchar (50),
pertenencias char (5),
CONSTRAINT pk_cliente PRIMARY KEY (id_cliente),
CONSTRAINT fk_clientePertenencias FOREIGN KEY (pertenencia) REFERENCES pertenencias (id_pertenencia)
);

CREATE TABLE puesto(
id_puesto char (5),
nombre_puesto varchar (40),
tipo_puesto varchar (40),
salario float,
horario time,
CONSTRAINT pk_puesto PRIMARY KEY (id_puesto)
);

CREATE TABLE areas(
id_area char (5),
nombre_area varchar (40),
turno varchar (40),
CONSTRAINT pk_area PRIMARY KEY (id_area)
);


CREATE TABLE empleado(
id_empleado char (5),
a_paterno varchar (40),
a_materno varchar (40),
nombre varchar (40),
direccion varchar(40),
telefono char (9),
puesto char (5),
id_area char (5),
CONSTRAINT pk_empleados PRIMARY KEY (id_empleado),
CONSTRAINT fk_empleadosPuesto FOREIGN KEY (puesto) REFERENCES puesto (id_puesto) ON UPDATE CASCADE ON DELETE CASCADE,
CONSTRAINT fkempleadoAreas FOREIGN KEY (id_area) REFERENCES areas (id_area) ON UPDATE CASCADE ON DELETE CASCADE
);


teoria
1)
a)select version();
b)select current date();
c)select current datetime();
d)select user();
e)select all user();
f) show tables;
g) use NombreBD ;
h) use NombreBD; show tables;
i) describe NombreTabla;


2)
a) create user pedro identified "hola";
b) grant all privileges on NombreBD.* to pedro;
c) set password for pedro = password ('adios');


3)
a) Alter Table drop observaciones table pertenencias;
b) Alter table drop puesto table empleados REFERENCES puesto(id_puesto);
c)Alter table modify fecha_limite table pertenencias timestamp
d)Alter table modify estadio column equipo varchar (20);
e)







