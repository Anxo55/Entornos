public class Optimizacion11 {
    void ejemplo11SinOptimizar() {
        int i = 0;
        while(i<10) {
        System.out.println("hola:"+i);
        i++;
        }
        int j = 0;
        while(j<10) {
        System.out.println("adios:"+j);
        j++;
     }
}
        
        void ejemplo11Optimizado() {
            int i = 0;
            while(i<10) {
            System.out.println("hola:"+i);
            i++;
            }
            i=0;
            while(i<10) {
            System.out.println("adios:"+i);
            i++;
         }
    }
            
}
