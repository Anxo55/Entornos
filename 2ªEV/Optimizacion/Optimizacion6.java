package Optimizacion;

// public class Optimizacion6 {
//     int i=1;
//     void ejercioSinOptimizar() {
//         while(i<100) {
//             System.out.println(i);
//             i++;
//         }
//     }
//  }
 public class Optimizacion6{
    
void ejercioSinOptimizar() {
    int i=1;
    StringBuilder sb = new StringBuilder();
    while(i<1000000) {
        sb.append(i);
        sb.append("\n");
        i++;
    }
    System.out.println(sb.toString());
}
}
