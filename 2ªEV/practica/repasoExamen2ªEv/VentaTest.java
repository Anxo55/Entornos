import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VentaTest {
    @Test
    void testCalcula_coste_total() {
        Venta v = new Venta();
        v.cliente = new ClienteNormal();
        v.cliente.tieneCuponGratis = true;
        v.coste=4000;
        v.dto=5;
        float total = v.calculCosteTotal();
        assertEquals(0, total);

    }
    @Test
    void testCalculaCosteVentaNormal() {
        Venta v = new Venta();
        //v.cliente.tipoDeCliente= Cliente.TipoCliente.NORMAL;
        v.cliente = new ClienteNormal();
        v.cliente.tieneCuponGratis = false;
        v.coste=1000;
        v.dto=0.5f;
        float total = v.calculCosteTotal();
        assertEquals(500, total);
    }

    @Test
    void testCalculaCosteEmpleado() {
        Venta v = new Venta();
        v.cliente = new ClienteNormal();
        v.cliente.esEmpleado = true;
        v.coste=1000;
        v.dto=0.5f;
        float total = v.calculCosteTotal(); 
        assertEquals(0, total);
    }
}
