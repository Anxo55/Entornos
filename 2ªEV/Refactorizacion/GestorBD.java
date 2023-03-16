package Refactorizacion;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;

public class Estudiante {
   String nombre;
   String telefono;
   Date fechaNac;
  
   GestorBD gestorBD = new GestorBD();
  
   public ArrayList getListaEstudiantes() {
       Connection c = gestorBD.getConnection();
       // obtenemos la lista de alumnos de la base de datos (* imag'natelo)
       // ... select * from estudiantes
       gestorBD.cerrarConnection();
       return null;
   }
  
  
   public void borrarEstudiantes() {
       Connection c = gestorBD.getConnection();
       // borramos los alumnos de la base de datos (* imag'natelo)
       // ... delete from estudiantes
      
       gestorBD.cerrarConnection();
   }
}



import java.sql.Connection;
import java.util.ArrayList;

public class Profesor {
   String nombre;
   String telefono;
   float nonima;
  
   GestorBD gestorBD = new GestorBD();
  
  
   public ArrayList getListaProfesores() {
       Connection c = gestorBD.getConnection();
       // obtenemos la lista de profesores de la base de datos (* imag'natelo)
       // ... select * from profesores
       gestorBD.cerrarConnection();
       return null;
   }
}



import java.sql.Connection;

public class GestorBD {
  
   // Quizas estos 2 metodos getConnection y cerrarConection
   // Deber'an ser static
   public Connection getConnection() {
       // Abrimos la conexi'n con la base de datos Ej MySQL (* imag'natelo)
       return null;
   }

   public void cerrarConnection() {
       // Cerramos la conexi'n con la base de datos (* imag'natelo)
   }
}


