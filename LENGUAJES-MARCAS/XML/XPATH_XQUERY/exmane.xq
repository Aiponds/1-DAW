(: Asigna a $i los valores ("Juan", "Pedro", "Antonio") y muéstralos entre etiquetas <nombres>
for $i in ("Juan","Pedro","Antonio")
return 
  <nombres>
    {data($i)}
  </nombres>
:)
(:Genera una tabla en HTML de 3 columnas donde se muestre el titulo, el autor y el precio para todas los libros
<table border="1">
<tr>
  <th>Titulo</th>
  <th>Autor</th>
  <th>Precio</th>
</tr>
{
  for $i in //bookstore/book
  
  return
  <tr>
    <td>{data($i/title)}</td>
    <td>{data($i/author)}</td>
    <td>{data($i/price)}</td>
  </tr>
}
</table>
:)
(:Muestra los títulos de los libros entre etiquetas <ingles> si está escrito en inglés o <español> si lo está en español
for $i in //bookstore/book
return if ($i/title/@lang='en')
 then 
 <ingles>
 {data($i/title)}
 </ingles>
 else if ($i/title/@lang='es')
 then 
 <español>
 {data($i/title)}
 </español>
:)
(:Mostrar los libros (nodos book) cuya categoría sea "WEB" y ordenados por título. En XQuery.
for $i in //bookstore/book
where $i/@category='WEB'
order by $i/title
return $i
:)
(:Crea una tabla en HTML con 3 columnas, para el titulo, autor y precio de coste. El coste es la mitad del precio de venta. ej:)
<table border="1">
<tr>
  <th>Titulo</th>
  <th>Autor</th>
  <th>Precio de coste</th>
</tr>
{
  for $i in //bookstore/book
  return
  <tr>
    <td>{data($i/title)}</td>
    <td>{data($i/author)}</td>
    <td>{data($i/price div 2)}</td>
  </tr>
}
</table>