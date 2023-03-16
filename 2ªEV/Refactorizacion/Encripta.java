package Refactorizacion;

class Encripta {
    public String encripta(String textoClaro) {
        String result = "";
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String conversion = "48()3=#-|1C7Wn06@_$+VUM%I>";


        textoClaro = textoClaro.toUpperCase();


        for (int i = 0; i < textoClaro.length(); i++) {
            char letraSeleccionada = textoClaro.charAt(i);
            int posicionLetra = letras.indexOf(letraSeleccionada);
            result += conversion.charAt(posicionLetra);
        }
        return result;
    }


    public static void main(String[] args) {
        Encripta e = new Encripta();
        System.out.println(e.encripta("sala"));
    }
}

