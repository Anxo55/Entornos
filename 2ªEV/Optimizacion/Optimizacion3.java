package Optimizacion;

// public class Optimizacion3 {
//     public int[] algoritmo(int[] datos) {
//         // float array[] = new float[10];
//         int i = 1;
//         for (i = 1; i < datos.length - 2; i++) {
//             int sumador = 4 / 2;
//             datos[i] = datos[2 + i] + (i + 1) * 2 * 8 + (5 + 2) + sumador;
//             datos[i - 1] = datos[2 + i] + (i + 1) * 2 * 8 + (6 + 2) + sumador;
//             int z = datos[2 + i] / sumador;
//         }
//         return datos;
//     }
 
//     public static void main(String[] arg) {
//         Optimizacion3 ejemplo = new Optimizacion3();
//         int[] datos = new int[] { 1, 2, 3, 4, 5, 6, 100, 90 };
//         ejemplo.algoritmo(datos);
 
//         for (int d : datos) {
//             System.out.println(d);
//         }
//     }
//  }

 public class Optimizacion3 {
    public int[] algoritmo(int[] datos) {
            //float array[] = new float[10];
            //int i=1;
            //int sumador=2;
            int limite = datos.length-2;
            for(int i=1;i<limite;i++) {
                //int temp = datos[2+i] + (i+1)*16 +2;
                //int temp = datos[2+i] + 16*i + 18 + 7;
                datos[i] = datos[2+i] + 16*i + 18 + 7 ;
                datos[i-1] =  datos[i]  + 1;
                //int z = datos[2+i] / sumador;
            }
            return datos;
    }
    public static void main(String[] arg) {
        Optimizacion3 ejemplo = new Optimizacion3();
        int[] datos = new int[] {1,2,3,4,5,6,100,90};
        ejemplo.algoritmo(datos);
       
        for (int d : datos) {
            System.out.println(d);
        }
    }
 }
 
 
 
