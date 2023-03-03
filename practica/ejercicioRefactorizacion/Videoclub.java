import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;


// usar herencia de clases
abstract class Pelicula {
   float precio;
   String titulo;
   String sinopsis;

   abstract float getCoste();
}

class PeliculaNormal extends Pelicula {
   float getCoste() {
       return precio * 2;
   }
}

class PeliculaClasica extends Pelicula {
   float getCoste() {
       return precio;
   }
}

class PeliculaEstreno extends Pelicula {
   float getCoste() {
       return precio * 4;
   }
}

class Pelicula3D extends Pelicula {
   float getCoste() {
       return precio * 9;
   }
}

class Alquiler {
   Pelicula pelicula;
   LocalDate fechaAlquiler = LocalDate.now();
   final static int MAX_NUM_DIAS_ALQUILER = 20;
   final static int MIN_NUM_DIAS_ALQUILER = 8;
   final static float MAX_RECARGO = 250;
   final static float RECARGO_DIARIO = 10;

   long getDiasAlquiler() {
       LocalDate fechaActual = LocalDate.now(); // fecha actual
       return DAYS.between(fechaAlquiler, fechaActual);
   }

   float calcularRecargo() {
       if (getDiasAlquiler() >= MIN_NUM_DIAS_ALQUILER &&
               getDiasAlquiler() < MAX_NUM_DIAS_ALQUILER) {
           return getDiasAlquiler() * RECARGO_DIARIO;
       } else if (getDiasAlquiler() > MAX_NUM_DIAS_ALQUILER) {
           return MAX_RECARGO;
       }
       return 0;
   }

   float calculaTotalAlquiler() {
       return calcularRecargo() + pelicula.getCoste();
   }
}

class Direccion {
   String calle;
   String piso;
   String letra;
   String codigoPostal;
}

class Cliente {
   String nombre;
   String telefono;
   Direccion direccion;

   Alquiler[] alquileres;

   float calcularTotalAlquileres() {
       float total = 0;
       for (Alquiler al : alquileres) {
           total += al.calculaTotalAlquiler();
       }
       return total;
       /*
        * return (float) Arrays
        * .stream(alquileres)
        * .mapToDouble(e->e.calculaTotalAlquiler())
        * .sum();
        */
   }

   // Un cliente es moroso si tiene algún alquier de más de 20 días
   boolean esMoroso() {
    boolean moroso=false;
       for (Alquiler al : alquileres) {
           if (al.getDiasAlquiler() > Alquiler.MAX_NUM_DIAS_ALQUILER) {
               moroso = true;
           }
       }
       return moroso;
   }
}



public class Videoclub {
    
}
