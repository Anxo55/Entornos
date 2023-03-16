package Refactorizacion;

import java.awt.Color;

abstract class Entity {
   String sprite;
   float tamaño;
   float peso;
   float velocidad;
   float aceleracion;
   float daño;

   abstract void mover();

}

interface Lanzable {
   public void lanzar();
}

interface Colisionable {
   public void getBounds();

   public void onCollision();
}

abstract class Pajaro extends Entity implements Lanzable, Colisionable {
   public void lanzar() {
   }
}

class PajaroRojo extends Pajaro {
   void mover() {
   }

   public void getBounds() {
   }

   public void onCollision() {
   }
}

class PajaroNegro extends Pajaro {
   void mover() {
   }

   public void getBounds() {
   }

   public void onCollision() {
   }
}

class PajaroGranate extends Pajaro {
   void mover() {
   }

   public void getBounds() {
   }

   public void onCollision() {
   }
}

abstract class Cerdo extends Entity implements Colisionable {

}

class CerdoRey extends Cerdo {
   void mover() {
   }

   public void getBounds() {
   }

   public void onCollision() {
   }
}

abstract class Estructura extends Entity implements Colisionable {

}

class CajaMetal extends Estructura {
   void mover() {
   }

   public void getBounds() {
   }

   public void onCollision() {
   }
}

class Terreno {

}

class Tirachinas {
   float fuerza;
   float angulo;
   String sprite;

   void lanzar(Lanzable cosaALanzar) {

   }
}

class Item extends Entity implements Colisionable {
   void mover() {
   }

   public void getBounds() {
   }

   public void onCollision() {
   }
}

public class Juego {

   public static void main(String[] args) {
       // TODO Auto-generated method stub

   }

}
