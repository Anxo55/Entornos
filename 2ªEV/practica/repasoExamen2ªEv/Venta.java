//Documentar 
//Test
//Refactorizar y optimizar

abstract class Cliente {
/**Nombre del cliente que realiza la compra */
String nombre;
/**Determina si un cliente es tambien empleado */
boolean esEmpleado;
/**Determina si el cliente posee cupon gratuito*/
boolean tieneCuponGratis;
}

class ClienteGOld extends Cliente{}
class ClientePLATINUM extends Cliente{}
class ClienteNormal extends Cliente{}

/**
 * Clase que permite calcular el coste de una venta
 * @author Anxo
 * @version 1.0
 */

public class Venta{
    /** coste de la venta*/
    float coste;
    /**descuento de la venta ()*/
    float dto;
    
    Cliente cliente;

    private boolean isFree() {
     return(cliente.esEmpleado || 
        cliente instanceof ClienteGOld ||
        cliente instanceof ClientePLATINUM ||
        cliente.tieneCuponGratis);
    }

/**
 * Metodo que calcula el total con descuento de la venta
 * @return el valor del total con descuento.
 */

    float calculCosteTotal() {
        // if (isFree()) return 0;
        // return coste *(1-dto);
        return isFree() ? 0 : coste * (1-dto);

        //condicion ? xxx  :  yyy
    }

    /*Ampliación
     * Como los precios son muy altos, algunos clientes prefieren
     * pagar el producto dentro de unos meses
     * Crea una función que permita calcular el coste total
     * -Especificando la cantidad de meses y
     * -la tasa de interés que se le va a aplicar
     * (usa la formula del interés simple)
     */

     /**
      * Calcula el coste total con intereses
      * @param meses
      * @param tasa
      * @return
      */
     float calcularCosteConIntereses(int meses, float tasa) {
        return calculCosteTotal() * tasa * meses + 1;
     }
}
