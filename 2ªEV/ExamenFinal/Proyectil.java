//En el siguiente ejercicio eliminé el metodo enum y cree las clases 
//respectivas del tipo proyectil, ademas elimine el metodo switch donde  
//se usaba el metodo calculadañodisparo y lo introduje en cada una de las
//clases. Tambien elimine los if else en el metodo estaUsado.y devolvi 
//un metodo donde te devuelve true o false. Tambien cree los getters y setters
//de los atributos a utilizar//deonde extendi de la clase principal proyectil
//a las de su tipo.

class NORMAL extends Proyectil{

    public NORMAL(
        float calibre,
         float potenciaInicio,
         float calidad
         ) {
        super(calibre, potenciaInicio);
    }

    float calculadañodisparo() {
        return potenciaInicio * calibre + calidad;
    }

}

class INCENDIARIO extends Proyectil{

    public INCENDIARIO(
        float calibre, 
        float potenciaInicio,
        float calidad
        ) {
        super(calibre, potenciaInicio);
    }

    float calculadañodisparo() {
        return potenciaInicio * 8 * calibre + calidad;

    }

}

class PLATA extends Proyectil{

    public PLATA(
        float calibre, 
        float potenciaInicio,
        float cantidad
        ) {
        super(calibre, potenciaInicio);
        
    }

    float calculadañodisparo() {
        return potenciaInicio * 20 * calibre + calidad;
    }

}


public class Proyectil {

float calibre=100; // Calibre de la bala
    float potenciaInicio = 40;

    float calidad = 10;

    public Proyectil (
        float calibre,
        float potenciaInicio
    ){
        this.calibre = calibre;
        this.potenciaInicio = potenciaInicio;
    }
 
    boolean estaUsado(){
        if(calibre<=0) return true; else return false;

        
    }

    public float getCalibre() {
        return calibre;
    }

    public void setCalibre(float calibre) {
        this.calibre = calibre;
    }

    public float getPotenciaInicio() {
        return potenciaInicio;
    }

    public void setPotenciaInicio(float potenciaInicio) {
        this.potenciaInicio = potenciaInicio;
    }

    public float getCalidad() {
        return calidad;
    }

    public float setCalidad(int calidad) {
        return this.calidad = calidad;
    }


}