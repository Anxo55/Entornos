//Crear los testeos
// Refactorizarlo (codigo limpio)
// Optimizarlo
// Documentarlo

/*Clase que defsine un documento de tipo CIF o NIF 
 * @author
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase que define un documento de tipo CIF o NIF
 * @author Angel
 * @version 1.0
 *
 */
abstract public class DocumentoIdentificativo {
	/**
	 * Texto del cif o nif
	 */
	String text;
	
	/**
	 * Obtiene la letra alfabetica del documento
	 * @return La letra
	 */
	abstract String getLetter();
	
	/**
	 * Valida si el documento es correcto
	 * @return un booleano indicando si es correcto
	 */
	abstract boolean isValid();
	
}

class Nif extends DocumentoIdentificativo{
	String getLetter() {
		char temp = text.charAt(text.length()-1);
		return String.valueOf(temp);
	}
	boolean isValid() {
		//TODO falta por hacer
		return false;
	}
}

class Cif extends DocumentoIdentificativo{
	String getLetter() {
		char temp =  text.charAt(0);
		return String.valueOf(temp);
	}
	boolean isValid() {
		// empezar por letra(A-Z) y luego tener 8 numeros
		Pattern pattern = Pattern.compile( "^[A-Z]\\d{8}$" );
		Matcher matcher = pattern.matcher(text);
		return matcher.matches();
	}
	
}


    

