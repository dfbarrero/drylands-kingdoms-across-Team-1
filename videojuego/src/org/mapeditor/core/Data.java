/*-
 * #%L
 * libtiled
 * %%
 * Copyright (C) 2004 - 2018 Thorbj?rn Lindeijer <thorbjorn@lindeijer.nl>
 * %%
 * Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:

1. Redistributions of source code must retain the above copyright notice,
   this list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright notice,
   this list of conditions and the following disclaimer in the documentation
   and/or other materials provided with the distribution.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
POSSIBILITY OF SUCH DAMAGE.
 * #L%
 */
//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci?n de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder?n si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.16 a las 09:35:28 PM CEST 
//


package org.mapeditor.core;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * When no encoding or compression is given, the tiles are stored<br>
 * as individual XML `tile` elements. Next to that, the easiest<br>
 * format to parse is the "csv" (comma separated values) format.<br>
 * <br>
 * The base64-encoded and optionally compressed layer data is<br>
 * somewhat more complicated to parse. First you need to<br>
 * base64-decode it, then you may need to decompress it. Now you<br>
 * have an array of bytes, which should be interpreted as an array<br>
 * of unsigned 32-bit integers using little-endian byte ordering.<br>
 * <br>
 * Whatever format you choose for your layer data, you will always<br>
 * end up with so called "global tile IDs" (gids). They are global,<br>
 * since they may refer to a tile from any of the tilesets used by<br>
 * the map. In order to find out from which tileset the tile is you<br>
 * need to find the tileset with the highest `firstgid` that is<br>
 * still lower or equal than the gid. The tilesets are always<br>
 * stored with increasing `firstgid`s.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Data", propOrder = {
    "value"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
public class Data {

    /**
     * 
     */
    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected String value;
    /**
     * The encoding used to encode the tile layer data.<br>
     * When used, it can be "base64" and "csv" at the<br>
     * moment.
     * 
     */
    @XmlAttribute(name = "encoding")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Encoding encoding;
    /**
     * The compression used to compress the tile layer<br>
     * data. Tiled Qt supports "gzip" and "zlib".
     * 
     */
    @XmlAttribute(name = "compression")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Compression compression;

    /**
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * The encoding used to encode the tile layer data.<br>
     * When used, it can be "base64" and "csv" at the<br>
     * moment.
     * 
     * @return
     *     possible object is
     *     {@link Encoding }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Encoding getEncoding() {
        return encoding;
    }

    /**
     * The encoding used to encode the tile layer data.<br>
     * When used, it can be "base64" and "csv" at the<br>
     * moment.
     * 
     * @param value
     *     allowed object is
     *     {@link Encoding }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setEncoding(Encoding value) {
        this.encoding = value;
    }

    /**
     * The compression used to compress the tile layer<br>
     * data. Tiled Qt supports "gzip" and "zlib".
     * 
     * @return
     *     possible object is
     *     {@link Compression }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Compression getCompression() {
        return compression;
    }

    /**
     * The compression used to compress the tile layer<br>
     * data. Tiled Qt supports "gzip" and "zlib".
     * 
     * @param value
     *     allowed object is
     *     {@link Compression }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setCompression(Compression value) {
        this.compression = value;
    }

}
