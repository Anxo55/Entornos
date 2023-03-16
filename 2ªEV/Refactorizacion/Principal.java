package Refactorizacion;

abstract class Animal{
    int peligrosidad;
    abstract void matar();
 }
 
 class Leon extends Animal{
    public Leon() { super.peligrosidad = 10; }
    @Override void matar() {
        //disparo de ca'on
    }
 }
 class Lobo extends Animal{
    public Lobo() { super.peligrosidad = 8; }
    @Override void matar() {
        //disparo bala plata
    }
 }
 class Gato extends Animal{
    public Gato() { super.peligrosidad = 1; }
    @Override void matar() {
        //patada
    }
 }
 
 
 public class Principal {
    public static void main(String[] args) {
        sumaA(3,5,7,10,22);
        sumaA( new int[] {3,5,7} );
    }
    public char obtenerPrimerCaracterEnMinusculas(String texto) {
        return texto.toLowerCase().charAt(0);
    }
 
    /*public int sumaO(int a, int b, int c, int d, int e, int f) {
        return a + b + c + d + e + f;
    }
    static public int sumaC(int[] datos) {
        int suma = 0;
        for(int i=0;i<datos.length;i++) {
            suma += datos[i];
        }
        return suma;
    }*/
    static public int sumaA(int... datos) {
        int suma = 0;
        for(int i=0;i<datos.length;i++) {
            suma += datos[i];
        }
        return suma;
    }
 
    private int obtenerNumeroCaracteres(String texto) {
        return texto.length();
    }
 
    public int calcularPeligrosidad(Animal animal) {
        return animal.peligrosidad;
    }
 
    public char otenerUltimoCaracterEnMinusculasYSinEspacios(String texto) throws Exception {
        if (texto == null) throw new Exception("Error, el texto no puede ser nulo");
       
        return texto.trim().toLowerCase().charAt(texto.length() - 1);
    }
 }
 
 
