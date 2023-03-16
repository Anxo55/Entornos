package Documentacion;

// import java.awt.Color;

// public class Circulo {

//    public float radio;

//    public Color color;

//    public float x;

//    public float y;

//    public float getDiametro() {

//        return radio + radio;
//    }

//    public float getArea() {

//        return (float) Math.PI * radio * radio;
//    }

//    public float getCircunferencia() {
//        return 2f * (float) Math.PI * radio;
//    }

//    public float getPerimetro() {
//        return 2f * (float) Math.PI * radio;
//    }

//    public void setColor(int r, int g, int b) {
//        color = new Color(r, g, b);
//    }

//    public boolean puntoDentro(float px, float py) {
//        float vx = x - px;
//        float vy = y - py;
//        float vx2 = vx * vx;
//        float vy2 = vy * vy;
//        double modulo = Math.sqrt(vx2 + vy2);
//        if (modulo > radio) {
//            return false;
//        } else {
//            return true;
//        }
//    }

// }


//SOLUCION

/*
* Copyright (c) 2020, Angel Gonzalez. All right reverse.
* Use is subject to license terms.
*/
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
* Modela una <b>circunferenca</b> en el espacio de 2 dimensiones
* @author Angel Gonzalez
* @version 1.0
* @see https://es.wikipedia.org/wiki/C%C3%ADrculo
*/
public class Circulo {
   /**
    * Define la distancia entre el centro del circulo y su borde en metros
    */
   public float radio;
   /**
    * Define la posici'n horizontal en pantalla del circulo, con respecto a su centro
    */
   public float x;
   /**
    * Define la posici'n vertical en pantalla del circulo, con respecto a su centro
    */
   public float y;
   /**
    * Define el color de relleno del circulo
    */
   public Color color;
  
   /**
    * Devuelve la longitud de la circunferencia en metros
    * @return la longitud de la circunferencia
    */
   public float getPerimetro(){
       return 2 * 3.1415f* radio;
   }
  
   /**
    * Devuelve la superficie del circulo en metros cuadrados
    * @return la superficie del circulo
    */
   public float getArea() {
       //@HACK Usar Math.PI
       return 3.1415f * radio * radio;
   }
  
   /**
    * Devuelve la superficie del circulo en metros cuadrados
    * @return la superficie del circulo
    * @deprecated usar mejor el metodo getArea()
    */
   public float getSuperficie() {
       return 3.14f * (float)Math.pow(radio, 2);
   }
  
   /**
    * Devueve la dimension de la recta que divide el circulo en 2 partes iguales
    * @return el tama'o del diametro
    */
   public float getDiametro() {
       //@HACK Mejor usar sumas que multiplicaciones
       //@DONE problema solucionado haciendo esto...
       return radio * 2;      
   }
  
   /**
    * Determina si un punto est' dentro del circulo
    * @author Paula Fernandez
    * @see https://es.wikipedia.org/wiki/M%C3%B3dulo_(vector)
    * @param px La coordenada horizontal del punto a determinar
    * @param py La coordenada vertical del punto a determinar
    * @return Devuelve true cuando el punto est' dentro del circulo
    */
   public boolean puntoEstaDentro(float px, float py) {
       float vx = x - px;
       float vy = y - py;
       // Aplicamos el teorema de Pitagoras
       double modulo = Math.sqrt( vx*vx  + vy*vy);
      
       return modulo < radio;
   }
  
   //@ISSUE A'adir el metodo de colision entre 2 circulos
  
   /**
    * Guardar en el disco duro las coordendas del circulo
    * @param ruta La ruta donde se va a guardar los datos
    * @throws IOException Lanzamos una excepcion cuando no se puede guardar el fichero en el disco
    */
   public void guardarEnDisco(String ruta) throws IOException{
       File f = new File(ruta);
       FileWriter fw = new FileWriter(f);
       fw.write("La x:"+x+", La y:"+y);
       fw.close();
   }
  
}


