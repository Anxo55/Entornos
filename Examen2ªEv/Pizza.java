import java.util.ArrayList;


class Ingrediente {
  private String nombre;
  private float precio;




  public Ingrediente(String nombre, float precio) {
      super();
      this.nombre = nombre;
      this.precio = precio;
  }




  public String getNombre() {
      return nombre;
  }




  public void setNombre(String nombre) {
      this.nombre = nombre;
  }




  public float getPrecio() {
      return precio;
  }




  public void setPrecio(float precio) {
      this.precio = precio;
  }
}

/**
 * Clase donde tenemos el alimento pizza
 * @author Anxo 
 * @version 1.0
 */
public class Pizza {


  final static float PRECIO_BASE = 5;


  private ArrayList<Ingrediente> listaIngredientes = new ArrayList<Ingrediente>();

/**
 * Metodo donde nos da la cantidad de ingredientes
 * @return nos devuelve una lista de ingredientes
 */
  public int getCantidadIngredientes() {
      return listaIngredientes.size();
  }



/**
 * metodo donde obtenemos el precio base de la pizza
 * @return nos devuelve el coste
 */
  public float getCostePizza() {
      float coste = PRECIO_BASE;
      for (Ingrediente i : listaIngredientes) {
          coste += i.getPrecio();
      }
      return coste;
  }



/**
 * Metodo donde añade ingrediente bola
 * @param bola ingrediente bola que se obtiene
 */
  public void addIngrediente(Ingrediente bola) {
   listaIngredientes.add(bola);
  }



  /**
   * Metodo para eliminar ingedientes
   * @param bola bola se elimina del ingrediente
   */
  public void quitarIngrediente(Ingrediente bola) {
   listaIngredientes.remove(bola);
  }



  
  public void quitarTodosLosIngredientes() {
   listaIngredientes.clear();
  }



/**
 * Obtencion de ingredientes en formato texto
 * @return nos devuelve un resultado
 */
  public String obtenerIngredientesFormatoTexto() {
      String resultado = "";
      for (Ingrediente i : listaIngredientes) {
          resultado += i.getNombre();
          resultado += "\n";
      }
      return resultado;
  }




  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      for (Ingrediente i : listaIngredientes) {
          sb.append(i.getNombre());
          sb.append("\n");
      }
      return sb.toString();
  }




}