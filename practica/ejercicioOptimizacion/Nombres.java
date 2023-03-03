/* Copyright Angel Gonzalez todos los derechos reservados */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


/**
 * Clase de utilidad para trabajar con nombres de personas
 *
 * @author Angel
 * @version 0.2
 */
public class Nombres {
    /**
     * Array que contiene la lista de nombres
     */
    // String[] lista = { "Angel", "Pepe", "Bea" };
    ArrayList<String> lista = new ArrayList<String>(Arrays.asList("Angel", "Pepe", "Bea"));


    /**
     * Añade un nuevo elemento al array de nombres
     *
     * @param nuevoNombre el nuevo elemento a insertar
     */
    void insert(String nuevoNombre) {
        /*
         * String[] temp = Arrays.copyOf(lista, lista.length + 1);
         * temp[lista.length] = nuevoNombre;
         * lista = temp;
         */
        lista.add(nuevoNombre);
    }


    /**
     * añade varios elementos al array de nombres
     *
     * @param nombres la lista de elementos a añadir
     */
    void insertMultiple(String... nombres) {
        for (String nombre : nombres) {
            if (nombre != null)
                insert(nombre);
        }
    }


    /**
     * Elimina el ultimo elemento del array
     *
     * @throws Exception En caso de que no tenga elementos lanzamos una excepcion
     */
    void removeLastElement() throws Exception {
        if (lista.size() <= 0) {
            throw new Exception("No hay elementos para borrar");
        }


        /*
         * String[] temp = Arrays.copyOf(lista, lista.length - 1);
         * lista = temp;
         */
        lista.remove(lista.size() - 1);
    }


    /**
     * Borra todos los elementos del array
     */
    void clear() {
        // lista = new String[] {};
        lista.clear();
    }


    /**
     * Ordena alfabeticamente los elementos del array
     */
    void sortNames() {
        // Arrays.sort(lista);
        // Comparator<String> comparador = Collections.reverseOrder();
        Collections.sort(lista);
    }


    /**
     * Devuelve un texto con todos los elementos del array
     *
     * @return El texto
     */
    String getListNames() {
        String result = "---- Lista de nombres -----\n";
        for (String nombre : lista) {
            result += nombre + "\n";
        }
        return result;
    }


    /**
     * Muestra por consola todos los elementos del array
     */
    void printAllNames() {
        System.out.println(getListNames());
    }
    /*
     * void sendNamesByEmail(){
     * sendMail(getListNames());
     * }
     */


    /**
     * Lee un entero
     *
     * @param in  El scanner
     * @param msg El mensaje a mostrar al usuario
     * @return el entero leido
     */
    private int readIntByConsole(Scanner in, String msg) {
        System.out.println(msg);
        int valor = in.nextInt();
        return valor;
    }


    /**
     * Lee un texto
     *
     * @param in  El scanner
     * @param msg El mensaje a mostrar al usuario
     * @return el texto leido
     */
    private String readStringByConsole(Scanner in, String msg) {
        System.out.println(msg);
        String texto = in.next();
        return texto;
    }


    /**
     * Lee cuantos nombres se desean insertar, los solicita por entrada estandar y
     * los
     * guarda en el array
     */
    void rellenarNombres() {
        Scanner in = new Scanner(System.in);
        int cantidad = readIntByConsole(in, "Introduce cantidad de nombres a leer: ");
        for (int i = 0; i < cantidad; i++) {
            String nombre = readStringByConsole(in, "Introduce el nombre: ");
            insert(nombre);
        }
        in.close();
    }


    public static void main(String[] args) {
        Nombres n = new Nombres();
        n.rellenarNombres();
        n.printAllNames();
        n.insert("Miguel");
        n.printAllNames();
        try {
            n.removeLastElement();
        } catch (Exception e) {
            e.printStackTrace();
        }
        n.printAllNames();
        n.clear();
        n.printAllNames();
        try {
            n.removeLastElement();
        } catch (Exception e) {
            e.printStackTrace();
        }
        n.printAllNames();
        n.insert("Paula");
        n.insert("Carmen");
        n.insert("Ana");
        n.sortNames();
        n.printAllNames();


    }
}

