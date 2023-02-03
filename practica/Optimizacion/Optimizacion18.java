public class Optimizacion18 {
    void ejemplo18SinOptimizar() {
        ArrayList datos = new ArrayList();
        for(int i=0;i<10000;i++) {
        datos.add(i);
        }
        }
        /*El objetivo es almacenar cosas lo m�s r�pido posible*/
        void ejemplo18OptimizadoA() {
        HashSet datos = new HashSet();
        for(int i=0;i<10000;i++) {
        datos.add(i);
        }
        }
        /*Acceder a la informaci�n lo m�s rapido posible*/
        void ejemplo18OptimizadoB() {
        TreeSet datos = new TreeSet();
        for(int i=0;i<10000;i++) {
        datos.add(i);
        }
        }

}
