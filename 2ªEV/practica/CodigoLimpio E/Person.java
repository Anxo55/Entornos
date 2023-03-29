//Hacer también el testing
//STUPID
public class Person {
	String name;
	String surname;
	String direction; 
	
	private String getInitials(String text){
		return text.toLowerCase().trim().charAt(0)+"";
	}
	
		public String getInitials() {
		String firstLetterOfName = getInitials(name);
		String firstLetterOfSurname = getInitials(surname);
		

		//System.out.println( firstLetterOfSurname + " " + firstLetterOfSurname );
		return firstLetterOfName + " "+ firstLetterOfSurname;
		}
		public void printInitialsOnScreen() {
			System.out.println(getInitials());
		}
	}



