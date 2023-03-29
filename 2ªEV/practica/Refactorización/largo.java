public class largo {
    
    public static int[] rellenarArray() {
		return new int[] { 2, 9, 3, 4, 1 };
	}
	public static int[] ordenarArray(int[] datos) {
		int aux;
		for (int i = 0; i < datos.length - 1; i++) {
			for (int j = 0; j < datos.length - i - 1; j++) {
				if (datos[j + 1] < datos[j]) {
					aux = datos[j + 1];
					datos[j + 1] = datos[j];
					datos[j] = aux;
				}
			}
		}
		return datos;
	}
	public static void pintarArray(int[] datos) {
		for (int i = 0; i < datos.length; i++) {
			System.out.println(datos[i]);
		}
	}
	public static void operar() {
		int[] array = null;
		array = rellenarArray();
		array =  ordenarArray(array);
	     pintarArray(array);
	}
	public static void main(String[] args) {
		operar();
	}
}
