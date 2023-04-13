public class Optimiza {
    String frutas[] = { "platano", "fresa", "pomelo", "limon", "naranja", "pera"};
  
  
    /*la optimizacion que utilice fue:
     *Elimine los returns en los boolean de "siEsta" y "noEsta". 
     */

    /* Este método busca si una fruta está en la lista de frutas */
    boolean busca(String frutaABuscar) {
        boolean siEsta;
        boolean noEsta;
        for (String fruta : frutas) {
            if (fruta.equals(frutaABuscar)) {
                return  true;
            }
        }
        noEsta = true;
        return false;
    }
  
    /*En este metodo no optimice. */
    // Función que determine si hay alguna fruta repetida en la lista
    public boolean hayFrutaRepetida() {
         for (int i = 0; i < frutas.length; i++) {
             for (int j = i + 1; j < frutas.length; j++) {
                 if (frutas[i].equals(frutas[j])) {
                     return true;
                 }
             }
         }
         return false;
     }
  
  
  
  
     /*
      * En este metodo elimine la variable num = contador, al tener el contador ya como variable,
      no hacia falta la variable "num".
      */

    /* Este cuenta cuntas frutas hay de como minimo X letras */
    int cuentaFrutasConMinimoLetras(int minimoLetras) {
        int contador = 0;
        for (String fruta : frutas) {
            if (fruta.length() >= minimoLetras) {
                contador++;
            }
        }
        return contador;
    }
  
  
  
    /* En este metodo no Optimice. */
     /* Calcula la media de caracteres de todas las frutas*/
    // En el ejemplo la media de todos los caracteres es 7+5+6+5+7+4  /  6  = 30.66^
     float mediaCaracteres(){
        float suma = 0;
        for(String frase: frutas){
            suma+=frase.length();
        }
        return suma / frutas.length;
    }

    /*En este metodo para optimziarlo, cree una variable media, la que era igual al metodo
     * mediaCaracteres, asi despues del for, para el resultado, cambiamos el "mediaCaracteres()",
     * por "media()".
     */


     /* Por cada fruta, devuelve el numero de caracteres de cada fruta dividido por la media de caracteres totales  */
    // Contamos numero de caracteres de cada fruta = [7+5+6+5+7+4]
    // Numero total de frutas = 6
    // Media total de caracteres  = 7+5+6+5+7+4  /  6  = 30.66^
    // Dividimos el numero de caracteres de cada fruta por la media total de caracteres
    // [0.22, 1.16, 0.19, 0.16, 0.22, 0.13]
    float[] numerosCaracteresDivididoEntreMediaTotal(){
        float[] resultado = new float[frutas.length];
        float media = mediaCaracteres();
        for(int i=0;i<frutas.length;i++){
            resultado[i] = frutas[i].length() / media;
        }
        return resultado;
    }
  
  
  }
  
