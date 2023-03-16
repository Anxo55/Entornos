package Documentacion;

// public class Cajero {
//     public String localizacion;
//     public float dinero_Total;
 
//     // la variable ence determina si el cajero está encendido o apagado
//     public boolean ence;
 
//     public Cajero() {
//         super();
//         dinero_Total = 0;
//         ence = true;
//     }
 
//     public Cajero(String localizacion, float dineroTotal) {
//         super();
//         this.localizacion = localizacion;
//         this.dinero_Total = dineroTotal;
//     }
 
//     public void deposito(float cantidad) {
//         if (cantidad < 0 || cantidad > 9999999) {
//             System.out.println("error en la cantidad");
//             return;
//         }
//         dinero_Total = dinero_Total + cantidad;
//     }
 
//     public void extranccion(float cantidad) {
//         if (cantidad < 0 || cantidad > 9999999) {
//             System.out.println("error en la cantidad");
//             return;
//         }
//         dinero_Total = dinero_Total - cantidad;
//     }
 
//     public void realizarOperacion(int operacion) {
//         if (operacion == 1) {
//             System.out.println("Apagando el cajero");
//             ence = false;
//         } else if (operacion == 2) {
//             System.out.println("Encendiendo el cajero");
//             ence = true;
//         } else if (operacion == 3) {
//             System.out.println("Pausando el cajero");
//             ence = false;
//         } else if (operacion == 4) {
//             System.out.println("Modo mantenimiento del cajero");
//             ence = false;
//         }
//     }
 
//     public int returnDinero() {
//         return (int) dinero_Total;
//     }
 
//     public double RealizarCalculo(long edad) {
//         double cantidad = edad;
//         double modulo = 23;
//         double expresion = 22;
//         double valor = Math.min(modulo, expresion + 0.5 - this.dinero_Total / 4);
//         double m1 = Math.round(expresion) + valor - Math.abs(modulo);
//         double m2 = (Math.round(expresion) + valor) * valor;
//         do {
//             cantidad = 2 + 7 + modulo * edad;
//             valor += valor + cantidad;
//         } while (valor < 100);
 
//         for (int i = 0; i < Math.abs(m1); i++) {
//             m2++;
//             expresion--;
//         }
 
//         return m1 + m2 + valor;
//     }
 
//     public double calculo(long edad) {
//         double cantidad = edad * 2;
//         return cantidad;
//     }
 
//     public void Mostrar_Datos() {
//         System.out.println(localizacion + " tiene " + dinero_Total + " Euros dentro de la caja fuerte.");
//     }
 
//     public static void main(String[] args) {
//         Cajero c = new Cajero("Pizarro", 22);
//         System.out.println(c.RealizarCalculo(23));
//     }
//  }




/*
* Cebem copyright 2018. Todos los derechos reservados.
*/

/**
* Clase que modela el comportamiento de un cajero
* @author Angel
* @version 1.0
* @
*
*/
public class Cajero {
    /**
     * Determina la posici'n (calle) donde est' situado el cajero
     */
    public String localizacion;
    /**
     * Cantidad total que posee el cajero
     */
    public float dinero_Total;
 
    /**
     * Determina si el cajero est' encendido o apagado
     */
    public boolean ence;
 
    /**
     * Constructor por defecto,
     * inicializa el dinero total a 0 y enciende el cajero
     */
    public Cajero() {
        super();
        dinero_Total = 0;
        ence = true;
    }
 
    /**
     * Constructor con 2 parametros
     * @param localizacion La localizaci'n del cajero
     * @param dineroTotal El dinero total que posee
     */
    public Cajero(String localizacion, float dineroTotal) {
        super();
        this.localizacion = localizacion;
        this.dinero_Total = dineroTotal;
    }
 
    /**
     * Permite depositar una cantidad de dinero en el cajero
     * Solo se permiten insertar valores entre 0 y 9999999
     * @param cantidad La cantidad a depositar
     */
    public void deposito(float cantidad) {
        if (cantidad < 0 || cantidad > 9999999) {
            System.out.println("error en la cantidad");
            return;
        }
        dinero_Total = dinero_Total + cantidad;
    }
 
    /**
     * Permite sacar una cantidad de dinero del cajero
     * Solo se permite sacar valores entre 0 y 9999999
     * @param cantidad La cantidad a extraer
     */
    public void extranccion(float cantidad) {
        //@TOFIX Comprobar que la cantidad a extraer es inferior
        // a la cantidad que posee el cajero
        if (cantidad < 0 || cantidad > 9999999) {
            System.out.println("error en la cantidad");
            return;
        }
        dinero_Total = dinero_Total - cantidad;
    }
 
    /**
     * Ejecuta una operaci'n indicada por par'metro
     * @param operacion El c'digo de operaci'n
     */
    public void realizarOperacion(int operacion) {
        if (operacion == 1) {
            System.out.println("Apagando el cajero");
            ence = false;
        } else if (operacion == 2) {
            System.out.println("Encendiendo el cajero");
            ence = true;
        } else if (operacion == 3) {
            System.out.println("Pausando el cajero");
            ence = false;
        } else if (operacion == 4) {
            System.out.println("Modo mantenimiento del cajero");
            ence = false;
        }
    }
 
    /**
     * Devuelve el dinero total del cajero.
     * @return El dinero total
     */
    public int returnDinero() {
        return (int) dinero_Total;
    }
 
    /**
     * calcula (mediante un algoritmo avanzado) el valor m'ximo que se le va a permitir extraer a un cliente en funci'n de su edad
     * @param edad La edad del cliente
     * @return El vamor m'ximo pemitido a extraer
     */
    public double RealizarCalculo(long edad) {
        double cantidad = edad;
        double modulo = 23;
        double expresion = 22;
        double valor = Math.min(modulo, expresion + 0.5 - this.dinero_Total / 4);
        double m1 = Math.round(expresion) + valor - Math.abs(modulo);
        double m2 = (Math.round(expresion) + valor) * valor;
        do {
            cantidad = 2 + 7 + modulo * edad;
            valor += valor + cantidad;
        } while (valor < 100);
 
        for (int i = 0; i < Math.abs(m1); i++) {
            m2++;
            expresion--;
        }
 
        return m1 + m2 + valor;
    }
 
    /**
     * Realiza un calculo cualquiera
     * @param edad La edad del cliente
     * @return Un valor cualquiero
     * @deprecated Usar mejor la funcion RealizarCalculo
     */
    public double calculo(long edad) {
        double cantidad = edad * 2;
        return cantidad;
    }
 
    /**
     * Pinta en pantalla la informaci'n del cajero
     */
    public void Mostrar_Datos() {
        System.out.println(localizacion + " tiene " + dinero_Total + " Euros dentro de la caja fuerte.");
    }
   
   
    public static void main(String[] args) {
        Cajero c= new Cajero("Pizarro", 22);
        System.out.println( c.RealizarCalculo(23) );
    }
 }
 
 
 
 
