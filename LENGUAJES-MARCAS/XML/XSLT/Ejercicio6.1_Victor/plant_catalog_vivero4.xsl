<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/">
    <html>
      <head>
        <title>Pedido</title>
      </head>
      <body>
        <h2>Pedido del cliente con DNI: 75112318Z</h2>
        <table border="1px">
          <tr>
            <td>
              Nombre: Irene Gazquez<br/><br/>
              Dirección: C/Medina, 12 Almería<br/><br/>
              DNI: 75112318Z
            </td>
            <td>Pedido nº1</td>
          </tr>
          <tr>
            <th>Nombre común</th>
            <th>Precio</th>
          </tr>
          <xsl:for-each select="/VIVERO/CATALOG/PLANT">
            <tr>
              <td><xsl:value-of select="COMMON"/></td>
              <td><xsl:value-of select="PRICE"/></td>
            </tr>
          </xsl:for-each>
          <tr>
            <td>Total:</td>
            <td><xsl:value-of select="sum(/VIVERO/CATALOG/PLANT/PRICE)"/></td>
          </tr>
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
