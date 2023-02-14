public class DondeViveMaria {
   static int calcularVivienda( int totalCasas){

        for(int i=2;i<=totalCasas;i++) {
            int s1=0;
            for(int j=1;j<=i+1;j++) {
                s1+=j;
            }

            int s2=0;s
            for(int k=i+1;i<=totalCasas; k++) {
                s2+=k;
            }
            if(s1==s2) return i;
        }
        return -1;

    }

    static int sumatorio(int n) { // Suma de los n primeros números
        return n * (n + 1) / 2;
     }
     
     //Complejidad =(n) = lineal
     static int calcularVivienda2(int totalCasas){
        for(int i=2;i<=totalCasas-1;i++) {
            int sumaDerecha = sumatorio(i-1);
            int sumaIzquierda = sumatorio(totalCasas) - sumatorio(i);
            if(  sumaDerecha  == sumaIzquierda) return i;
        }
     return -1;
    }

    //Complejidad O(1) = constante
    static int calcularViviendas3(int totalCasas){
        double v = Math.sqrt(sumatorio(totalCasas) );
        return (v%1==0)?(int)v:-1;
     }
     

    public static void main(String[] args) {
        System.out.println(calcularVivienda(8));
    }
}
