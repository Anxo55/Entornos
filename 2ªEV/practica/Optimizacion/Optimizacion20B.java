public class Optimizacion20B {
    
    boolean ejemplo20SinOptimizar(String palabraABuscar) {
        ArrayList palabras = new ArrayList<String>();
         
        boolean encontrado = false;
        for(int i=0;i<palabras.size();i++) {
            if(palabras.get(i) == palabraABuscar) {
                encontrado = true;
        }
    }
    return encontrado;
}

        boolean ejemplo20Optimizado(String palabraABuscar) {
            ArrayList palabras = new ArrayList();
            
            //boolean encontrado = false;
            for(int i=0;i<palabras.size();i++) {
            if(palabras.get(i).equals(palabraABuscar) ) {
            return true;
            }
            }
            return false;
    }
            

}
