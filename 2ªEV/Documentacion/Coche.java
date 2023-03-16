package Documentacion;

// import java.awt.Color;

// class Coche {
//    float velocidad;
//    int np;
//    Color c;

//    public void acelerar(float nuevaVel) {
//        velocidad = nuevaVel;
//    }

//    public boolean moviendose() {
//        return velocidad > 0;
//    }

//    public void pararCoche() {
//        velocidad = 0;
//    }

// }



import java.awt.Color;

/**
* Modela el comportamiento y parametros de un coche
* @author DAM
* @version 2.0
* @since 12/01/2018
*/
class Coche {
   /**
    * Velocidad a la que se mueve el coche
    */
   float velocidad;
   /**
    * Numero de puertas que posee el coche
    */
   int numeroPuertas;
   /**
    * Color de la carrocer'a del coche
    */
   Color color;

  
   /**
    * Constructor por defecto, que inicializa el coche a
    * velocidad 0, con cuatro puertas y color rojo
    */
   public Coche() {
       //super();
       velocidad = 0;
       numeroPuertas = 4;
       color = Color.RED;
   }

   /**
    * Contructor con par'metros
    */
   public Coche(float velocidad, int numeroPuertas, Color color) {
       //super();
       this.velocidad = velocidad;
       this.numeroPuertas = numeroPuertas;
       this.color = color;
   }
  
  

   /**
    * Devuelve la velocidad
    * @return la velocidad
    */
   public float getVelocidad() {
       return velocidad;
   }

   /**
    * Establece la velociad
    * @param velocidad la velocidad
    */
   public void setVelocidad(float velocidad) {
       this.velocidad = velocidad;
   }

   /**
    * Devuelve el numero de puertas
    * @return el numero de puertas
    */
   public int getNumeroPuertas() {
       return numeroPuertas;
   }

   /**
    * Estable el numero de puertas
    * @param np el numero de puertas
    */
   public void setNumeroPuertas(int np) {
       this.numeroPuertas = np;
   }

   /**
    * Devuelve el color de la carrocer'a
    * @return color de la carrocer'a
    */
   public Color getColor() {
       return color;
   }

   /**
    * Establece el color de la carrocer'a
    * @param c color de la carrocer'a
    * @see java.awt.Color
    */
   public void setColor(Color c) {
       this.color = c;
   }

   /**
    * Modifica la velocidad del coche
    * @param nuevaVelocidad la nueva velocidad a establecer
    * @deprecated Usar setVelocidad()
    */
   public void acelerar(float nuevaVelelocidad) {
       velocidad = nuevaVelelocidad;
   }

   /**
    * Determina si el coche se est' moviendo
    * @return un booleano indicando si se est' moviendo
    * @TOFIX traducir todo al ingles
    * */
   public boolean isMoving() {
       return velocidad > 0;
   }

   /**
    * Establce la velocidad del coche a 0
    */
   public void parar() {
       velocidad = 0;
   }
}


