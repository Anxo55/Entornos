abstract class jugador{
    protected int golpeBase;
    String tipo;
    int resistencia;
     int calcularGolpe(jugador atacado){
        return golpeBase / atacado.resistencia;
 }
}
