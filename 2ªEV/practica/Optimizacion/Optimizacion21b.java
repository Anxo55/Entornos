public class Optimizacion21b {
    
    void ejemplo21SinOptimizar() {
        int item = 0;
        int valor = 0;
        do {
        item=10;
        valor = valor + item;
    }   while(valor<100);
}

        void ejemplo21Optimizado() {
        int item = 0;
        int valor = 0;
        item=10;
        do {
        valor = valor + item;
        }while(valor<100);
        }
        

}
