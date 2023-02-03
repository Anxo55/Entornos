public class Optimizacion8 {
    void ejemplo8SinOptimizar() {
        int pos = 3;
        int contador = 0;
        int array[] = new int[5];
        for(int i=0;i<2000;i++) {
        //cosas
        contador = array[pos] + i;
        //cosas
        }
        System.out.println(contador);
        //cosas
        }

        void ejemplo8Optimizado() {
            int pos = 3;
            int contador = 0;
            int array[] = new int[5];
            int temporal = array[pos];
            for(int i=0;i<2000;i++) {
            //cosas
            contador = temporal + i;
            //cosas
            }
            System.out.println(contador);
            //cosas
            }

}
