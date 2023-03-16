package Refactorizacion;

// Añade un nuevo vehiculo (moto)
// Refactoriza el código
interface Volable{
	public void volar();
}
abstract public class Vehiculo {
	String nombre;
	float potencia;
	float peso;

	float getConsumo() {
		return potencia * peso;
	}
}

class moto extends Vehiculo{
}

class avion extends Vehiculo implements Volable{
	public void volar() {
		//...
	}
}

class avioneta extends Vehiculo implements Volable{
	public void volar() {
		// ...
	}
}
