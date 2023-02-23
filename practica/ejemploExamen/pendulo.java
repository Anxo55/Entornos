/** 
 * Clase que modela el comportamiento de un pendulo
 * @author anxo
 *@version 1.0
 * see https:
 *  
 */

class Pendulo{	
    /**
     * El tamaño del pendulo
     */
	float longitud;
	
    /**
     * Constructor del pendulo a aprtir de su longitud
     * @param longitud el tamaño en metros del pendulo
     */
	public Pendulo(float longitud) {
		super();
		this.longitud = longitud;
	}

    /**
     * Tiempo en segundos que tarda el pendulo en oscilar
     * @param gravedad valor de la gravedad del planeta
     * @return el tiempo en segundos
     * @throws ArithmeticException cuando la longitud o la gravedad es menor que cero
     */
	double getPeriodo(float gravedad) throws ArithmeticException{
		if(longitud < 0) throw new ArithmeticException("El pendulo no tiene lontigud correcta");
		if(gravedad <= 0) throw new ArithmeticException("El periodo es infinito");
		return 2*Math.PI * Math.sqrt(longitud / gravedad);
		
	}
	/**
     * cantidad de veces que oscila el pendulo por segundo
     * @param gravedad valor de la gravedad del planeta
     * @return la cantidad de veces que oscila
     */
	double getFrecuencia(float gravedad) {
		if(longitud < 0) throw new ArithmeticException("El pendulo no tiene lontigud correcta");
		if(gravedad <= 0) throw new ArithmeticException("El periodo es infinito");
		return 1/getPeriodo(gravedad);
	}
	/**
     * Aceleracion del pendulo
     * @param gravedad valor de la gravedad del planeta
     * @param anguloEnGrados El valor del angulo del pendulo
     * @return
     */
	double getAceleracionAngular(float gravedad, int anguloEnGrados) {
		if(longitud < 0) return 0;
		double anguloEnRadianes = Math.toRadians(anguloEnGrados);
		return -(gravedad/longitud) * Math.sin(anguloEnRadianes);
	}
}

