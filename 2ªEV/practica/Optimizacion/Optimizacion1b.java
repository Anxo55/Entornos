public class Optimizacion1b {
    void ejemplo1SinOptimizar() {
        int b=0,c=0,d=0;
        int a= b +c;
        d=a-d;
        int e=(b+c)*d;
        // ...
        }

        void ejemplo1Optimizado(int b,int c,int d) {
            int a= b +c;
            d=a-d;
            int e=a*d;
            // ...
            }
}
