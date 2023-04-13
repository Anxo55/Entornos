public class Hechizo {

    String descripcion; 
    String nombre = "default"; 
    boolean preparado = true;
    TiposHechizo tipo = TiposHechizo.Transformacion;


   class Hechizero {
    String nombreHechizero; 
    private int nivelHechizero; 
    private int  destrezaHechizero; 
    private int manaHechizero;
    }


enum TiposHechizo {
    Transformacion, Encantamiente, Embrujo, Malefico
}

TiposHechizo tiposHechizo;
private int nivelHechizero;
private int destrezaHechizero;
private int manaHechizero;
  
    boolean puedeLanzarHechizo() {
         return true;
    }
 
 
    // Calcula el daño de una carta
    float calcularDannoDelHechizoQueSeVaAAplicarCuandoAtaca() {
        switch (tipo) {
            case Transformacion:
                return nivelHechizero * 2 + destrezaHechizero;
            case Encantamiente:
                return nivelHechizero * 1 + destrezaHechizero;
            case Embrujo:
                return nivelHechizero / 2 + destrezaHechizero;
            case Malefico:
                return nivelHechizero * 2;
            default:
                return 0;
        }
 
 
    }
 
 
    public static void main(String[] args) {
 
        Hechizo c = new Hechizo();
        c.nivelHechizero=2;
        c.destrezaHechizero=3;
        c.manaHechizero=10;
        c.tipo = TiposHechizo.Embrujo;
        System.out.println(c.calcularDannoDelHechizoQueSeVaAAplicarCuandoAtaca());
 
 
    }
 }
 
