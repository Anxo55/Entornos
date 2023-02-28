//Añade un nuevo vehiculo: Moto
//Refactoriza el codigo
interface Volable {
    public void volar();
}
abstract public class Vehiculo {
    String nombre;
    float potencia;
    float peso;

    float getConsumo() {
        return potencia;
    }
}

class moto extends Vehiculo {
}

class avion extends Vehiculo implements Volable {
    public void volar() {
        //...
    }
}

class avioneta extends Vehiculo implements Volable {
    public void volar() {
        //...
    }
}