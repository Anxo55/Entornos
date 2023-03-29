public class Optimizacion7 {
    void ejemplo7SinOptimizar(int i) {
        float array[] = new float[5];
        array[i] = array[8+i] + (i+1)*5*8 + (5+1);
        array[i-1] = array[8+i] + (i+1) *5*8 + (6+1);
        }


        void ejemplo7Optimizado(int i) {
        float array[] = new float[5];
        float aux = array[8+i];        
        array[i] = aux + (i+1)*5*8 + (5+1);
        array[i-1] = aux + (i+1) *5*8 + (6+1);
        }
        
}
