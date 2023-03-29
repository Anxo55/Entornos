public class Optimizacion3 {
    
    void ejemplo3SinOptimizar() {
        String total="";
        for(int i=0;i<10;i++) {
        // otras operaciones....
        String m = "Mensaje hola";
        int contador = i;
        total = m + contador;
        }
        System.out.println(total);
    
    }

    void ejemplo3Optimizado() {
        String total="";
        String m = "Mensaje hola";
        int i;
        for(i=0;i<10;i++) {
        // otras operaciones....
        // total = m+i
        }
        total = m + (i-1);
        System.out.println(total);
        }
        
}
