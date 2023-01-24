import java.security.InvalidParameterException;
import java.util.Date;

class Subject{
	String name; 	
	String address;	
	String cif;
}
class Article{
	String name; float price;
}
public class Bill {
	String cod; 
	Date fecha;	
	// float total;
	Subject subject;
	Article[] articles; // TOFIX: Mejor si usamos un ArrayList

	public float calculateTotal() {
		float total = 0;
		for(Article article: articles) { total += article.price; }
		return total;
	}
	
	// KISS
	public static String getNameDayOfWeek(int numberDay) throws InvalidParameterException{
		if(numberDay < 1 ||  numberDay > 7 ) {
			throw new InvalidParameterException("Numero de día invalido");
		}
		String[] days = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
		return days[numberDay-1];
	}
}


