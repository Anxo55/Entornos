import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
public class Book {
	String ISBN;
	String title;
	String[] authors;
	String editorial;
	//Edition[] editions;
	ArrayList<Edition> editions;
	
	public Book(String ISBN) {
		this.ISBN=ISBN;
	}
	
	int countAuthors() {
		return authors.length;
	}
	void addNewEdition(Edition edition) {
		//Edition[] newArray = Arrays.copyOf(editions, editions.length+1);
		//newArray[editions.length] = edition;
		//editions = newArray;
		editions.add(edition);
	}
}

class Edition{
	int id;
	String name;
	Date data;
	
	public Edition(int id, String name, Date data) {
		this.name = name;
		this.data = data;
		this.id = id;
	}
}
