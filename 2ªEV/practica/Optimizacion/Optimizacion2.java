public class Optimizacion2 {
    void ejemplo2SinOptimizar() {
        int valor=0,item;
        do {
        item=10;
        valor += valor + item;
        }while(valor<100);
        // ...
        }

        void ejemplo2Optimizado() {
            int valor=0,item;
            item=10;
            do {
            valor += valor + item;
            }while(valor<100);

            // ... MAS CODIGO
            }
       
}
