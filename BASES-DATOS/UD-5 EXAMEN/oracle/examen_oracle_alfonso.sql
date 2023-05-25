
CREATE TABLE costos(
id_costo char(5),
tipo varchar2(40),
estado varchar2(40),
precio number (5,2),
CONSTRAINT PK_idcosto PRIMARY KEY (id_costo)
);


CREATE TABLE perteneciales(
id_pertenecia char(10),
descripcion varchar2(40),
tipo varchar2(40),
estado varchar2(40),
caracteristicas varchar2(40),
extras varchar2(40),
avaluo varchar2(40),
observaciones varchar2(40),
costo number(5,2),
fecha_ingreso date,
fecha_retiro date,
fecha_limite date,
CONSTRAINT PK_idpertenencia PRIMARY KEY (id_pertenecia),
CONSTRAINT FK_costo FOREIGN KEY (costo)
	REFERENCES costos (precio)
);



CREATE TABLE cliente(
id_cliente char(5),
nombre_cliente varchar2(40),
direccion varchar2(40),
telefono varchar2(9),
RFC varchar2(13),
IFE number(5,2),
correo electronico varchar2(40),
pertenecia char(10),
CONSTRAINT PK_idcliente PRIMARY KEY (id_cliente),
CONSTRAINT FK_clientepertencia FOREIGN KEY (pertenecia)
	REFERENCES perteneciales (id_pertenecia)
);


CREATE TABLE movimientos(
id_movimientos char(5),
tipo varchar2(40),
fecha_movimiento date,
nombre_cliente char(5),
pertenecia char(10),
cantidad varchar2(5),
adeudo number(5,2),
CONSTRAINT PK_idmovimientos PRIMARY KEY (id_movimientos),
CONSTRAINT FK_pertenencia FOREIGN KEY (pertenecia)
	REFERENCES perteneciales (id_pertenecia)
);



INSERT INTO cliente VALUES ( '11111','alfonso','c/camino del rey','111111111','1111111111111','300,30','alfonso@gmail.com','11111');
INSERT INTO cliente VALUES ( '22222','dario','c/san isidro','222222222','2222222222222','400,30','dario@gmail.com','22222');
INSERT INTO cliente VALUES ( '33333','jesus','ctra/los baños','333333333','3333333333333','500,30','jesus@gmail.com','33333');


INSERT INTO perteneciales VALUES ('11111','esto es la descripcion1','tipo1','estado1','caracteristica1','esxtras1','avaluo1','observaciones1','15,15','1-1-2020','2-2-2020','3-3-2020');
INSERT INTO perteneciales VALUES ('22222','esto es la descripcion2','tipo2','estado2','caracteristica2','esxtras2','avaluo2','observaciones2','30,15','14-1-2020','2-4-2020','3-6-2020');
INSERT INTO perteneciales VALUES ('33333','esto es la descripcion3','tipo3','estado3','caracteristica3','esxtras3','avaluo3','observaciones3','45,15','1-5-2020','2-8-2020','3-9-2020');


INSERT INTO costos VALUES ('12345','tipo4','estado4','15,15');
INSERT INTO costos VALUES ('54321','tipo5','estado5','30,15');
INSERT INTO costos VALUES ('67891','tipo6','estado6','45,15');


INSERT INTO movimientos VALUES ('11111','tipomov1','15-4-2020','alfonso','11111','12345','15,30');
INSERT INTO movimientos VALUES ('22222','tipomov2','29-8-2020','dario','22222','54321','30,30');
INSERT INTO movimientos VALUES ('33333','tipomov3','27-7-2020','jesus','33333','56789','60,40');


UPDATE movimientos SET adeudo=adeudo+30;