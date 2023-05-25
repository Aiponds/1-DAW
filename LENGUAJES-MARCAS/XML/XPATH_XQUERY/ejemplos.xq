(:QUE DEVUELVA EL ORDEN DE NODO, EL NOMBRE ENTRE ETIQUETAS <produccion_indice> ordenado por tipo
for $i at $indice in //produccion
order by $i/nombre/@tipo
return
  <produccion_indice>
  {$indice}.{data($iz/nombre)}
  </produccion_indice>
:)
(:QUE DEVUELVA EL ORDEN DE NODO Y EL NODO PRODUCCION DEL NODO CUYO NOMBRE ES BREAKING BAD
for $i at $indice in //produccion
where $i/nombre='Breaking Bad'
return 
  <resultado>
    {$indice,'. ', data($i)}
  </resultado>
:)
(: ASIGNA EL VALOR "hola" a la variable $a, muestra su contenido en mayúsculas. 
let $a := "hola"
return upper-case($a)
:)
(: MUESTRA LOS NOMBRES EN MAYUSCULA
for $i in //produccion/nombre
return upper-case($i)
:)
(: MUESTRA LOS NOMBRES EN MAYUSCULA y el original
for $i in //produccion
let $mayus:=upper-case(data($i/nombre))
return (data($i/nombre), $mayus)
:)
(:nose
let $i:=("1","2","3"), $a:= ("a","b","c")
return ($i, $a)
:)
(:estructura crear etiquetas
let $nombre:="Breaking Bad", $temporadas:="5"
return
  <serie>
    {
      <nombre>{$nombre}</nombre>,
      <num_temporadas>{$temporadas}</num_temporadas>
    }
  </serie>
:)
(:DEVOLVER NODOS CON ETIQUETA <SERIE> LOS NOMBRES DE TODAS LAS SERIES DEL ARCHIVO XML
for $i in //produccion/nombre
where $i/@tipo='serie'
return
  <serie>
    {data($i)}
  </serie>
:)
(:Devolve los titulos de las series entre etiquetas <larga> si tiene mnas de 4 temporadas y <corta> si tiene menos.
for $i in /netflix/produccion
where $i/nombre/@tipo="serie"
return
  if ($i/num_temporadas>4)
  then
    <larga>
      {data($i/nombre)}
    </larga>
  else
    <corta>
      {data($i/nombre)}
    </corta>
:)
(:Devuelve los titulos de las series y numero de temporadas (concatendaso con un espacio) cuando la serie tenga mas de 4 temporadas y ordenada por su nombre
for $i in /netflix/produccion
let $nombre:=$i/nombre
where (($nombre/@tipo="serie") and ($i/num_temporadas>4))
order by $i/nombre
return 
  <serie>
  {concat($nombre," ",$i/num_temporadas)}
  </serie>
:)
(:CONSTRUYE UNA TABLA CON 3 COLUMNAS (NOMBRE SERIE, NUM TEMPORADAS Y CREADOR:)
<table border="1">
<tr>
  <th>Lista de Series</th>
  <th>Temporadas</th>
  <th>Director</th>
</tr>
{
  for $i in /netflix/produccion
  where $i/nombre/@tipo="serie"
  return
  <tr>
    <td>{data($i/nombre)}</td>
    <td>{data($i/num_temporadas)}</td>
    <td>{data($i/director)}</td>
  </tr>
}
</table>