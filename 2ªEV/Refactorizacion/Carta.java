package Refactorizacion;

import java.util.ArrayList;


class Poder {
    String nombre;
    int valor;
}


interface Atacador {
    public float calcularDanno();
}


class CartaPlanta extends CartaOptimizada implements Atacador {
    public float calcularDanno() {
        if (estaCao())
            return 0;
        return danno >> 1;
    }
}


class CartaFuego extends CartaOptimizada implements Atacador {
    public float calcularDanno() {
        if (estaCao())
            return 0;
        return danno << 1;
    }
}


class CartaAgua extends CartaOptimizada implements Atacador {
    public float calcularDanno() {
        if (estaCao())
            return 0;
        return danno;
    }
}


class CartaElectrico extends CartaOptimizada implements Atacador {
    int voltaje = 5; // Cantidad de voltaje, usado para las cartas de tipo Electrico


    public float calcularDanno() {
        if (estaCao())
            return 0;
        if (voltaje <= 0)
            return 0;
        return danno * voltaje * 0.1f;
    }


}


public abstract class CartaOptimizada {
    String nombre = "default"; // nombre de la carta
    String descripcion; // Breve descripción de la carta
    boolean bloquedada = false; // Determina si la carta está bloqueada
    int danno = 100; // Daño que produce la carta al atacar
    int ps = 10; // Puntos de vida


    // Poder[] poderes; // poderes de la carta
    ArrayList<Poder> poderes2 = new ArrayList<>(); // Otra forma mejor usando arrayList


    boolean estaCao() {
        if (ps <= 0 || bloquedada)
            return true;
        return false;
    }


    public static void main(String[] args) {
        CartaElectrico c = new CartaElectrico();
        System.out.println(c.calcularDanno());
    }
}

