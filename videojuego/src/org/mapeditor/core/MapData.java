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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * The `tilewidth` and `tileheight` properties determine the<br>
 * general grid size of the map. The individual tiles may have<br>
 * different sizes. Larger tiles will extend at the top and right<br>
 * (anchored to the bottom left).<br>
 * <br>
 * A map contains three different kinds of layers. Tile layers were<br>
 * once the only type, and are simply called layer, object layers<br>
 * have the objectgroup tag and image layers use the imagelayer<br>
 * tag. The order in which these layers appear is the order in<br>
 * which the layers are rendered by Tiled.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Map", propOrder = {
    "properties",
    "tileSets",
    "layers",
    "group"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
public class MapData {

    /**
     * 
     */
    @XmlElement(required = true, type = Properties.class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Properties properties;
    /**
     * 
     */
    @XmlElement(name = "tileset", required = true, type = TileSet.class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected List<TileSet> tileSets;
    /**
     * 
     */
    @XmlElements({
        @XmlElement(name = "layer", type = TileLayer.class),
        @XmlElement(name = "objectgroup", type = ObjectGroup.class),
        @XmlElement(name = "imagelayer", type = ImageLayer.class)
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected List<MapLayer> layers;
    /**
     * @since 1.0
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected List<Group> group;
    /**
     * The TMX format version. Was "1.0" so far, and will be<br>
     * incremented to match minor Tiled releases.
     * 
     */
    @XmlAttribute(name = "version")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected String version;
    /**
     * The Tiled version used to save the file.<br>
     * May be a date (for snapshot builds).<br>
     * <br>
     * @since 1.0.1
     * 
     */
    @XmlAttribute(name = "tiledversion")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected String tiledversion;
    /**
     * Map orientation. Tiled supports "orthogonal", "isometric",<br>
     * "staggered" (since 0.9) and "hexagonal" (since 0.11).
     * 
     */
    @XmlAttribute(name = "orientation", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Orientation orientation;
    /**
     * The order in which tiles on tile layers are rendered. Valid<br>
     * values are `right-down` (the default), `right-up`,<br>
     * `left-down` and `left-up`. In all cases, the map is drawn<br>
     * row-by-row. (since 0.10, but only supported for orthogonal<br>
     * maps at the moment)
     * 
     */
    @XmlAttribute(name = "renderorder")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected RenderOrder renderorder;
    /**
     * The map width in tiles.
     * 
     */
    @XmlAttribute(name = "width", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected int width;
    /**
     * The map height in tiles.
     * 
     */
    @XmlAttribute(name = "height", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected int height;
    /**
     * The width of a tile.
     * 
     */
    @XmlAttribute(name = "tilewidth", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected int tileWidth;
    /**
     * The height of a tile.
     * 
     */
    @XmlAttribute(name = "tileheight", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected int tileHeight;
    /**
     * Only for hexagonal maps. Determines the width or height<br>
     * (depending on the staggered axis) of the tile's edge, in<br>
     * pixels.
     * 
     */
    @XmlAttribute(name = "hexsidelength")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Integer hexSideLength;
    /**
     * For staggered and hexagonal maps, determines which axis<br>
     * ("x" or "y") is staggered.<br>
     * <br>
     * @since 0.11
     * 
     */
    @XmlAttribute(name = "staggeraxis")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected StaggerAxis staggerAxis;
    /**
     * For staggered and hexagonal maps, determines whether the<br>
     * "even" or "odd" indexes along the staggered axis are<br>
     * shifted.<br>
     * <br>
     * @since 0.11
     * 
     */
    @XmlAttribute(name = "staggerindex")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected StaggerIndex staggerIndex;
    /**
     * The background color of the map. (optional, may include<br>
     * alpha value since 0.15 in the form `#AARRGGBB`)<br>
     * <br>
     * @since 0.9
     * 
     */
    @XmlAttribute(name = "backgroundcolor")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected String backgroundcolor;
    /**
     * Stores the next available ID for new objects. This number<br>
     * is stored to prevent reuse of the same ID after objects<br>
     * have been removed.<br>
     * <br>
     * @since 0.11
     * 
     */
    @XmlAttribute(name = "nextobjectid")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Integer nextobjectid;

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
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public List<TileSet> getTileSets() {
        if (tileSets == null) {
            tileSets = new ArrayList<TileSet>();
        }
        return this.tileSets;
    }

    /**
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public List<MapLayer> getLayers() {
        if (layers == null) {
            layers = new ArrayList<MapLayer>();
        }
        return this.layers;
    }

    /**
     * @since 1.0
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
     * The TMX format version. Was "1.0" so far, and will be<br>
     * incremented to match minor Tiled releases.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public String getVersion() {
        if (version == null) {
            return "1.0";
        } else {
            return version;
        }
    }

    /**
     * The TMX format version. Was "1.0" so far, and will be<br>
     * incremented to match minor Tiled releases.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * The Tiled version used to save the file.<br>
     * May be a date (for snapshot builds).<br>
     * <br>
     * @since 1.0.1
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public String getTiledversion() {
        return tiledversion;
    }

    /**
     * The Tiled version used to save the file.<br>
     * May be a date (for snapshot builds).<br>
     * <br>
     * @since 1.0.1
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setTiledversion(String value) {
        this.tiledversion = value;
    }

    /**
     * Map orientation. Tiled supports "orthogonal", "isometric",<br>
     * "staggered" (since 0.9) and "hexagonal" (since 0.11).
     * 
     * @return
     *     possible object is
     *     {@link Orientation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Orientation getOrientation() {
        return orientation;
    }

    /**
     * Map orientation. Tiled supports "orthogonal", "isometric",<br>
     * "staggered" (since 0.9) and "hexagonal" (since 0.11).
     * 
     * @param value
     *     allowed object is
     *     {@link Orientation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setOrientation(Orientation value) {
        this.orientation = value;
    }

    /**
     * The order in which tiles on tile layers are rendered. Valid<br>
     * values are `right-down` (the default), `right-up`,<br>
     * `left-down` and `left-up`. In all cases, the map is drawn<br>
     * row-by-row. (since 0.10, but only supported for orthogonal<br>
     * maps at the moment)
     * 
     * @return
     *     possible object is
     *     {@link RenderOrder }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public RenderOrder getRenderorder() {
        if (renderorder == null) {
            return RenderOrder.RIGHT_DOWN;
        } else {
            return renderorder;
        }
    }

    /**
     * The order in which tiles on tile layers are rendered. Valid<br>
     * values are `right-down` (the default), `right-up`,<br>
     * `left-down` and `left-up`. In all cases, the map is drawn<br>
     * row-by-row. (since 0.10, but only supported for orthogonal<br>
     * maps at the moment)
     * 
     * @param value
     *     allowed object is
     *     {@link RenderOrder }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setRenderorder(RenderOrder value) {
        this.renderorder = value;
    }

    /**
     * The map width in tiles.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public int getWidth() {
        return width;
    }

    /**
     * The map width in tiles.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setWidth(int value) {
        this.width = value;
    }

    /**
     * The map height in tiles.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public int getHeight() {
        return height;
    }

    /**
     * The map height in tiles.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setHeight(int value) {
        this.height = value;
    }

    /**
     * The width of a tile.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public int getTileWidth() {
        return tileWidth;
    }

    /**
     * The width of a tile.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setTileWidth(int value) {
        this.tileWidth = value;
    }

    /**
     * The height of a tile.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public int getTileHeight() {
        return tileHeight;
    }

    /**
     * The height of a tile.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setTileHeight(int value) {
        this.tileHeight = value;
    }

    /**
     * Only for hexagonal maps. Determines the width or height<br>
     * (depending on the staggered axis) of the tile's edge, in<br>
     * pixels.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Integer getHexSideLength() {
        return hexSideLength;
    }

    /**
     * Only for hexagonal maps. Determines the width or height<br>
     * (depending on the staggered axis) of the tile's edge, in<br>
     * pixels.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setHexSideLength(Integer value) {
        this.hexSideLength = value;
    }

    /**
     * For staggered and hexagonal maps, determines which axis<br>
     * ("x" or "y") is staggered.<br>
     * <br>
     * @since 0.11
     * 
     * @return
     *     possible object is
     *     {@link StaggerAxis }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public StaggerAxis getStaggerAxis() {
        return staggerAxis;
    }

    /**
     * For staggered and hexagonal maps, determines which axis<br>
     * ("x" or "y") is staggered.<br>
     * <br>
     * @since 0.11
     * 
     * @param value
     *     allowed object is
     *     {@link StaggerAxis }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setStaggerAxis(StaggerAxis value) {
        this.staggerAxis = value;
    }

    /**
     * For staggered and hexagonal maps, determines whether the<br>
     * "even" or "odd" indexes along the staggered axis are<br>
     * shifted.<br>
     * <br>
     * @since 0.11
     * 
     * @return
     *     possible object is
     *     {@link StaggerIndex }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public StaggerIndex getStaggerIndex() {
        return staggerIndex;
    }

    /**
     * For staggered and hexagonal maps, determines whether the<br>
     * "even" or "odd" indexes along the staggered axis are<br>
     * shifted.<br>
     * <br>
     * @since 0.11
     * 
     * @param value
     *     allowed object is
     *     {@link StaggerIndex }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setStaggerIndex(StaggerIndex value) {
        this.staggerIndex = value;
    }

    /**
     * The background color of the map. (optional, may include<br>
     * alpha value since 0.15 in the form `#AARRGGBB`)<br>
     * <br>
     * @since 0.9
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public String getBackgroundcolor() {
        return backgroundcolor;
    }

    /**
     * The background color of the map. (optional, may include<br>
     * alpha value since 0.15 in the form `#AARRGGBB`)<br>
     * <br>
     * @since 0.9
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setBackgroundcolor(String value) {
        this.backgroundcolor = value;
    }

    /**
     * Stores the next available ID for new objects. This number<br>
     * is stored to prevent reuse of the same ID after objects<br>
     * have been removed.<br>
     * <br>
     * @since 0.11
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Integer getNextobjectid() {
        return nextobjectid;
    }

    /**
     * Stores the next available ID for new objects. This number<br>
     * is stored to prevent reuse of the same ID after objects<br>
     * have been removed.<br>
     * <br>
     * @since 0.11
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setNextobjectid(Integer value) {
        this.nextobjectid = value;
    }

}
