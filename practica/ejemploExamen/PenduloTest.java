public class PenduloTest {
    
    @test
    void testGetPeriodo() {
        Pendulo p = new Pendulo(5);
        double periodo = p.getPeriodo(9.8f);
        assertEquals(4.487, periodo, 0.1);
    }

    @test
    void testGetAceleracionAngular() {
        Pendulo p = new Pendulo(5);
        double acelAng = p.getAceleracionAngular(9.8f, 2);
        assertEquals(-0.00116, acelAng,  0.1);
    }

    @test
    void testGetAceleracionAngularConLongCero() {
        Pendulo p = new Pendulo(-5);
        double acelAng = p.getAceleracionAngular(9.8f, 2);
        assertEquals(0, acelAng);
    }

}
