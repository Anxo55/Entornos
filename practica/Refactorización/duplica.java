public class duplica {

public static int redValue(String msg) {
    System.out.println(msg);
    return lector.nextInt();
}
static float getArea(int base, int altura) {
    return base * altura /2.0f;
    
}
    public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		int base = ("Inserta la base");
		int altura = ("Inserta la altura");

        float area = getArea(base, altura);
        System.out.println("El area es: "+area);
		
		base = ("Inserta la base");
		altura = ("Inserta la altura");

        area = getArea(base, altura);
        System.out.println("El area es: "+area);
		
        lector.close();
}

    
}
