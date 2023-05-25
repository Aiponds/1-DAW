<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/">
    <html>
      <head>
        <title>Plant Catalog</title>
      </head>
      <body>
        <h2>Plantas en el catálogo</h2>
        <ul>
        <xsl:for-each select="VIVERO/CATALOG/PLANT">
          <li>
            <xsl:value-of select="COMMON" />
            <xsl:text> (</xsl:text>
            <xsl:value-of select="BOTANICAL" />
            <xsl:text>)</xsl:text>
          </li>
        </xsl:for-each>
        </ul>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>