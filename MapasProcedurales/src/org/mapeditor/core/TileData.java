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

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tile", propOrder = {
    "properties",
    "imageData",
    "objectgroup",
    "animation"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
public class TileData {

    /**
     * 
     */
    @XmlElement(required = true, type = Properties.class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Properties properties;
    /**
     * @since 0.9
     * 
     */
    @XmlElement(name = "image", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected ImageData imageData;
    /**
     * @since 0.10
     * 
     */
    @XmlElement(required = true, type = ObjectGroup.class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected List<ObjectGroupData> objectgroup;
    /**
     * @since 0.10
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Animation animation;
    /**
     * The local tile ID within its tileset.
     * 
     */
    @XmlAttribute(name = "id")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Integer id;
    /**
     * The type of the tile. Refers to an object type and is used<br>
     * by tile objects. (optional)<br>
     * <br>
     * @since 1.0
     * 
     */
    @XmlAttribute(name = "type")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected String type;
    /**
     * Defines the terrain type of each corner of the tile, given<br>
     * as comma-separated indexes in the terrain types array in the<br>
     * order top-left, top-right, bottom-left, bottom-right.<br>
     * Leaving out a value means that corner has no terrain.<br>
     * (optional)<br>
     * <br>
     * @since 0.9
     * 
     */
    @XmlAttribute(name = "terrain")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected String terrain;
    /**
     * A percentage indicating the probability that this tile is<br>
     * chosen when it competes with others while editing with the<br>
     * terrain tool. (optional)<br>
     * <br>
     * @since 0.9
     * 
     */
    @XmlAttribute(name = "probability")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Double probability;

    /**
     * 
     * @return
     *     possible object is
     *     {@link PropertiesData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Properties getProperties() {
        return properties;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link PropertiesData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setProperties(Properties value) {
        this.properties = value;
    }

    /**
     * @since 0.9
     * 
     * @return
     *     possible object is
     *     {@link ImageData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public ImageData getImageData() {
        return imageData;
    }

    /**
     * @since 0.9
     * 
     * @param value
     *     allowed object is
     *     {@link ImageData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setImageData(ImageData value) {
        this.imageData = value;
    }

    /**
     * @since 0.10
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public List<ObjectGroupData> getObjectgroup() {
        if (objectgroup == null) {
            objectgroup = new ArrayList<ObjectGroupData>();
        }
        return this.objectgroup;
    }

    /**
     * @since 0.10
     * 
     * @return
     *     possible object is
     *     {@link Animation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Animation getAnimation() {
        return animation;
    }

    /**
     * @since 0.10
     * 
     * @param value
     *     allowed object is
     *     {@link Animation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setAnimation(Animation value) {
        this.animation = value;
    }

    /**
     * The local tile ID within its tileset.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Integer getId() {
        return id;
    }

    /**
     * The local tile ID within its tileset.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * The type of the tile. Refers to an object type and is used<br>
     * by tile objects. (optional)<br>
     * <br>
     * @since 1.0
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public String getType() {
        return type;
    }

    /**
     * The type of the tile. Refers to an object type and is used<br>
     * by tile objects. (optional)<br>
     * <br>
     * @since 1.0
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Defines the terrain type of each corner of the tile, given<br>
     * as comma-separated indexes in the terrain types array in the<br>
     * order top-left, top-right, bottom-left, bottom-right.<br>
     * Leaving out a value means that corner has no terrain.<br>
     * (optional)<br>
     * <br>
     * @since 0.9
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public String getTerrain() {
        return terrain;
    }

    /**
     * Defines the terrain type of each corner of the tile, given<br>
     * as comma-separated indexes in the terrain types array in the<br>
     * order top-left, top-right, bottom-left, bottom-right.<br>
     * Leaving out a value means that corner has no terrain.<br>
     * (optional)<br>
     * <br>
     * @since 0.9
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setTerrain(String value) {
        this.terrain = value;
    }

    /**
     * A percentage indicating the probability that this tile is<br>
     * chosen when it competes with others while editing with the<br>
     * terrain tool. (optional)<br>
     * <br>
     * @since 0.9
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Double getProbability() {
        return probability;
    }

    /**
     * A percentage indicating the probability that this tile is<br>
     * chosen when it competes with others while editing with the<br>
     * terrain tool. (optional)<br>
     * <br>
     * @since 0.9
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setProbability(Double value) {
        this.probability = value;
    }

}
