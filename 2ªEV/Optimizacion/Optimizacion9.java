package Optimizacion;

// import java.util.Arrays;


// public class Optimizacion9 {
//    String frases[] = { "Hola", "Angel", "que tal estas", "Angel", "Pepe", "que tal estoy"};


//    /* Este método busca si una frase está en la lista de frases */
//    boolean busca(String fraseBuscar) {
//        boolean siEsta = false;
//        boolean noEsta = true;
//        for (String frase : frases) {
//            if (frase.equals(fraseBuscar)) {
//                siEsta = true;
//                noEsta = false;
//            }
//        }
//        noEsta = !siEsta;
//        return siEsta;
//    }


//    /* Devuelve la frase mas larga (si hay varias de igual tamaño devuelve la primera que se encuentra) */
//    String masLarga() {
//        String masLarga = frases[0];
//        for(int i=0;i<frases.length;i++){
//            if (frases[i].length() > masLarga.length()) {
//                masLarga = frases[i];
//            }
//        }
//        return masLarga;
//    }
//    /* Este cuenta cuantos frases de como minimo X letras */
//    int cuentaFrasesMinimoLetras(int minimoLetras) {
//        int contador = 0;
//        int num = contador;
//        for (String frase : frases) {
//            if (frase.length() >= minimoLetras) {
//                num = contador;
//                contador++;
//            }
//        }
//        num = num / frases.length;
//        return contador;
//    }




//     /* Calcula la media de caracteres de todas las frases*/
//    // En el ejemplo la media de todos los caracteres es 4+5+13+5+4+13  /  6  = 7.33
//     float mediaCaracteres(){
//        float suma = 0;
//        for(String frase: frases){
//            suma+=frase.length();
//        }
//        return suma / frases.length;
//    }
  
//    /* Por cada frase, devuelve el numero de caracteres de cada frase dividido por la media de caracteres totales  */
//    // Contamos numero de caracteres de cada frase = [4, 5, 13, 5, 4, 13]
//    // Numero total de frases = 6
//    // Media total de caracteres  = 4+5+13+5+4+13  /  6  = 7.33
//    // Dividimos el numero de caracteres de cada frase por la media total de caracteres
//    // [0.5714286, 0.71428573, 1.8571428, 0.71428573, 0.5714286, 1.8571428]
//    float[] numerosCaracteresEntreMediaTotal(){
//        float[] resultado = new float[frases.length];
//        for(int i=0;i<frases.length;i++){
//            resultado[i] = frases[i].length() / mediaCaracteres();
//        }
//        return resultado;
//    }


//    /* Devuelve la frase que mas se repite (moda) */
//    String moda() {
//        int maximaVecesQueSeRepite = 0;
//        String moda = "";
//        for (int i = 0; i < frases.length; i++) {
//            int vecesQueSeRepite = 0;
//            for (int j = 0; j < frases.length; j++) {
//                if (frases[i] == frases[j])
//                    vecesQueSeRepite++;
//            }
//            if (vecesQueSeRepite > maximaVecesQueSeRepite) {
//                moda = frases[i];
//                maximaVecesQueSeRepite = vecesQueSeRepite;
//            }
//        }
//        return moda;
//    }
//    int calcula(){
//        int moda1 = moda().length();
//        int moda2 = moda().length();
//        int l = 0;
//        for(int i=0;i<frases.length;i++){
//            int mediaEntera = (int)mediaCaracteres();
//            l += frases[i].length() + Math.abs(moda1) + Math.abs(moda2) + mediaEntera;
//        }
//        return l/8;
//    }





//    public static void main(String[] args) {
//        new Optimizacion9();
//    }


//    public Optimizacion9() {
//        System.out.println("Frases: " + Arrays.toString(frases));
//        System.out.println("Contiene la frase Angel:" + busca("Angel"));
//        System.out.println("Contiene la frase Bea:" + busca("Bea"));
//        System.out.println("Hay " + cuentaFrasesMinimoLetras(5) + " frases de mínimo 5 letras");
//        System.out.println("La frase mas larga es: " + masLarga());
//        System.out.println("La moda vale:" + moda());
//    }
// }

import java.util.Arrays;


public class Optimizacion9{
   String frases[] = { "Hola", "Angel", "que tal estas", "Angel", "Pepe", "que tal estoy"};


   /* Este método busca si una frase está en la lista de frases */
   /* sobra una variable y retornamos directamente */
   boolean busca(String fraseBuscar) {
       for (String frase : frases) {
           if (frase.equals(fraseBuscar)) {
               return true;
           }
       }
       return false;
   }


   /* Devuelve la frase mas larga (si hay varias de igual tamaño devuelve la primera que se encuentra) */
   /* Comenzamos en 1 */
   String masLarga() {
       String masLarga = frases[0];
       for(int i=1;i<frases.length;i++){
           if (frases[i].length() >= masLarga.length()) {
               masLarga = frases[i];
           }
       }
       return masLarga;
   }
   /* Este cuenta cuantos frases de como minimo X letras hay */
   // Sobra variable num
   int cuentaFrasesMinimoLetras(int minimoLetras) {
       int contador = 0;
       for (String frase : frases) {
           if (frase.length() >= minimoLetras) {
               contador++;
           }
       }
       return contador;
   }


   /* Calcula la media de caracteres de todas las frases*/
   // variable suma será un entero no un float
   float mediaCaracteres(){
       int suma = 0;
       for(String frase: frases){
           suma+=frase.length();
       }
       return (float)suma / frases.length;
   }
  
   /* Por cada frase, devuelve el numero de caracteres de cada frase dividido por la media de caracteres totales  */
   // Contamos numero de caracteres de cada frase = [4, 5, 13, 5, 4, 13]
   // Numero total de frases = 6
   // Media total de caracteres  = 4+5+13+5+4+13  /  6  = 7.33
   // Dividimos el numero de caracteres de cada frase por la media total de caracteres
   // [0.5714286, 0.71428573, 1.8571428, 0.71428573, 0.5714286, 1.8571428]
  
   // extraemos la media fuera del for
   float[] numerosCaracteresEntreMediaTotal(){
       float media = mediaCaracteres();
       float[] resultado = new float[frases.length];
       for(int i=0;i<frases.length;i++){
           resultado[i] = frases[i].length() / media ;
       }
       return resultado;
   }


   /* Devuelve la frase que mas se repite (moda) */
   /* no es necesario hacer nada */
   String moda() {
       int maximaVecesQueSeRepite = 0;
       String moda = "";
       for (int i = 0; i < frases.length; i++) {
           int vecesQueSeRepite = 0;
           for (int j = 0; j < frases.length; j++) {
               if (frases[i] == frases[j])
                   vecesQueSeRepite++;
           }
           if (vecesQueSeRepite > maximaVecesQueSeRepite) {
               moda = frases[i];
               maximaVecesQueSeRepite = vecesQueSeRepite;
           }
       }
       return moda;
   }
/*
   no es necesairo usar dos modas
   el abs de la moda no es necesario
   mediaEntera fuera del for
   la moda la multiplicado por 2
   uso >>
   */
   int calcula(){
       int l = 0;
       int moda = moda().length();
       //moda=Math.abs(moda);
       int mediaEntera = (int)mediaCaracteres() + moda << 1;
       for(int i=0;i<frases.length;i++){
           l += frases[i].length() + mediaEntera;
       }
       return l>>3;
   }





   public static void main(String[] args) {
       new Optimizacion9();
   }


   public Optimizacion9() {
       System.out.println("Frases:: " + Arrays.toString(frases));
       System.out.println("Contiene la frase Angel:" + busca("Angel"));
       System.out.println("Contiene la frase Bea:" + busca("Bea"));
       System.out.println("Hay " + cuentaFrasesMinimoLetras(5) + " frases de mínimo 5 letras");
       System.out.println("La frase mas larga es: " + masLarga());
       System.out.println("Media caracteres: " + mediaCaracteres());


       System.out.println("La moda vale:" + moda());
       System.out.println("Media de cada frase:" + Arrays.toString(numerosCaracteresEntreMediaTotal()));
   }
}


