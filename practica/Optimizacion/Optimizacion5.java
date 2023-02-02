public class Optimizacion5 {
    void ejemplo5SinOptimizar(int i, int c, int m) {
        int a = 3 + i;
        int f=a;
        int b=f+c;
        int d=a+m;
        m=f+d;
        }

        void ejemplo5Optimizado(int i, int c, int m) {
            int a = 3 + i;
            //int f=a;
            int b=a+c;
            int d=a+m;
            m=a+d;
            }
            
}
