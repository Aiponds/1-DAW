#Fichero basico.sql
USE stala_liga;
SELECT * FROM Presidentes;
SELECT * FROM Partidos;
SELECT Nombre, Cod_equipo FROM Jugadores;
SELECT Estadio, Aforo FROM Equipos;
SELECT Nombre, Posicion FROM Jugadores;
SELECT DISTINCT Nombre, Posicion FROM Jugadores;
SELECT Nombre, Cod_Equipo FROM Jugadores WHERE Cod_Equipo='EQ004';
SELECT DISTINCT Nombre, Posicion, Cod_Equipo FROM Jugadores WHERE Cod_Equipo='EQ003';
SELECT Descripcion, Cod_Jugador FROM Goles WHERE Minuto<=45;
SELECT Nombre, Anno FROM Presidentes WHERE Anno>2006;
SELECT * FROM Goles WHERE Minuto>=30 AND Minuto<=60;
SELECT * FROM Equipos WHERE Ciudad LIKE '%s';
SELECT  Nombre, Posicion, Cod_Equipo FROM Jugadores WHERE Cod_Equipo='EQ003' AND Posicion='delantero';
SELECT  Nombre, Posicion, Cod_Equipo FROM Jugadores WHERE Cod_Equipo='EQ003' OR Posicion='delantero';
SELECT * FROM Goles WHERE Descripcion LIKE '%penalti%';
SELECT Nombre FROM Jugadores WHERE Nombre LIKE '%i%';