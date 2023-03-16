//Ejercicio de Documentacion.

/**
 * En esta clase Pendulo
 * @author anxoc
 *@version 1.0
 */
class Pendulo{
    float longitud;
    
    /**
     * Se declara la longitud de la cuerda
     * @param longitud longitud en metro
     */
    public Pendulo(float longitud) {
    super();
    this.longitud = longitud;
    }
    
    /**
     * Este método calcula el periodo de oscilación del péndulo
     * @param gravedad gravedad del planeta en el que te encuentras
     * @return el periodo
     * @throws ArithmeticException lanzamos una excepcion cuando el periodo no tenga
     *longitud correcta o el periodo sea infinito 
     */
    double getPeriodo(float gravedad) throws ArithmeticException{
    if(longitud < 0) throw new ArithmeticException("El pendulo no tiene lontigud correcta");
    if(gravedad <= 0) throw new ArithmeticException("El periodo es infinito");
    return 2*Math.PI * Math.sqrt(longitud / gravedad);
    }
    
    /**
     * Este metodo calcula la frecuencia del pendulo
     * @param gravedad la aceleracion de la gravedad del planeta en el que estemos
     * @return frecuencia en Hercios(Hz)
     */
    double getFrecuencia(float gravedad) {
    if(longitud < 0) throw new ArithmeticException("El pendulo no tiene lontigud correcta");
    if(gravedad <= 0) throw new ArithmeticException("El periodo es infinito");
    return 1/getPeriodo(gravedad);
    }
    
    /**
     * Este metodo calcula la aceleracion angular del péndulo
     * @param gravedad gravedad del planeta en el que te encuentras
     * @param anguloEnGrados angulo del pendulo en grados
     * @return aceleracion angular en m/s^2
     */
    double getAceleracionAngular(float gravedad, int anguloEnGrados) {
    if(longitud < 0) return 0;
    double anguloEnRadianes = Math.toRadians(anguloEnGrados);
    return -(gravedad/longitud) * Math.sin(anguloEnRadianes);
    }
    }