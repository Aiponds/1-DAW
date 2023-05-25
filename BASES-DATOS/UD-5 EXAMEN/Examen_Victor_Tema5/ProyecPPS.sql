USE proyecpps;
/* 6. Obtener una lista de todas las combinaciones posibles Color/Ciudad de las piezas, eliminando las parejas repetidas.*/
SELECT DISTINCT suministros.CodPieza AS Pieza, piezas.Color AS Color, piezas.Ciudad AS Ciudad 
	FROM piezas, suministros;
/* 7.Obtener todos los Suministros para los cuales la Cantidad no sea nula.*/
SELECT * 
	FROM suministros
	WHERE Cantidad IS NOT NULL;
/* 8.Obtener todas las tripletas de códigos de Proveedor, Pieza y Proyecto tales que el Proveedor, la Pieza y el Proyecto indicados
estén todos en diferente ciudad.*/
SELECT proveedores.CodProv AS Codigo_Proveedor, piezas.CodPieza AS Codigo_Pieza, proyectos.CodProy AS Codigo_Proyecto
	FROM proveedores, piezas, proyectos, suministros
	WHERE proveedores.CodProv = suministros.CodProv
	AND piezas.CodPieza = suministros.CodPieza
	AND proyectos.CodProy = suministros.CodProy
	AND (proyectos.Ciudad != piezas.Ciudad AND piezas.Ciudad != proveedores.Ciudad AND proyectos.Ciudad != proveedores.Ciudad);
/* 9.Obtener todas las parejas de nombres de Ciudad sin repetirse tales que un proveedor de la primera Ciudad suministre Piezas a un Proyecto
en la segunda Ciudad.*/
SELECT DISTINCT proveedores.Ciudad AS Ciudad_Proveedor, proyectos.Ciudad AS Ciudad_Proyecto
	FROM proveedores, proyectos, suministros, piezas
	WHERE proveedores.CodProv = suministros.CodProv
	AND proyectos.CodProy = suministros.CodProy
	AND piezas.CodPieza = suministros.CodPieza;
/* 10.Obtener los codigos de las Piezas suministradas a cualquier Proyecto en Londres.*/
SELECT piezas.CodPieza AS CodigoPieza_SuministradoALondres
	FROM piezas, suministros, proyectos
	WHERE piezas.CodPieza = suministros.CodPieza
	AND suministros.CodProy = proyectos.CodProy
	AND proyectos.Ciudad='Londres';
