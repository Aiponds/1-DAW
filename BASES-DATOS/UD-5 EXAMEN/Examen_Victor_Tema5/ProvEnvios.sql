USE provenvios;
/* 1.Obtener de la tabla de articulos los valores de CodArt y Ciudad done el nombre de la Ciudad acaba en d o contiene almenos una e*/
SELECT CodArt AS Codigo_Articulo, Ciudad 
	FROM articulos 
	WHERE Ciudad LIKE '%e%' 
	OR Ciudad LIKE '%d';
/* 2.Obtener los nombres de los Componentes que pesen entre 15 y 18kg.*/
SELECT Cnombre AS Nombre_Componente
	FROM Componentes
	WHERE Peso>=15 AND Peso<=18;
/* 3.Obtener la Cantidad media de envíos de los Artículos procedentes de Cáceres.*/
SELECT AVG(envios.Cantidad) AS CantidadMedia_EnviosCaceres
	FROM envios, proveedores
	WHERE envios.CodProv = proveedores.CodProv
	AND proveedores.Ciudad='Cáceres';
/* 4.Obtener el Nombre de los Componentes enviados por el Proveedor Juan. No pueden repetirse.*/
SELECT DISTINCT componentes.Cnombre AS NombreComponente_EnviadoPorJuan
	FROM componentes, proveedores, envios
	WHERE componentes.CodComp = envios.CodComp
	AND envios.CodProv = proveedores.CodProv
	AND proveedores.Pnombre='Juan';
/* 5.Obtener la Ciudad de los Proveedores que envían Componentes desde la Ciudad de Sevilla para Artículos procedentes de la misma Ciudad.*/
SELECT proveedores.Ciudad AS CiudadDeProveedor_EnvioDesdeSevilla_ParaSuMismaCiudad
	FROM proveedores, envios, articulos, componentes
	WHERE proveedores.CodProv = envios.CodProv
	AND articulos.CodArt = envios.CodArt
	AND componentes.CodComp = envios.CodComp
	AND componentes.Ciudad ='Sevilla'
	AND articulos.Ciudad = proveedores.Ciudad;