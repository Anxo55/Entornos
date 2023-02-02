public class Optimizacion7 {
    void ejemplo7SinOptimizar(int i) {
        float array[] = new float[5];
        array[i] = array[8+i] + (i+1)*5*8 + (5+1);
        array[i-1] = array[8+i] + (i+1) *5*8 + (6+1);
        }


        void ejemplo7Optimizado(int i) {
        float array[] = new float[5];
        float temporal = array[8+i];
        //tofix (i+1)*5*8 se puede a�adir a temporal
        //tofix potimizar calculos constantes 5+1 y 6+1
        array[i] = temporal + (i+1)*5*8 + (5+1);
        array[i-1] = temporal + (i+1) *5*8 + (6+1);
        }
        
}
