package Refactorizacion;

import java.awt.geom.Point2D;
abstract class Cubo {
   String nombre;
   String textura;
   String danno; //TOFIX: usar un entero en lugar de un string.
   Point2D posicion;
   public Cubo() {
       posicion = new Point2D.Float(0, 0);
   }
   void dibujar() {
       // dibujar en pantalla un cubo con textura = textura
   }
   public static void main(String[] args) {
       Cubo[] arrCubos = new Cubo[100];
       arrCubos[0] = new CuboTNT();
       arrCubos[1] = new CuboTNT();
       arrCubos[2] = new CuboHierba();
       arrCubos[3] = new CuboMetal();
      
       System.out.println(arrCubos[2].nombre);
   }
}

class CuboTNT extends Cubo {
   int rangoExplosion = 200;
   int dannoExplosion = 10;
   public CuboTNT(){
       super.nombre = "tnt";
       super.danno = "10";
       super.textura = "tnt.png";
   }
   public void explotar() {
       // Buscar usuario en un rango de 200 (rangoExplosion)
       // Aplicarles un da'o de 10/200 = da'o/rangoExplosion
   }  
}

class CuboHierba extends Cubo {
   public CuboHierba(){
       super.nombre = "hierba";
       super.danno = "100";
       super.textura = "hierba.png";
   }
}

class CuboMetal extends Cubo {
   public CuboMetal(){
       super.nombre = "metal";
       super.danno = "1000";
       super.textura = "metal.png";
   }
}

