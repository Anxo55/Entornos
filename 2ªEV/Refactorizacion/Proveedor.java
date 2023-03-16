package Refactorizacion;

class Proveedor {
    boolean activo = true;
 }
 
 public abstract class OrdenVenta {
    float total;
    Proveedor proveedor;
    float peso;
    public abstract float getDescuento();
    public float calculaDescuento() {
        if (proveedor.activo == true && peso < 1000 && this instanceof OrdenVentaNormal) {
            return getDescuento();
        } else {
            return getDescuento();
        }
    }
 
    class OrdenVentaNormal extends OrdenVenta {
        public final static float DELTA = 0.5f;
        public float getDescuento() {
            float coste = total * DELTA;
            if (coste > 100) coste = 100;
            return coste;
        }
    }
 
    class OrdenVentaEspecial extends OrdenVenta {
        public final static float DELTA = 0.8f;
        public float getDescuento() {
            float coste = total * DELTA;
            if (coste > 200) coste = 200;
            return coste;
        }
    }
 
 }
 
