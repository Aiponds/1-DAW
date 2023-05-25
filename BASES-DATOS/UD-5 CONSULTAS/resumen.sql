#Fichero resumen.sql
#SOBRE LA BASE DE DATOS LIGA
USE stala_liga;
SELECT count(*) AS N_equipos FROM Equipos;
SELECT MAX(Fecha_nac) FROM Presidentes;
SELECT MIN(Fecha) FROM Partidos;
SELECT count(*) AS Goles_penalti 
    FROM Goles
    WHERE Descripcion LIKE '%penal%';
SELECT count(*) AS N_porteros
    FROM Jugadores
    WHERE Posicion='portero';
SELECT count(*) AS N_delanteros
    FROM Jugadores, Equipos
    WHERE Jugadores.Cod_equipo = Equipos.Codigo
    AND Equipos.Nombre = 'Atlético Zamora'
    AND Jugadores.Posicion='delantero';
SELECT count(*) AS N_delanteros
    FROM Jugadores, Equipos
    WHERE Jugadores.Cod_equipo = Equipos.Codigo
    AND Equipos.Nombre = 'Atlético Zamora'
    AND Jugadores.Posicion='defensa';
SELECT Nombre, Fecha
    FROM Jugadores
    ORDER BY Fecha
    LIMIT 3;
SELECT Nombre, Fecha
    FROM Jugadores
    ORDER BY Fecha
    LIMIT 3,4;
SELECT count(*) AS Goles_segunda_parte
    FROM Goles
    WHERE Minuto>45;
SELECT count(*) AS Jugadores_por_P
    FROM Jugadores
    WHERE Nombre LIKE 'P%';
SELECT MAX(Aforo) FROM Equipos;
SELECT AVG(Aforo) FROM Equipos, Presidentes
    WHERE Equipos.Presidente = Presidentes.Dni
    AND Presidentes.Apellidos LIKE '%s%';
