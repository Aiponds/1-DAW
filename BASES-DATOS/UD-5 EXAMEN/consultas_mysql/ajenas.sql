#Fichero ajenas.sql
#SOBRE LA BASE DE DATOS LIGA
USE stala_liga;
SELECT Equipos.Nombre AS Equipo, Presidentes.Nombre AS Presidente FROM Equipos, Presidentes WHERE Equipos.Presidente=Presidentes.Dni;
SELECT Jugadores.Nombre AS Jugador, Equipos.Nombre AS Equipo FROM Jugadores, Equipos WHERE Jugadores.Cod_equipo=Equipos.Codigo;
SELECT E1.Nombre AS Local, E2.Nombre AS Visitante
    FROM Equipos E1, Equipos E2, Partidos
    WHERE E1.Codigo = Partidos.Equipo_local
    AND E2.Codigo = Partidos.Equipo_visitante
    AND Partidos.Codigo LIKE 'J1%';
SELECT DISTINCT Jugadores.Nombre, Jugadores.Posicion
    FROM Jugadores, Goles
    WHERE Jugadores.Codigo=Goles.Cod_Jugador;
#SOBRE LA BASE DE DATOS INSTITUTO
USE stala_instituto;
SELECT Modulos.Nombre AS Modulo, Profesores.Nombre AS Profesor
    FROM Modulos, Profesores
    WHERE Modulos.Dni_profesor=Profesores.Dni;
SELECT Alum.Nombre AS Alumno, Del.Nombre AS Delegado
    FROM Alumnos AS Alum, Alumnos AS Del, Grupos
    WHERE Grupos.Delegado = Del.N_expdte AND Grupos.Curso = Alum.Curso AND Grupos.Letra = Alum.Letra;
SELECT Alumnos.Nombre
    FROM Alumnos, Matriculas, Modulos
    WHERE Alumnos.N_expdte = Matriculas.Alumno 
    AND Matriculas.Modulo = Modulos.Codigo 
    AND Modulos.Nombre LIKE 'Bases de datos';
SELECT Alumnos.Nombre
    FROM Alumnos, Matriculas, Modulos, Profesores
    WHERE Alumnos.N_expdte = Matriculas.Alumno
    AND Matriculas.Modulo = Modulos.Codigo
    AND Modulos.Dni_profesor = Profesores.Dni
    AND Profesores.Nombre = 'Fernando'
    AND Alumnos.Fecha_nac<'1999-01-01';
SELECT CONCAT(Grupos.Curso,'º', Grupos.Letra) AS Grupo, Alumnos.Nombre AS Delegado
    FROM Grupos, Alumnos
    WHERE Grupos.Delegado = Alumnos.N_expdte
    ORDER BY Grupo;
SELECT DISTINCT Modulos.Nombre
    FROM Modulos, Matriculas, Alumnos, Grupos
    WHERE Grupos.Delegado = Alumnos.N_expdte
    AND Alumnos.N_expdte = Matriculas.Alumno
    AND Matriculas.Modulo = Modulos.Codigo;
SELECT DISTINCT CONCAT(Alumnos.Curso,'º', Alumnos.Letra) AS Grupo
    FROM Alumnos, Matriculas, Modulos, Profesores
    WHERE Profesores.Dni = Modulos.Dni_profesor
    AND Modulos.Codigo = Matriculas.Modulo
    AND Matriculas.Alumno = Alumnos.N_expdte
    AND Profesores.Nombre='Macarena';
