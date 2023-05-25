<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/">
    <html>
      <head>
        <title>Plantas de la zona 4</title>
      </head>
      <body>
        <h2>Plantas de la zona 4 por orden alfabético</h2>
        <ul>
          <xsl:for-each select="/VIVERO/CATALOG/PLANT[ZONE=4]">
            <xsl:sort select="COMMON" data-type="text" order="ascending"/>
            <li>
              <xsl:value-of select="COMMON"/>
            </li>
          </xsl:for-each>
        </ul>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
