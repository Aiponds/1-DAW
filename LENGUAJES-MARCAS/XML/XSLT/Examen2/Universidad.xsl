<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:output method="html" indent="yes"/>
  <xsl:template match="/">
    <html>
      <body>
        <table border="1px">
          <tr>
            <th>Alumno</th>
            <th>Carrera</th>
            <th>Asignaturas</th>
          </tr>
          <xsl:for-each select="universidad/alumnos/alumno">
            <tr>
              <td>
                <xsl:value-of select="concat(nombre, ' ', apellido1, ' ', apellido2)"/>
              </td>
              <td>
                <xsl:value-of select="estudios/carrera/@codigo"/>
              </td>
              <td>
                <xsl:for-each select="estudios/asignaturas/asignatura">
                  <xsl:value-of select="@codigo"/>
                  <xsl:text> </xsl:text>
                </xsl:for-each>
              </td>
            </tr>
          </xsl:for-each>
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
