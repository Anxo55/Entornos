public class Optimizacion6b {
    
public static void main(String[] args) {
    // Los accesos al disco duro son muy lentos, evítalos si puedes
    try {
      File f= new File("fichero.txt");
     FileInputStream fis = new FileInputStream(f);
        int primerByte = fis.read();

        } catch ( IOException e) {
             e.printStackTrace();
        }
    }
    
}


