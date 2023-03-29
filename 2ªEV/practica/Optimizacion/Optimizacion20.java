public class Optimizacion20 {
    void ejemplo20SinOptimizar(int a){
        int num1 = a / 2;
        int num1 = a / 4;
        int num2 = a / 8;
        int num3 = a * 4;
        int num4 = a * 8;
        }

        void ejemplo20Optimizado(int a){
        int num1 = a >> 1;
        int num1 = a >> 2;
        int num2 = a >> 3;
        int num3 = a << 2;
        int num4 = a << 3;
        }

}
