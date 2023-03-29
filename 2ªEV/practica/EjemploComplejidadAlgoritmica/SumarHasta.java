public class SumarHasta {

    // Complejidad O(n) = lineal
    static int add(int x) {
        int suma=0;
        for(int i=0;i<=x;i++) {
            suma=suma + i;
        }
        return suma;
    }
    //Complejidad O(1) = constante
    static int add2(int x) {
    return x*(x+1)/2;

    }

public static void main(String[] args) {
    System.out.println( add(3) );
    System.out.println( add(1000));

    System.out.println( add2(3) );
    System.out.println( add2(1000));
}

}
