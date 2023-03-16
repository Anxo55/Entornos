package Refactorizacion;

public class Alumno {

    /**
     * Determina el numero maximo de faltas que se permiten a un alumno
     */
    public static final int MAX_NUM_FALTAS = 5;
    /**
     * Valor de la nota cuando el alumno no ha cometido las faltas suficientes
     */
    public static final int NOTA_SIN_FALTAS = 5;
    /**
     * Valor de la nota cuando el alumno se ha pasado del n' de faltas
     */
    public static final int NOTA_CON_FALTAS = 1;
   
    /**
     * Almacena la cantidad de faltas del alumno
     */
    private int numeroDeRetrasos;
 
    /**
     * Contructor del alumno a partir de sus faltas
     * @param numeroDeRetrasos Las faltas del alumno
     */
    public Alumno(int numeroDeRetrasos) {
        this.numeroDeRetrasos = numeroDeRetrasos;
    }
       
    /**
     * Devuelve la cantidad de faltas cometidas por el alumno
     * @return la cantidad de faltas
     */
    public int getNumeroDeRetrasos() {
        return numeroDeRetrasos;
    }
 
    /**
     * Establece el n'mero de faltas cometidas por el alumno
     * @param numeroDeRetrasos la cantidad de faltas
     */
    public void setNumeroDeRetrasos(int numeroDeRetrasos) {
        if(numeroDeRetrasos < 0  ||  numeroDeRetrasos > 300) {
            throw new NumberFormatException();
        }      
        this.numeroDeRetrasos = numeroDeRetrasos;
    }
 
    /**
     * Devuelve la calificaci'n del alumno en funci'n de sus faltas
     * @return la calificaci'n
     */
    public int obtenerCalificacion() {
        return masDeCincoRetrasos() ? NOTA_CON_FALTAS : NOTA_SIN_FALTAS;
    }
 
    /**
     * Determina si las faltas superar el maximo permitido
     * @return un booleano indicando si se superan el maximo de faltas
     */
    private boolean masDeCincoRetrasos() {
        return numeroDeRetrasos > MAX_NUM_FALTAS;
    }
 
   
    public static void main(String[] args) {
        Alumno a1 = new Alumno(5);
        System.out.println(a1.obtenerCalificacion());
 
        Alumno a2 = new Alumno(1);
        System.out.println(a2.obtenerCalificacion());
 
        Alumno a3 = new Alumno(7);
        System.out.println(a3.obtenerCalificacion());
    }
 
 }

 //TEST

//  import static org.junit.jupiter.api.Assertions.*;

// import org.junit.jupiter.api.Test;

// class AlumnoTest {
//    @Test
//    void test() {
//        Alumno a = new Alumno(12);
//        int c = a.obtenerCalificacion();
//        assertEquals(1, c);
      
//        a = new Alumno(2);
//        c = a.obtenerCalificacion();
//        assertEquals(5, c);
//    }

// }
 