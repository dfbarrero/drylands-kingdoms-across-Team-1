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
 * A group layer, used to organize the layers of the map in a<br>
 * hierarchy. Its attributes `offsetx`, `offsety`, `opacity` and<br>
 * `visible` recursively affect child layers.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Group", propOrder = {
    "properties",
    "layer",
    "objectgroup",
    "imagelayer",
    "group"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
public class Group {

    /**
     * 
     */
    @XmlElement(required = true, type = Properties.class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Properties properties;
    /**
     * 
     */
    @XmlElement(required = true, type = TileLayer.class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected List<TileLayerData> layer;
    /**
     * 
     */
    @XmlElement(required = true, type = ObjectGroup.class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected List<ObjectGroupData> objectgroup;
    /**
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected List<ImageLayer> imagelayer;
    /**
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected List<Group> group;
    /**
     * The name of the group layer.
     * 
     */
    @XmlAttribute(name = "name")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected String name;
    /**
     * Rendering offset of the group layer in pixels.<br>
     * Defaults to 0.
     * 
     */
    @XmlAttribute(name = "offsetx")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Integer offsetx;
    /**
     * Rendering offset of the group layer in pixels.<br>
     * Defaults to 0.
     * 
     */
    @XmlAttribute(name = "offsety")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Integer offsety;
    /**
     * The x position of the group layer in pixels.<br>
     * <br>
     * @deprecated since 0.15
     * 
     */
    @XmlAttribute(name = "x")
    @Deprecated
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Integer x;
    /**
     * The y position of the group layer in pixels.<br>
     * <br>
     * @deprecated since 0.15
     * 
     */
    @XmlAttribute(name = "y")
    @Deprecated
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Integer y;
    /**
     * The opacity of the layer as a value from 0 to 1.<br>
     * Defaults to 1.
     * 
     */
    @XmlAttribute(name = "opacity")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Double opacity;
    /**
     * Whether the layer is shown (1) or hidden (0).<br>
     * Defaults to 1.
     * 
     */
    @XmlAttribute(name = "visible")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean visible;

    /**
     * 
     * @return
     *     possible object is
     *     {@link PropertiesData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public PropertiesData getProperties() {
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
    public void setProperties(PropertiesData value) {
        this.properties = ((Properties) value);
    }

    /**
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public List<TileLayerData> getLayer() {
        if (layer == null) {
            layer = new ArrayList<TileLayerData>();
        }
        return this.layer;
    }

    /**
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
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public List<ImageLayer> getImagelayer() {
        if (imagelayer == null) {
            imagelayer = new ArrayList<ImageLayer>();
        }
        return this.imagelayer;
    }

    /**
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public List<Group> getGroup() {
        if (group == null) {
            group = new ArrayList<Group>();
        }
        return this.group;
    }

    /**
     * The name of the group layer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public String getName() {
        return name;
    }

    /**
     * The name of the group layer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Rendering offset of the group layer in pixels.<br>
     * Defaults to 0.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Integer getOffsetx() {
        return offsetx;
    }

    /**
     * Rendering offset of the group layer in pixels.<br>
     * Defaults to 0.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setOffsetx(Integer value) {
        this.offsetx = value;
    }

    /**
     * Rendering offset of the group layer in pixels.<br>
     * Defaults to 0.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Integer getOffsety() {
        return offsety;
    }

    /**
     * Rendering offset of the group layer in pixels.<br>
     * Defaults to 0.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setOffsety(Integer value) {
        this.offsety = value;
    }

    /**
     * The x position of the group layer in pixels.<br>
     * <br>
     * @deprecated since 0.15
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Deprecated
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Integer getX() {
        return x;
    }

    /**
     * The x position of the group layer in pixels.<br>
     * <br>
     * @deprecated since 0.15
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Deprecated
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setX(Integer value) {
        this.x = value;
    }

    /**
     * The y position of the group layer in pixels.<br>
     * <br>
     * @deprecated since 0.15
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Deprecated
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Integer getY() {
        return y;
    }

    /**
     * The y position of the group layer in pixels.<br>
     * <br>
     * @deprecated since 0.15
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Deprecated
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setY(Integer value) {
        this.y = value;
    }

    /**
     * The opacity of the layer as a value from 0 to 1.<br>
     * Defaults to 1.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Double getOpacity() {
        return opacity;
    }

    /**
     * The opacity of the layer as a value from 0 to 1.<br>
     * Defaults to 1.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setOpacity(Double value) {
        this.opacity = value;
    }

    /**
     * Whether the layer is shown (1) or hidden (0).<br>
     * Defaults to 1.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Boolean isVisible() {
        return visible;
    }

    /**
     * Whether the layer is shown (1) or hidden (0).<br>
     * Defaults to 1.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setVisible(Boolean value) {
        this.visible = value;
    }

}
