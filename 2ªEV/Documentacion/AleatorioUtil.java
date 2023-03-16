package Documentacion;

// import java.util.Random;
// import java.util.stream.IntStream;

// public class AleatorioUtil {

//    static int generarEnteroAleatorio(int max) {
//        int valorEntero = (int) (Math.random() * max) + 1; // Desde 1 a max (ambos inclusive)
//        return valorEntero;
//    }

//    static int generarEnteroAleatorio(int min, int max) throws NumberFormatException {
//        if (min >= max)
//            throw new NumberFormatException();
//        int valorEntero = (int) Math.floor(Math.random() * (max - min + 1) + min); // Desde min a max (ambos inclusive)
//        return valorEntero;
//    }

//    static double generarDecimalAleatorio(int min, int max) throws NumberFormatException {
//        if (min >= max)
//            throw new NumberFormatException();
//        double valorDecimal = Math.random() * (max - min) + min; // max nunca se alcanza
//        return valorDecimal;
//    }

//    static int[] generarAleatoriosSinRepetir(int cantidad) {
//        int[] numerosAleatorios = IntStream.rangeClosed(1, cantidad).toArray();
//        Random r = new Random();
//        for (int i = numerosAleatorios.length; i > 0; i--) {
//            int posicion = r.nextInt(i);
//            int tmp = numerosAleatorios[i - 1];
//            numerosAleatorios[i - 1] = numerosAleatorios[posicion];
//            numerosAleatorios[posicion] = tmp;
//        }
//        return numerosAleatorios;
//    }

//    static int[] generarXAleatorios(int cantidad, int min, int max) {
//        Random random = new Random();
//        IntStream intStream = random.ints(cantidad, min, max);
//        return intStream.toArray();
//    }

// }


import java.util.Random;
import java.util.stream.IntStream;

/**
* Clase que genera numeros aleatorios
*
* @author Angel
* @version 1.0
* @
*
*/

public class AleatorioUtil {

   /**
    * Devuelve un numero entero aleatorio entre 1
    *
    * @param max El numero maximo
    * @return un numero aleatorio entre 1 y max
    */
   static int generarEnteroAleatorio(int max) {
       int valorEntero = (int) (Math.random() * max) + 1; // Desde 1 a max (ambos inclusive)
       return valorEntero;
   }

   /**
    * Devuelve un numero entero aleatorio entre un valor min y max
    *
    * @param min el valor minimo
    * @param max el valor maximo
    * @return un numero aleatorio entre min y max
    * @throws NumberFormatException si min es mayor que max
    */
   static int generarEnteroAleatorio(int min, int max) throws NumberFormatException {
       if (min >= max)
           throw new NumberFormatException();
       int valorEntero = (int) Math.floor(Math.random() * (max - min + 1) + min); // Desde min a max (ambos inclusive)
       return valorEntero;
   }

   /**
    * Devuelve un numero real aleatorio entre un valor min y max*
    *
    * @param min el valor minimo
    * @param max el valor maximo
    * @return un numero aleatorio entre min y max
    * @throws NumberFormatException si min es mayor que max
    */
   static double generarDecimalAleatorio(int min, int max) throws NumberFormatException {
       if (min >= max)
           throw new NumberFormatException();
       double valorDecimal = Math.random() * (max - min) + min; // max nunca se alcanza
       return valorDecimal;
   }

   /**
    * Devuelve x numeros enteros aleatorio sin repetciones
    *
    * @param cantidad cantidad de numeros altetorios sin repetir
    * @return un array con los numeros aleatorios
    */
   static int[] generarAleatoriosSinRepetir(int cantidad) {
       int[] numerosAleatorios = IntStream.rangeClosed(1, cantidad).toArray();
       Random r = new Random();
       for (int i = numerosAleatorios.length; i > 0; i--) {
           int posicion = r.nextInt(i);
           int tmp = numerosAleatorios[i - 1];
           numerosAleatorios[i - 1] = numerosAleatorios[posicion];
           numerosAleatorios[posicion] = tmp;
       }
       return numerosAleatorios;
   }

   /**
    * Devuelve x numeros enteros aleatorio sin repetciones entre un minimo y un
    * maximo
    *
    * @param cantidad cantidad de numeros altetorios sin repetir
    * @param min      el valor minimo
    * @param max      el valor maximo
    * @return un array con los numeros aleatorios
    */
   static int[] generarXAleatorios(int cantidad, int min, int max) {
       Random random = new Random();
       IntStream intStream = random.ints(cantidad, min, max);
       return intStream.toArray();
   }

}



