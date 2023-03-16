package Refactorizacion;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

abstract class Pelicula {
   float precio;
   String titulo;
   String sinopsis;
   abstract float getPrecio();
}

class PeliculaNormal extends Pelicula{
	float getPrecio(){ return precio*1;	}
}
class PeliculaEstreno extends Pelicula{
	float getPrecio(){ return precio*2;	}
}
class PeliculaClasica extends Pelicula{
	float getPrecio(){ return precio*3;	}
}

class Alquiler {
   Pelicula pelicula;
   LocalDate fechaAlquiler = LocalDate.now();
   final static int MIN_DIAS_ALQUILER = 7;
   final static int MAX_DIAS_ALQUILER = 20;
   final static int RECARGO = 10;
   final static int PENALIZACION = 250;

   long getDiasAlquiler() {
       LocalDate fechaActual = LocalDate.now(); // fecha actual
       return DAYS.between(fechaAlquiler, fechaActual);
   }
   
   private float calcularRecargo() {
	   if (getDiasAlquiler() <= MIN_DIAS_ALQUILER) return 0;
	   if (getDiasAlquiler() >= MIN_DIAS_ALQUILER+1 
			   && getDiasAlquiler() < MAX_DIAS_ALQUILER) return  getDiasAlquiler() * RECARGO;
       if (getDiasAlquiler() > MAX_DIAS_ALQUILER) return PENALIZACION;
	   return 0;
   }
   
   float calculaTotalAlquiler() {
       return calcularRecargo() + pelicula.getPrecio();
   }
}


class GestionAlquieres{
	static float calcularTotalAlquileres(Alquiler[] alquileres) {
	       float total = 0;
	       for (Alquiler al : alquileres) {
	           total += al.calculaTotalAlquiler();
	       }
	       return total;
	   }
	
	
	static boolean esMoroso(Alquiler[] alquileres) {
	   for (Alquiler al : alquileres) {
	           if (al.getDiasAlquiler() > Alquiler.MAX_DIAS_ALQUILER) return true;
	   }
	    return false;
	}
}

class Direccion{
	String calle;
	String piso;
	String letra;
	String cp;
}

class Cliente {
   String nombre;
   String telefono;
   Direccion direccion;

   Alquiler[] alquileres;
}




public class VideoClub {

}


