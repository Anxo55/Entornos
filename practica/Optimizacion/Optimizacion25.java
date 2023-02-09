public class Optimizacion25 {
    
    void ejemplo25SinOptimizar() {
        File fichero = new File("miFichero.txt");
        try {
        FileReader fr = new FileReader(fichero);
        int miByte1 = fr.read();
        int miByte2 = fr.read();
        int miByte3 = fr.read();
        //tofix colocar el cierre del fichero en el finally
        fr.close();
        } catch (FileNotFoundException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        }
        }
    

    void ejemplo25Optimizado() {
		File fichero = new File("miFichero.txt");
		try {
			FileReader fr = new FileReader(fichero);
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			//tofix colocar el cierre del fichero en el finally
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
    
