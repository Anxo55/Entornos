import org.junit.jupiter.api.Test;

public class OptimizaTest {

    Optimiza optimiza;

    @Test
    void testBusca() {
        optimiza = new Optimiza();
        double fruta = optimiza.busca();
    }

    @Test
    void testCuentaFrutasConMinimoLetras() {
         optimiza =  new Optimiza();
         double fruta = optimiza.cuentaFrutasConMinimoLetras(0);
    }

    @Test
    void testMediaCaracteres() {
         optimiza = new Optimiza();
         double fruta = optimiza.mediaCaracteres();
    }
}
