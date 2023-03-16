package Refactorizacion;

public class Empresa {
    public String state;
    public final static String VIGO = "vigo";
    public final static String CORUNA = "coruna";
    public final static String LUGO = "lugo";
 
    public final static double VIGO_IMPUESTO = 0.21;
    public final static double CORUNA_IMPUESTO = 0.18;
    public final static double LUGO_IMPUESTO = 0.16;
    public final static double DEFAULT_IMPUESTO = 1;
   
    public final static double CORUNA_PUNTOS = 2;
    public final static double DEFAULT_PUNTOS = 0;
 
    public double base = 0.2;
 
    public double calc;
    public double points;
 
    private double calcularRate(String state) {
        if (state == VIGO) {
            return VIGO_IMPUESTO;
        } else if(state == LUGO) {
            return LUGO_IMPUESTO;
        }else if(state == CORUNA) {
            return CORUNA_IMPUESTO;
        } else {
            return DEFAULT_IMPUESTO;
        }
    }
    private double calcularPuntos(String state) {
        return state==CORUNA ? CORUNA_PUNTOS : DEFAULT_PUNTOS;
    }
    public double calculo() {
        double rate, amt=0;
        final double VALOR_CONSTANTE = 1.05;
        rate = calcularRate(state);
        points = calcularPuntos(state);
       
        amt = base * rate;
        calc = 2 * basis(amt) + extra(amt) * VALOR_CONSTANTE;
        return calc;
    }
 
    private double basis(double e) {
        return e + e;
    }
 
    private double extra(double e) {
        return e * e;
    }
 
    public static void main(String[] args) {
        Empresa e1 = new Empresa();
        e1.state = Empresa.LUGO;
        e1.calculo();
        System.out.println("c=" + e1.calc);
        System.out.println("c=" + e1.points);
       
        Empresa e2 = new Empresa();
        e2.state = Empresa.CORUNA;
        e2.calculo();
        System.out.println("c=" + e2.calc);
        System.out.println("c=" + e2.points);
 
        Empresa e3 = new Empresa();
        e3.state = Empresa.VIGO;
        e3.calculo();
        System.out.println("c=" + e3.calc);
        System.out.println("c=" + e3.points);
    }
 }
 
 
 
 