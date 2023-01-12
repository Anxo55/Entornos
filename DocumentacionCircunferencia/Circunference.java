
/*
 * Copyright (c) 2023; Anxo Campos All right reserved
 * */
/**
 * Clase para el manejo de circunferencias
 * @author Primero DAM
 *@version 1.0
 *@see https://es.wiki
 *
 */


public class Circunference {
	/**
	 * Determina el tamaño desde el centro hasta el borde de la circunferencia
	 */
	float radio;
	/**
	 * determina el color en RGB de la circnferencia 
	 */
	private String color;
	/**
	 * Determina la posición de la cordenada horizontal
	 */
	public int x;
	/**
	 * Determina la posición de la cordenada vertical
	 */
	public int y;
	/**
	 * Constante que representa el numero PI
	 */
	private final static float PI=(float)Math.PI;
	
	/**
	 * Constructor que isntancia una circunferencia de color negro a partir de su radio
	 * @param radio
	 */
	
	public Circunference() {
		this.radio=1;
		setColor((byte)0, (byte)0, (byte)0);
	}
	
	/**
	 * Constructor por defecto que isntancia una circunferencia de color negro a 
	 * partir de su radio
	 * @param radio El valor del radio de la circunferencia
	 */
	
	public Circunference(float radio) {
		this.radio=radio;
		setColor((byte)0, (byte)0, (byte)0);
	}
	
	/**
	 * Calcula la longitud en metros del borde de la circunferencia
	 * @return el perimetro en metros 
	 */
	
	public float perimeter() {
		return 2*PI*radio;
	}
	
	/**
	 * Calcula la superficie en metro cadrados de la circuenferencia
	 * @return la superficie en metros cuadrados
	 */
	
	public float area() {
		return PI*this.radio*this.radio;  //(float)Math.pow(radio, 2) 
	}
	
	/**
	 * 
	 * @deprecated
	 * @return
	 */
	
	public float surface() {
		return area();
	}
	/**
	 * Establece el color de la circunferencia en basee a sus componentes RGB
	 * @param r Cantidad en hexadecimal de rojo
	 * @param g Cantidad en hexadecimal de verde 
	 * @param b Cantidad en hexadecimal de azul
	 */
	public void setColor(byte r, byte g, byte b) {
		color ="#" + r+g+b;
	}
	
	/**
	 * Determina si un <strong>punto</strong> está dentro de la circunferencia
	 * @param px coordenada horizontal del punto
	 * @param py coordenada vertical del punto
	 * @return True si el punto está dentro
	 */
	
	boolean pointIsInside(int px, int py) {
		
		int vx = px-x;
		int vy = py-y;
		//Aplicamos el teorema de Pitágoras
		// TOFIX optimizar
		double h = Math.sqrt(vx*vx+vy*vy);
		
			
			return h<radio;
		}
	}
	
	
