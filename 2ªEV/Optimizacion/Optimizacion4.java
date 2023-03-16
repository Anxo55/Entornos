package Optimizacion;

// import java.awt.geom.Point2D;

// public class Optimizacion4 {
//    /**
//     * Mueve un punto en 2d en función de su velocidad, y su angulo
//     *
//     * @param puntoInicial
//     * @param anguloGrados
//     * @param espacio
//     * @param tiempo
//     * @return
//     */
//    public Point2D.Double trasladarPunto(Point2D.Double puntoInicial, float anguloGrados, float espacio, float tiempo) {
//        float velocidad = espacio / tiempo;
//        double x = puntoInicial.x + (espacio / tiempo) * Math.cos(Math.toRadians(anguloGrados));
//        double y = puntoInicial.y + (espacio / tiempo) * Math.sin(Math.toRadians(anguloGrados));
//        return new Point2D.Double(x, y);
//    }

//    public static void main(String[] args) {
//        Optimizacion4 ejemplo = new Optimizacion4();
//        Point2D.Double p = new Point2D.Double(2.0, 5.0);
//        Point2D.Double nuevoPunto = ejemplo.trasladarPunto(p, 90, 5, 1);
//        System.out.println(nuevoPunto);
//    }
// }

import java.awt.geom.Point2D;

public class Optimizacion4 {
   /**
   * Mueve un punto en 2d en funci'n de su velocidad, y su angulo
   * @param puntoInicial
   * @param anguloGrados
   * @param espacio
   * @param tiempo
   * @return
   */
   public Point2D.Double trasladarPunto(Point2D.Double puntoInicial, float anguloGrados, float espacio, float tiempo) {
       float velocidad = espacio / tiempo;
       float anguloRadianes = (float)Math.toRadians(anguloGrados);
       //double x = puntoInicial.x + (velocidad) * Math.cos(anguloRadianes);
       //double y = puntoInicial.y + (velocidad) * Math.sin(anguloRadianes);
       return new Point2D.Double(
               puntoInicial.x + velocidad * Math.cos(anguloRadianes),
               puntoInicial.y + velocidad * Math.sin(anguloRadianes)
           );
   }
   public static void main(String[] args) {
       Optimizacion4 ejemplo = new Optimizacion4();
       Point2D.Double p = new Point2D.Double(2.0,5.0);
       Point2D.Double nuevoPunto = ejemplo.trasladarPunto(p, 90, 5, 1);
       System.out.println(nuevoPunto);
   }
}




