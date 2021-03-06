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

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mapeditor.core package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Map_QNAME = new QName("http://www.mapeditor.org", "map");
    private final static QName _Tileset_QNAME = new QName("http://www.mapeditor.org", "tileset");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mapeditor.core
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MapData }
     * 
     */
    public MapData createMapData() {
        return new Map();
    }

    /**
     * Create an instance of {@link TileSetData }
     * 
     */
    public TileSetData createTileSetData() {
        return new TileSet();
    }

    /**
     * Create an instance of {@link Animation }
     * 
     */
    public Animation createAnimation() {
        return new Animation();
    }

    /**
     * Create an instance of {@link Data }
     * 
     */
    public Data createData() {
        return new Data();
    }

    /**
     * Create an instance of {@link Ellipse }
     * 
     */
    public Ellipse createEllipse() {
        return new Ellipse();
    }

    /**
     * Create an instance of {@link Frame }
     * 
     */
    public Frame createFrame() {
        return new Frame();
    }

    /**
     * Create an instance of {@link Group }
     * 
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link ImageData }
     * 
     */
    public ImageData createImageData() {
        return new ImageData();
    }

    /**
     * Create an instance of {@link ImageLayer }
     * 
     */
    public ImageLayer createImageLayer() {
        return new ImageLayer();
    }

    /**
     * Create an instance of {@link MapObjectData }
     * 
     */
    public MapObjectData createMapObjectData() {
        return new MapObject();
    }

    /**
     * Create an instance of {@link ObjectGroupData }
     * 
     */
    public ObjectGroupData createObjectGroupData() {
        return new ObjectGroup();
    }

    /**
     * Create an instance of {@link Polygon }
     * 
     */
    public Polygon createPolygon() {
        return new Polygon();
    }

    /**
     * Create an instance of {@link Polyline }
     * 
     */
    public Polyline createPolyline() {
        return new Polyline();
    }

    /**
     * Create an instance of {@link PropertiesData }
     * 
     */
    public PropertiesData createPropertiesData() {
        return new Properties();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link Terrain }
     * 
     */
    public Terrain createTerrain() {
        return new Terrain();
    }

    /**
     * Create an instance of {@link TerrainTypes }
     * 
     */
    public TerrainTypes createTerrainTypes() {
        return new TerrainTypes();
    }

    /**
     * Create an instance of {@link Text }
     * 
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link TileData }
     * 
     */
    public TileData createTileData() {
        return new Tile();
    }

    /**
     * Create an instance of {@link TileLayerData }
     * 
     */
    public TileLayerData createTileLayerData() {
        return new TileLayer();
    }

    /**
     * Create an instance of {@link TileOffset }
     * 
     */
    public TileOffset createTileOffset() {
        return new TileOffset();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapeditor.org", name = "map")
    public JAXBElement<MapData> createMap(MapData value) {
        return new JAXBElement<MapData>(_Map_QNAME, ((Class) Map.class), null, ((Map) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TileSetData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mapeditor.org", name = "tileset")
    public JAXBElement<TileSetData> createTileset(TileSetData value) {
        return new JAXBElement<TileSetData>(_Tileset_QNAME, ((Class) TileSet.class), null, ((TileSet) value));
    }

}
