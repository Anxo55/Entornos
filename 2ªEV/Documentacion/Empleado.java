package Documentacion;

// public class Empleado {

//     private String nombre;
 
//     private String apellido;
 
//     private int edad;
 
//     private double salario;
 
//     public static float SALARIO_BASE = 1000;
 
//     public boolean addSalario(double salario) {
//         boolean aumento = false;
//         if (edad > 18) {
//             salario += salario;
//             aumento = true;
//         }
//         return aumento;
//     }
 
//     public void setNombre(String nombre) throws IllegalArgumentException {
//         if (nombre == null || nombre.trim().equals("")) {
//             throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
//         } else {
//             this.nombre = nombre;
//         }
//     }
 
//     public void setSalarioBase() {
//         salario = SALARIO_BASE;
//     }
 
//     private boolean validarNombre() {
//         if (nombre.equals("")) {
//             return false;
//         }
//         return true;
//     }
 
//     public Empleado() {
//         this("Sin nombre", "", 0, 0);
//     }
 
//     public Empleado(String nombre, String apellido, int edad, double salario) {
//         this.nombre = nombre;
//         this.apellido = apellido;
//         this.edad = edad;
//         this.salario = salario;
//     }
//  }

//SOLUCION

/*
* Copyright ...
*/


/**
* Contiene la informaci'n de cada empleado
*
* @author Angel
* @version 7.0
*
*/
public class Empleado {
   /**
    * Nombre del empleado
    */
   private String nombre;
   /**
    * Apellido del empleado
    */
   private String apellido;
   /**
    * Edad del empleado
    */
   // @TOFIX usar la fecha de nacimiento en lugar de la edad
   private int edad;
   /**
    * Sueldo del empleado
    *
    */
   // @TOFIX Cambiar salario por salarioMensual
   private double salario;
   /**
    * Constante que determina el sueldo base de todos los trabajadores
    */
   public static float SALARIO_BASE = 1000;

   /**
    * Incrementa el salario mensual de un empleado solo si es mayor de edad
    *
    * @param salario
    *            La cantidad de salario que se va a incremental
    * @return Devuelvo un boolean indicando si se aumento el salario o no
    */
   public boolean addSalario(double salario) {
       boolean aumento = false;
       if (edad > 18) {
           salario += salario;
           aumento = true;
       }
       return aumento;
   }

   /**
    * Establece el nombre del empleado
    *
    * @param nombre
    *            El nombre a asignar
    * @throws IllegalArgumentException
    *             Se lanzar' una excepci'n cuando el nombre sea nulo o vacio
    */
   public void setNombre(String nombre) throws IllegalArgumentException {
       // @TOFIX usar el metodo validarNombre() para evitar repetir codigo
       if (nombre == null || nombre.trim().equals("")) {
           throw new IllegalArgumentException("El nombre no puede ser nulo o vac'o");
       } else {
           this.nombre = nombre;
       }
   }

   /**
    * Establece el salario de base a este empleado.
    */
   public void setSalarioBase() {
       salario = SALARIO_BASE;
   }

   /**
    * Metodo que sirve para comprobar si el nombre del empleado es v'lido
    *
    * @return un booleano con el resultado de la validaci'n
    */
   private boolean validarNombre() {
       // @TOFIX a'adir la condici'n nombre == null
       if (nombre.equals("")) {
           return false;
       }
       return true;
   }

   /**
    * Constructor por defecto. Instancia un empleado asignandole como nombre "Sin
    * nombre" Edad y salario a 0
    */
   public Empleado() {
       this("Sin nombre", "", 0, 0);
   }

   /**
    * Constructor con par'metros
    *
    * @param nombre
    *            El nombre del empleado
    * @param apellido
    *            El apellido del empleado
    * @param edad
    *            La edad del empleado
    * @param salario
    *            El salario mensual de empleado
    */
   public Empleado(String nombre, String apellido, int edad, double salario) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.edad = edad;
       this.salario = salario;
   }
}




 
 