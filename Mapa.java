/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.newdawn.slick.drylands;
import org.lwjgl.input.Mouse;
    import org.newdawn.slick.tiled.*;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author FairLight
 */
public class Mapa implements Serializable {
    private final int tamSalaX=23,tamSalaY=13;
    private final int MSCAMARA=500;
    private TiledMap mapa;

    private float offsetX,offsetY;
    private int tamTileX,tamTileY;
    private int contadorCamara=0;
    private int SCREENRESX,SCREENRESY;
    private final double PORCENTAJEX=0.05,PORCENTAJEY=0.05;


    public float getAbsMouseX(){
        return Mouse.getX()-offsetX;
    }
    public float getAbsMouseY(){
        return SCREENRESY-Mouse.getY()-offsetY;
    }
    private float centroSalaX,centroSalaY;
    private ArrayList<Punto> listaCentros;

    
    public Mapa(String ruta,String dependencias,int SCREENRESX,int SCREENRESY) throws SlickException{
        
        mapa = new TiledMap(ruta,dependencias);
        
        this.SCREENRESX=SCREENRESX;
        this.SCREENRESY=SCREENRESY;
        
        /*numtilesRenderX=(SCREENRESX/mapa.getTileWidth())+3;
        numtilesRenderY=(SCREENRESY/mapa.getTileHeight())+3;*/
        offsetX=0;
        offsetY=0;
        tamTileX=mapa.getTileWidth();
        tamTileY=mapa.getTileHeight();
        centroSalaX=centroSalaY=0;
        listaCentros= new ArrayList<Punto>();

    }
    public TiledMap getTiled(){
        return mapa;
    }
    public float  getOffX(){
        return offsetX;
    }
    public float  getOffY(){
        return offsetY;
    }
    
    public void render(){
        mapa.render(Math.round(offsetX),Math.round(offsetY),0,0,mapa.getWidth(),mapa.getHeight(),false);

        
    }
    public boolean checkColX(Player player){
        boolean colUpDer,colUpIz,colDownDer,colDownIz;
        
        colDownIz=hayMuro(player.getnewX(),player.getY()+player.TAMY);
        colUpIz=hayMuro(player.getnewX(),player.getY()+player.ALTURACOLLIDER);
        colDownDer=hayMuro(player.getnewX()+player.TAMX,player.getY()+player.TAMY);
        colUpDer=hayMuro(player.getnewX()+player.TAMX,player.getY()+player.ALTURACOLLIDER);
        
        return colUpDer||colUpIz||colDownDer||colDownIz;
    }
    public boolean checkColY(Player player){
        boolean colUpDer,colUpIz,colDownDer,colDownIz;
        
        colDownIz=hayMuro(player.getX(),player.getnewY()+player.TAMY);
        colUpIz=hayMuro(player.getX(),player.getnewY()+player.ALTURACOLLIDER);
        colDownDer=hayMuro(player.getX()+player.TAMX,player.getnewY()+player.TAMY);
        colUpDer=hayMuro(player.getX()+player.TAMX,player.getnewY()+player.ALTURACOLLIDER);
        
        return colUpDer||colUpIz||colDownDer||colDownIz;
    }
    private boolean hayMuro(float x, float y){
        try{
            
            return (mapa.getTileId((Math.round(x))/tamTileX, (Math.round(y))/tamTileY,2)!=0);
            
       }
       catch(Exception e){return false;}
    }
    private boolean esSala(float x, float y){
        try{

            return (mapa.getTileId((Math.round(x))/tamTileX, (Math.round(y))/tamTileY,1)!=0);

        }
        catch(Exception e){return false;}
    }

    public boolean playerEnSala(){
        return (centroSalaY!=0)&&(centroSalaX!=0);
    }

    public boolean playerEnSalaNueva(){
        for (Punto punto: listaCentros) {
            if((punto.getX()==centroSalaX)&&(punto.getY()==centroSalaY))
                return false;

        }
        return true;
    }

    public void actListaCentros(){
        listaCentros.add(new Punto(centroSalaX,centroSalaY));
    }

    public void actCamara(int delta,Player player){
        if(esSala(player.getX()+player.TAMX/2,player.getY()+player.TAMY/2)){

            if(centroSalaX==0&&centroSalaY==0){//buscamos el centro

                float startx=player.getX()+player.TAMX/2;
                float starty=player.getY()+player.TAMY/2;
                int tamxder=0,tamxiz=0,tamyup=0,tamydown=0,tilesX=0,tilesY=0;

                //ejex
                while(esSala(startx+tamxder*tamTileX,starty)){
                    tamxder++;
                    tilesX++;

                }
                while(esSala(startx-tamxiz*tamTileX,starty)){
                    tamxiz++;
                    tilesX++;
                }
                while(esSala(startx,starty+tamydown*tamTileY)){
                    tamydown++;
                    tilesY++;
                }
                while(esSala(startx,starty-tamyup*tamTileY)){
                    tamyup++;
                    tilesY++;
                }
                //el centro relativo desde la esquina superior izquierda + distancia desde el centro del jugador a esa esquina
                centroSalaX=((int)(startx/tamTileX)*tamTileX)-tamxiz*tamTileX+(tilesX+1)*tamTileX/2;
                centroSalaY=((int)(starty/tamTileY)*tamTileY)-tamyup*tamTileY+(tilesY+1)*tamTileY/2;


            }
            if((contadorCamara+delta)>MSCAMARA)
                contadorCamara=MSCAMARA;
            else
                contadorCamara+=delta;
            float maxDesp=player.getMaxstep(delta)*contadorCamara/MSCAMARA;
            float difx=(centroSalaX+offsetX)-(SCREENRESX/2);
            float dify=(centroSalaY+offsetY)-(SCREENRESY/2);
            float difcuadrados = (difx*difx)+(dify*dify);
            float dist = (float)Math.sqrt(difcuadrados);
            if(dist>(maxDesp)){
                float incx = (difx*maxDesp/dist);

                offsetX-=incx;

                float incy = (dify*maxDesp/dist);

                offsetY-=incy;

            }
            else{

                offsetX-=difx;

                offsetY-=dify;

            }
        }
        else{
            centroSalaX=centroSalaY=0;
            if(((player.getX()+player.TAMX/2+offsetX)>(SCREENRESX*(0.5-PORCENTAJEX)))&&((player.getX()+player.TAMX/2+offsetX)<(SCREENRESX*(0.5+PORCENTAJEX)))&&((player.getY()+player.TAMY/2+offsetY)>(SCREENRESY*(0.5-PORCENTAJEY)))&&((player.getY()+player.TAMY/2+offsetY)<(SCREENRESY*(0.5+PORCENTAJEY)))){
                if((contadorCamara-delta)<0)
                    contadorCamara=0;
                else
                    contadorCamara-=delta;

            }
            else{

                if((contadorCamara+delta)>MSCAMARA)
                    contadorCamara=MSCAMARA;
                else
                    contadorCamara+=delta;
            }
            if(contadorCamara>0){
                float maxDesp=player.getMaxstep(delta)*contadorCamara/MSCAMARA;
                float difx=(player.getX()+player.TAMX/2+offsetX)-(SCREENRESX/2);
                float dify=(player.getY()+player.TAMY/2+offsetY)-(SCREENRESY/2);
                float difcuadrados = (difx*difx)+(dify*dify);
                float dist = (float) Math.sqrt(difcuadrados);
                if(dist>(maxDesp)){
                    float incx = (difx*maxDesp/dist);

                    offsetX-=incx;

                    float incy = (dify*maxDesp/dist);

                    offsetY-=incy;



                }
                else{

                    offsetX-=difx;

                    offsetY-=dify;


                }

            }

        }



            
    }
    public Punto getRandinSala(){
        float x,y;
        x=ThreadLocalRandom.current().nextInt((int)centroSalaX-tamSalaX*tamSalaX, (int)centroSalaX+tamSalaX*tamSalaX);
        y=ThreadLocalRandom.current().nextInt((int)centroSalaY-tamSalaY*tamSalaY, (int)centroSalaY+tamSalaY*tamSalaY);
        return new Punto(x,y);
    }
    public boolean camaraFijada(){
        return ((centroSalaX+offsetX)==(SCREENRESX/2))&&((centroSalaY+offsetY)==(SCREENRESY/2));
    }
    
}
