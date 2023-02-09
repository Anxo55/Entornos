public class Optimizacion22 {
 
    void ejemplo22SinOptimizar() {
        String nombres = "";
        nombres = nombres + "Angel";
        nombres = nombres + "Rosa";
        nombres = nombres + "Paula";
        nombres += "Juan";
}

// Mejoramos el con StringBuffer (sincroniced).
// Lo usaremos solo si estoy creando aplicaciones con varios hilos
void ejemplo22OptimizadoA() {
    
    StringBuffer sb = new StringBuffer();
    sb.append("Angel");
    sb.append("Rosa");
    sb.append("Paula");
    sb.append("Juan");
 }
  
    
    // Mejoramos el con StringBuffer (no sincroniced)
    // Lo usaremos si no estoy usando hilos
    void ejemplo22OptimizadoB() {

    StringBuilder nombres = new StringBuilder();
    nombres.append("Angel");
    nombres.append("Rosa");
    nombres.append("Paula");
    nombres.append("Juan");
 }
    

}
