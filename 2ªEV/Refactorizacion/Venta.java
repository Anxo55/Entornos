package Refactorizacion;

abstract class Cliente{
	/** Nombre del cliente que realiza la compra */
	String nombre;
	/** Determina si un cliente es tambien empleado */
	boolean esEmpleado;
	/** Determina si el cliente posee cupón gratuito */
	boolean tieneCuponGratis;
}
class ClienteGold extends Cliente{ }
class ClientePlatinum extends Cliente{ }
class ClienteNormal extends Cliente{ }
/**
 * Clase que permite calcular el coste de una venta
 * @author Angel
 * @version 1.0
 *
 */
public class Venta {
	/** coste de la venta */
	float coste;
	/** descuento de la venta (en porcentaje con decimales) */
	float dto;
	
	Cliente cliente;
	
	private boolean isFree() {
		return cliente.esEmpleado ||  
			cliente instanceof ClienteGold ||
			cliente instanceof ClientePlatinum  ||
			cliente.tieneCuponGratis;
	}
	
	/**
	 * Método que calcula el total con descuento de la venta
	 * @return El valor del total con descuento
	 */
	float calculaCosteTotal() {
		//if(isFree()) return 0;
		//return coste *(1-dto);
		return isFree() ? 0 : coste *(1-dto);
	}
	/* Ampliación:
	 * Como los precios son muy altos, algunos clientes prefieren
	 * pagar el producto dentro de unos meses
	 * Crea una función que permita calcular el coste total
	 * - Especificando la cantidad de meses y
	 * - la tasa de interés que se le va a aplicar
	 *  (usa la formula del interés simple, googlea!)
	 * */
	
	/**
	 * Calcula el coste total con intereses
	 * @param meses tiempo en meses
	 * @param tasa tasa a aplicar
	 * @return el coste con intereses
	 */
	float calcularCosteConIntereses(int meses, float tasa) {
		return calculaCosteTotal() * tasa * meses + 1;
	}
}



// SOLUCION: Test

// import static org.junit.jupiter.api.Assertions.*;

// import org.junit.jupiter.api.Test;

// class VentaTest {

// 	@Test
// 	void testCalcula_coste_totalConCuponGratis() {
// 		Venta v = new Venta();
// 		v.cliente = new ClienteNormal();
// 		v.cliente.tieneCuponGratis = true;
// 		v.coste=4000;
// 		v.dto=5;
// 		float total = v.calculaCosteTotal();
// 		assertEquals(0, total);
// 	}
// 	@Test
// 	void testCalculaCosteDeVentaNormal() {
// 		Venta v = new Venta();
// 		//v.cliente.tipoDeCliente = Cliente.TipoCliente.NORMAL;
// 		v.cliente = new ClienteNormal();
// 		v.cliente.tieneCuponGratis=false;
// 		v.coste=1000;
// 		v.dto=0.5f;
// 		float total = v.calculaCosteTotal();
// 		assertEquals(500, total);
// 	}
// 	@Test
// 	void testCalculaCosteEsEmpleado() {
// 		Venta v = new Venta();
// 		v.cliente = new ClienteNormal();
// 		v.cliente.esEmpleado = true;
// 		v.coste=1000;
// 		v.dto=0.5f;
// 		float total = v.calculaCosteTotal();
// 		assertEquals(0, total);
// 	}

// }




