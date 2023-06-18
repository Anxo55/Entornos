import java.util.Hashtable;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
/**
* Clase que convierte una frase cualquiera en codigo morse
*
* @author Anxo
* @version 1.0
* @
*
*/
public class LenguajeMorse {
    private static Hashtable<String, String> equivalencias = new Hashtable<>();

    private LenguajeMorse() {
    }

    static {
        equivalencias.put("A", ".-");
        equivalencias.put("B", "-...");
        equivalencias.put("C", "-.-.");
        equivalencias.put("CH", "----");
        equivalencias.put("D", "-..");
        equivalencias.put("E", ".");
        equivalencias.put("F", "..-.");
        equivalencias.put("G", "--.");
        equivalencias.put("H", "....");
        equivalencias.put("I", "..");
        equivalencias.put("J", ".---");
        equivalencias.put("K", "-.-");
        equivalencias.put("L", ".-..");
        equivalencias.put("M", "--");
        equivalencias.put("N", "-.");
        equivalencias.put("Ñ", "--.--");
        equivalencias.put("O", "---");
        equivalencias.put("P", ".--.");
        equivalencias.put("Q", "--.-");
        equivalencias.put("R", ".-.");
        equivalencias.put("S", "...");
        equivalencias.put("T", "-");
        equivalencias.put("U", "..-");
        equivalencias.put("V", "...-");
        equivalencias.put("W", ".--");
        equivalencias.put("X", "-..-");
        equivalencias.put("Y", "-.--");
        equivalencias.put("Z", "--..");
        equivalencias.put("0", "-----");
        equivalencias.put("1", ".----");
        equivalencias.put("2", "..---");
        equivalencias.put("3", "...--");
        equivalencias.put("4", "....-");
        equivalencias.put("5", ".....");
        equivalencias.put("6", "-....");
        equivalencias.put("7", "--...");
        equivalencias.put("8", "---..");
        equivalencias.put("9", "----.");
        equivalencias.put(".", ".-.-.-");
        equivalencias.put(",", "--..--");
        equivalencias.put(":", "---...");
        equivalencias.put("?", "..--..");
        equivalencias.put("'", ".----.");
        equivalencias.put("-", "-....-");
        equivalencias.put("/", "-..-.");
        equivalencias.put("\"", ".-..-.");
        equivalencias.put("@", ".--.-.");
        equivalencias.put("=", "-...-");
        equivalencias.put("!", "−.−.−−");
    }

    
    /**
     * 
     * @param frecuencia atributo que nos da la frecuencia
     * @param herzios atributo que nos da los herzios
     * @param tiempo atributo que nos dael tiempo
     * @return nos devuelve el angulo de la Onda.
     */
    private static double getAnguloOnda(float frecuencia, int herzios, int tiempo) {
        return tiempo / (frecuencia / herzios) * 2.0 * Math.PI;
    }

 
    /**
     * 
     * @param periodo atributo que nos da el periodo
     * @return nos devuelve la frecuencia
     */
    static double calculaFrecuencia(float periodo) {
        return 1.0 / periodo;
    }

   
    /**
     * 
     * @param hz frecuencia en herzios
     * @param msecs duracion en mili Segundos
     * @param volume volumen del sonido audible
     */
    private static void generaSonidoAudible(int hz, int msecs, int volume) {
        float frequency = 44100;
        byte[] buf;
        AudioFormat af;

        buf = new byte[1];
        af = new AudioFormat(frequency, 8, 1, true, false);

        try {
            SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
            sdl = AudioSystem.getSourceDataLine(af);
            sdl.open(af);
            sdl.start();
            for (int i = 0; i < msecs * frequency / 1000; i++) {
                double angle = getAnguloOnda(frequency, hz, i);
                buf[0] = (byte) (Math.sin(angle) * volume);
                sdl.write(buf, 0, 1);
            }
            sdl.drain();
            sdl.stop();
            sdl.close();
        } catch (LineUnavailableException ex) {
            System.out.println(ex);
        }
    }

   
    /**
     * Metodo que emite una señal codificada en morse para que suene por los altavoces
     * @param morse atributo de sonido
     */
    public static void sonar(String morse) {
        final int FRECUENCIA = 1000;
        final int VOLUMEN = 100;
        for (String simbolo : morse.split("")) {
            int duracion = simbolo.equals(".") ? 100 : 300;
            generaSonidoAudible(FRECUENCIA, duracion, VOLUMEN);
        }
    }

    
    /**
     * 
     * @param ascii atributo de representacion de codigo mrose
     * @return representacion en codigo morse
     */
    public static String textoToMorse(String ascii) {
        String morse = "";
        for (String caracter : ascii.split("")) {
            morse += LenguajeMorse.equivalencias.getOrDefault(caracter.toUpperCase(), "");
        }
        return morse;
    }

    public static void main(String arg[]) {
        String simbolosMorse = LenguajeMorse.textoToMorse("hola");
        System.out.println(simbolosMorse);
        // sonar(simbolosMorse);
        System.out.println(LenguajeMorse.calculaFrecuencia(2.4f));
    }
}
