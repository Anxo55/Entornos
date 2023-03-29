public class Optimizacion21 {
    void guardarEnFicheroSinOptimizar(String ruta, int valor) {
        // Abrir el fichero (ruta)
        // guardar valor dentro del fichero
        // cerrar el fichero
        }
        void ejemploSinOptimizar() {
        for(int i=0;i<1000;i++) {
        guardarEnFicheroSinOptimizar("miFichero.txt", i);
        }
        }
        void guardarEnFicheroOptimizado(File fichero, int valor) {
        // guardar valor dentro del fichero
        }
        void ejemploOptimizado() {
        // Abrir la conexi�n con el fichero
        File fichero = null;
        for(int i=0;i<1000;i++) {
        guardarEnFicheroOptimizado(fichero, i);
        }
        // Cerrar la conexion con el fichero
        }

}
