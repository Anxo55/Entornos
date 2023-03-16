package Documentacion;

// import java.util.ArrayList;

// import java.util.Random;

// public class SerieAleatorios {

//    private ArrayList<Integer> serieAleatoria;

//    public SerieAleatorios(int numeroItems) {

//        serieAleatoria = new ArrayList<Integer>();

//        for (int i = 0; i < numeroItems; i++) {
//            serieAleatoria.add(0);
//        }

//        System.out.println("Serie inicializada. El número de elementos en la serie es: " + getNumeroItems());

//    }

//    public int getNumeroItems() {
//        return serieAleatoria.size();
//    }

//    public void generarSerieDeAleatorios() {

//        Random numAleatorio;

//        numAleatorio = new Random();

//        for (int i = 0; i < serieAleatoria.size(); i++) {
//            serieAleatoria.set(i, numAleatorio.nextInt(1000));
//        }

//        System.out.print("Serie generada! ");

//    }

// }


//SOLUCION

/*
* Software distribuido bajo licencia Apache. bla bla bla
*/
import java.util.ArrayList;
import java.util.Random;

/**
* Permite generar una lista de n'meros aleatorios enteros comprendidos
* entre 0 y 1000
* @author Angel
* @version 1.0
* @see java.util.Random
* @see <a href="https://es.wikipedia.org/wiki/N%C3%BAmero_aleatorio"> Ver m's </a>
*
*/
public class SerieAleatorios {
   /**
    * lista con los n'meros aleatorios generados
    */
   private ArrayList<Integer> serieAleatoria;

   /**
    * Contruye la clase reservando memoria para tantos numeros aleatorios como se indique por par'metro
    * Por defecto se inicializa la lista con ceros
    * @param numeroItems Define el n'mero de numeros aleatorios que va a tener la clase
    */
   public SerieAleatorios(int numeroItems) {
       serieAleatoria = new ArrayList<Integer>();
       for (int i = 0; i < numeroItems; i++) {
           //tofix establecer el cero como una constante
           serieAleatoria.add(0);
       }
       System.out.println("Serie inicializada. El n'mero de elementos en la serie es: " + getNumeroItems());
   }

   /**
    * Devuelve el n'mero de elementos que tiene la lista
    * @return numero de elementos de la lista
    */
   public int getNumeroItems() {
       return serieAleatoria.size();
   }

   /**
    * Rellena la lista con numeros aleatorios entre 0 y 1000
    */
   public void generarSerieDeAleatorios() {
       Random numAleatorio;
       numAleatorio = new Random();
       for (int i = 0; i < serieAleatoria.size(); i++) {
           serieAleatoria.set(i, numAleatorio.nextInt(1000));
       }
       System.out.print("Serie generada! ");
   }
}






