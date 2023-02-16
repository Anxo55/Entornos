class Direccion{
    public String direccion;
    public String ciudad;
    public String cp;
    public String[] provincias = {"", "Alava", "Albacete", "Alicante" }; // rellenar todos
   
    public String getProvincia() throws UnsupportedOperationException {
        return provincias[Integer.parseInt( cp.substring(0,1)) ];
    }
    public boolean validarDireccion() {    
        // validamos los datos del cliente
        return true;
    }
 }
 public class Cliente {
    public String nombre;
    public String telefono;
    public String email;
    public Direccion direccion;
   
    public void registrarCliente() {        // guardamos el cliente
    }
   
 }
 
 
 
