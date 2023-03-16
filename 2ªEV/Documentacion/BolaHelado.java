package Documentacion;

// import java.util.ArrayList;


// class BolaHelado {
//    private String nombre;
//    private float precio;


//    public BolaHelado(String nombre, float precio) {
//        super();
//        this.nombre = nombre;
//        this.precio = precio;
//    }


//    public String getNombre() {
//        return nombre;
//    }


//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }


//    public float getPrecio() {
//        return precio;
//    }


//    public void setPrecio(float precio) {
//        this.precio = precio;
//    }
// }






// public class Helado {
//    final static float PRECIO_BASE = 5;
  
//    private ArrayList<BolaHelado> listaBolas = new ArrayList<BolaHelado>();


//    public int getCantidadBolas() {
//        return listaBolas.size();
//    }


//    public float getCosteHelado() {
//        float coste = PRECIO_BASE;
//        for (BolaHelado i : listaBolas) {
//            coste += i.getPrecio();
//        }
//        return coste;
//    }


//    public void addBola(BolaHelado bola) {
//        listaBolas.add(bola);
//    }


//    public void quitarBola(BolaHelado bola) {
//        listaBolas.remove(bola);
//    }


//    public void quitarTodasLasBolas() {
//        listaBolas.clear();
//    }


//    public String obtenerBolasFormatoTexto() {
//        String resultado = "";
//        for (BolaHelado i : listaBolas) {
//            resultado += i.getNombre();
//            resultado += "\n";
//        }
//        return resultado;
//    }


//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        for (BolaHelado i : listaBolas) {
//            sb.append(i.getNombre());
//            sb.append("\n");
//        }
//        return sb.toString();
//    }


// }



import java.util.ArrayList;
 
class BolaHelado {
   private String nombre;
   private float precio;
 
   public BolaHelado(String nombre, float precio) {
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
  * Modela un helado
  */
public class Helado {
    /** Precio base coste del helado */
   final static float PRECIO_BASE = 5;
 
   /**
    * Lista de bolas de helado
    */
   private ArrayList<BolaHelado> listaBolas = new ArrayList<BolaHelado>();
 
   /**
    * Devuelve le numero de bolas de helado
    * @return numero de bolas de helado
    */
   public int getCantidadBolas() {
       return listaBolas.size();
   }
 
   /**
    * Devuelve el precio total del helado
    * @return precio total del helado
    */
   public float getCosteHelado() {
       float coste = PRECIO_BASE;
       for (BolaHelado i : listaBolas) {
           coste += i.getPrecio();
       }
       return coste;
   }
 
   /**
    * Añade una bola de helado a la lista
    * @param bola bola de helado a añadir
    */
   public void addBola(BolaHelado bola) {
       listaBolas.add(bola);
   }
 
   /**
    * Elimina una bola de helado de la lista
    * @param bola bola de helado a eliminar
    */
   public void quitarBola(BolaHelado bola) {
       listaBolas.remove(bola);
   }
 
   /**
    * Elimina todas las bolas de elado
    */
   public void quitarTodasLasBolas() {
       listaBolas.clear();
   }
 
   /**
    * Devuelve una frase con todas las bolas de helado
    * @return frase con todas las bolas de helado
    * @deprecated Usar toString
    */
   public String obtenerBolasFormatoTexto() {
       String resultado = "";
       for (BolaHelado i : listaBolas) {
           resultado += i.getNombre();
           resultado += "\n";
       }
       return resultado;
   }
 
   /**
    * Devuelve una frase con todas las bolas de helado
    * @return frase con todas las bolas de helado
    */
   @Override
   public String toString() {
       StringBuilder sb = new StringBuilder();
       for (BolaHelado i : listaBolas) {
           sb.append(i.getNombre());
           sb.append("\n");
       }
       return sb.toString();
   }
 
}
