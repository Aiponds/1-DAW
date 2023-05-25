<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
      <netflix>
        <xsl:for-each select="netflix/produccion">
        <xsl:if test="nombre/@tipo='pelicula'">
          <peliculas>
            <pelicula>
              <nombre><xsl:value-of select="nombre"/></nombre>
              <director><xsl:value-of select="director"/></director>
            </pelicula>
          </peliculas>
        </xsl:if>
        </xsl:for-each>
        <xsl:for-each select="netflix/produccion">
        <xsl:if test="nombre/@tipo='serie'">
          <series>
            <serie>
              <nombre>
                <xsl:choose>
                  <xsl:when test="num_temporadas>'4'">
                    <xsl:attribute name="larga">si</xsl:attribute>
                  </xsl:when>
                  <xsl:otherwise>
                    <xsl:attribute name="larga">no</xsl:attribute>
                  </xsl:otherwise>
                </xsl:choose>
                <xsl:value-of select="nombre"/>
              </nombre>
              <año_estreno><xsl:value-of select="director"/></año_estreno>
              <num_temporadas><xsl:value-of select="num_temporadas"/></num_temporadas>
            </serie>
          </series>
        </xsl:if>
        </xsl:for-each>
        <xsl:for-each select="netflix/produccion">
        <xsl:if test="nombre/@tipo='documental'">
          <documentales>
            <documental>
              <nombre><xsl:value-of select="nombre"/></nombre>
              <director><xsl:value-of select="director"/></director>
            </documental>
          </documentales>
        </xsl:if>
        </xsl:for-each>
      </netflix>
    </xsl:template>
</xsl:stylesheet>