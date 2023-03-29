import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class EjercicioTest {
    @Test
    public void testGetNumerosImpares() {
        Ejercicio ej = new Ejercicio();
        int r=ej.sumaDeCuadrados(2, 3);
        assertEquals(6,r);
    }

    @Test
    void testSumaDeCuadrados() {
        int[] numeros={4,5,1,7,2};
        ArrayList<Integer> r = Ejercicio.getNumerosImpares(numeros);
        assertEquals(2, r.size());
        assertEquals(1, r.get(0));
        assertEquals(7, r.get(1));
        assertEquals(r.toArray(), List.of(1,7).toArray());
    }

    @Test
    void testCalculaMedia() {
        float[] numeros = {2,5,1};
        //Ejercicio ej = new Ejercicio();
        float r = Ejercicio.calculaMedia(numeros);       
        assertEquals(2.666, r,0.01);
    }
}
