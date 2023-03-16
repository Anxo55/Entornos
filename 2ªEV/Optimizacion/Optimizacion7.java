package Optimizacion;

// public class Optimizacion7 {
//     String nombres[] = { "Angel", "Bea", "Pepe" };
 
//     /**
//      * Este método comprueba si un nombre está en la lista
//      *
//      * @param nombre valor a comprobar
//      * @return true si el nombre está en la lista
//      */
//     boolean compruebaSiEsta(String nombreBuscado) {
//         boolean esta = false;
//         for (String nombre : nombres) {
//             if (nombreBuscado.equals(nombre)) {
//                 esta = true;
//             }
//         }
//         return esta;
//     }
 
//     /**
//      * Este método hace un calculo sobre la lista
//      *
//      * @return un valor cualquiera
//      */
//     float calculo() {
//         int suma = 0;
//         int valor = 8;
//         int cto = 9;
//         for (String nombre : nombres) {
//             suma += nombre.length();
//             valor += suma;
//             cto = 5;
//         }
//         return suma / 8 + cto;
//     }
 
//     /**
//      * Este método devuelve todos los nombres de la lista concatenados uno a
//      * continuación del otro
//      *
//      * @return los nombres concatenados
//      */
//     String obtenerNombresConcatenados() {
//         String resultado = "";
//         for (String nombre : nombres) {
//             resultado += nombre;
//         }
//         return resultado;
//     }
 
//  }

public class Optimizacion7 {
    String nombres[] = { "Angel", "Bea", "Pepe" };
     /**
     * Este método comprueba si un nombre está en la lista
     *
     * @param nombre valor a comprobar
     * @return true si el nombre está en la lista
     */
    boolean compruebaSiEsta(String nombreBuscado) {
        for (String nombre : nombres) {
            if (nombreBuscado.equals(nombre)) {
                return true;
            }
        }
        return false;
    }
     /**
     * Este método hace un calculo sobre la lista
     *
     * @return un valor cualquiera
     */
    float calculo() {
        int suma = 0;
        for (String nombre : nombres) {
            suma += nombre.length();
        }
        return suma / 8 + 5;
    }
     /**
     * Este método devuelve todos los nombres de la lista concatenados uno a
     * continuación del otro
     *
     * @return los nombres concatenados
     */
    String obtenerNombresConcatenados() {
        StringBuilder sb = new StringBuilder();
        for (String nombre : nombres) {
            sb.append(nombre);
        }
        return sb.toString();
    }
  }
 
 
 
 
