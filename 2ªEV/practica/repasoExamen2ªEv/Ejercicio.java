import java.util.ArrayList;
import java.util.Arrays;

//Docmentar
//Testear
//Refactorizar y Optimizar
/**
 * Clase de utilidad para trabajar con numerows
 * @author Anxo
 * @version 0.1
 */
public class Ejercicio {
    /**
     * Calcula la suma de los cuadrados de un numeros, desde 0 hasta este numero
     * @param n el numero a calcular
     * @return sa suma de los cuadrados
     */

    private static int sumaDeCuadradosHasta(int n) {
        int resultado=0;
        for(int i =0;i<n;i++) {
            resultado+=i*i;
        }
        return resultado;
    }
    /**
     * Suma los cuadrados de 2 numeros desde el 0 hasta su valor
     * @param a
     * @param b
     * @return la suma de los cuadrados de los numeros pasados comp parámetros
     */
   public static int sumaDeCuadrados(int ...numeros) {
    int resultado=0;
    for(int numero : numeros) {
        resultado += sumaDeCuadradosHasta(numero);
    }
    return resultado;
   }

    /**
     * Obtiene dado una lista de numeros, solo imapres
     * @param numeros la lista de numeros originales
     */
    public static ArrayList<Integer> getNumerosImpares(int[] numeros) {
        ArrayList<Integer> resultado = new ArrayList<Integer>();
        for(int i=0; i<numeros.length;i++) {
            if(numeros[i]%2 != 0){
                //System.out.println(numeros[i]);
                resultado.add(numeros[i]);
            }
        }
        return resultado;
    }
    /**
     * Metodo que calcula la media de varios numeros
     * @param numeros los numeros a calcular su media
     * @return la media calculada
     */
    public static double calculaMedia(double[] numeros) {
        // float suma=0;
        // for(float numero : numeros) {
        //     suma += numero;
        // }
        // return suma / numeros.length;
        return Arrays.stream(numeros).average().orElse(0);
    }
}
