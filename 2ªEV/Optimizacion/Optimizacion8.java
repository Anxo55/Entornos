package Optimizacion;

// import java.io.Reader;
// import java.util.Arrays;
// import java.util.Scanner;


// public class Optimizacion8 {
//     String[] lista = { "Angel", "Pepe", "Bea" };


//     void Insert(String nuevoNombre) {
//         String[] temp = Arrays.copyOf(lista, lista.length + 1);
//         temp[lista.length] = nuevoNombre;
//         lista = temp;
//     }


//     void InsertMultiple(String nombre1, String nombre2, String nombre3, String nombre4, String nombre5,
//             String nombre6) {
//         if (nombre1 != null)
//             Insert(nombre1);
//         if (nombre2 != null)
//             Insert(nombre2);
//         if (nombre3 != null)
//             Insert(nombre3);
//         if (nombre4 != null)
//             Insert(nombre4);
//         if (nombre5 != null)
//             Insert(nombre5);
//         if (nombre6 != null)
//             Insert(nombre6);
//     }


//     void removeLastElement() {
//         if (lista.length > 0) {
//             String[] temp = Arrays.copyOf(lista, lista.length - 1);
//             lista = temp;
//         } else {
//             System.out.println("No hay elementos para borrar");
//         }
//     }


//     void clear() {
//         lista = new String[] {};
//     }


//     void sortNames() {
//         String m = "";
//         for (int i = 0; i < lista.length; i++) {
//             m += lista[i];
//         }
//         Arrays.sort(lista);
//     }


//     void printAllNames() {
//         System.out.println("---- Lista de nombres -----");
//         for (String nombre : lista) {
//             System.out.println(nombre);
//         }
//     }


//     void rellenarNombres() {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Introduce la cantidad de nombres a leer: ");
//         int cantidad = in.nextInt();
//         for (int i = 0; i < cantidad; i++) {
//             System.out.println("Introduce el nombre: ");
//             String nombre = in.next();
//             Insert(nombre);
//         }
//         in.close();
//     }


//     public static void main(String[] args) {
//         Optimizacion8 n = new Optimizacion8();
//         n.rellenarNombres();
//         n.printAllNames();
//         n.Insert("Miguel");
//         n.printAllNames();
//         n.removeLastElement();
//         n.printAllNames();
//         n.clear();
//         n.printAllNames();
//         n.removeLastElement();
//         n.printAllNames();
//         n.Insert("Paula");
//         n.Insert("Carmen");
//         n.Insert("Ana");
//         n.sortNames();
//         n.printAllNames();


//     }
// }

import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Optimizacion8 {
	ArrayList<String> lista = new ArrayList<String>(Arrays.asList("Angel", "Pepe", "Bea"));


	void Insert(String nuevoNombre) {
		lista.add(nuevoNombre);
	}


	void InsertMultiple(String... nombres) {
		for (String nombre : nombres) {
			Insert(nombre);
		}
	}


	void removeLastElement() throws Exception {
		if (lista.isEmpty())
			throw new Exception("No hay elementos para borrar");
		lista.remove(lista.size() - 1);
	}


	void clear() {
		lista.clear();
	}


	void sortNames() {
		Collections.sort(lista);
	}


	String getAllNames() {
		String resultado = "";
		for (String nombre : lista) {
			resultado += nombre + "\n";
		}
		return resultado;
	}


	void printAllNames() {
		System.out.println("---- Lista de nombres -----");
		System.out.println(getAllNames());
	}


	void rellenarNombres() {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce la cantidad de nombres a leer: ");
		int cantidad = in.nextInt();
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Introduce el nombre: ");
			String nombre = in.next();
			Insert(nombre);
		}
		in.close();
	}


	public static void main(String[] args) {
		try {
			Optimizacion8 n = new Optimizacion8();
			n.rellenarNombres();
			n.printAllNames();
			n.Insert("Miguel");
			n.printAllNames();
			n.removeLastElement();
			n.printAllNames();
			n.clear();
			n.printAllNames();
			n.removeLastElement();
			n.printAllNames();
			n.Insert("Paula");
			n.Insert("Carmen");
			n.Insert("Ana");
			n.sortNames();
			n.printAllNames();
		} catch (Exception ex) {
			System.out.println("Fallo:"+ex.getMessage());
		}


	}
}


