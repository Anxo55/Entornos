package Optimizacion;

// import java.util.Arrays;

// public class Optimizacion5 {

//    String getNombre() {
//        String resultado = "";
//        resultado = resultado + "Antonio";
//        resultado = resultado + "Jose";
//        resultado = resultado + "Maria";
//        resultado = resultado + "Ruben";
//        return resultado;
//    }

//    float calculo(int c) {
//        float resultado = 0;
//        float cto;
//        do {
//            cto = 5;
//            resultado += c + cto;
//        } while (c < 20);
//        return resultado;
//    }

//    int[] calculo2() {
//        int[] lista = { 3, 5, 7 };

//        int[] l1 = lista.clone();
//        Arrays.sort(l1);
//        if (l1.length > 10) {
//            Arrays.sort(l1);
//            return l1;
//        } else
//            return null;
//    }

//    float contar(int[] listaNumeros) {
//        return listaNumeros.length * 4;
//    }

//    float calculo3(int[] listaNumeros) {
//        int valor = 0;
//        for (int i = 0; i < contar(listaNumeros); i++) {
//            valor += i;
//        }
//        return valor;
//    }

// }


// public class Optimizacion5{

//    int ejercicio(int total) {
//        int contador = 0;
//        int resultado;
//        for (int i = 0; i < 10; i++) {
//            resultado = 0;
//            total += contador + i * 4;
//        }
//        resultado = total - 1;
//        return resultado;
//    }

// }

import java.util.Arrays;

public class Optimizacion5 {

   String getNombre() {
       StringBuilder sb = new StringBuilder();  //StringBuffer
       sb.append("Antonio");
       sb.append("Jose");
       sb.append("Maria");
       sb.append("Ruben");
       return sb.toString();
   }
   float calculo(int c) {
       float resultado = 0;
       float cto = 5;
       do {
           resultado += c + cto;
           //TOFIX corregir el problema del bucle infinito  c++
       }while(c<20);
       return resultado;
   }
   int[] calculo2() {
       int[] lista = {3,5,7};
       //int[] l1 = lista.clone();
       Arrays.sort(lista);
       if(lista.length > 10) {
           //Arrays.sort(l1);
           return lista;
       }else
           return null;
   }
  
   float contar(int[] listaNumeros) {
       return listaNumeros.length << 2; // Multiplicar por 4
   }
  
   float calculo3(int[] listaNumeros) {
       //int valor = 0;
       float total = contar(listaNumeros);
       //total=4
 
       //return (total-1) * (total-1+1) / 2;
       return (total-1) * (total) / 2;
   }
}




