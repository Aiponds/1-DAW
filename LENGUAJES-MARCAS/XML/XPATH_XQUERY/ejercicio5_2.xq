<table border="1">
<tr>
  <th>Nombre</th>
  <th>Tipo</th>
  <th>Director</th>
</tr>
{
  for $i in /netflix/produccion
  
  return
  <tr>
    <td>{data($i/nombre)}</td>
    <td>{data($i/nombre/@tipo)}</td>
    <td>{data($i/director)}</td>
  </tr>
}
</table>