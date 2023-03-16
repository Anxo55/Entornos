package Refactorizacion;

class Direccion {
	public String direccion;
	public String ciudad;
	public int cp;
	final static private String[] PROVINCIAS = {"", "Alava", "Albacetge", "Alicante", "Almería"};
	
	public boolean validarDireccion() {
		// validamos los datos del cliente
		return true;
	}

	public String getProvincia(int cp) {
		int codigoProvincia = cp / 100;
		return PROVINCIAS[codigoProvincia];
	}
}

public class Cliente {
	public String nombre;
	public String telefono;
	public String email;
	public Direccion direccion;
	
	public void registrarCliente() {
		// guardamos el cliente
	}
}


