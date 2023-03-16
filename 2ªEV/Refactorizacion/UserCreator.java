package Refactorizacion;

//alta cohesion bajo acoplamiento
class User {
   User(String nombre, String pass) {
   }
   String nombre;
   String email;
   String password;
}

class Validator {
	
	static boolean valid(String valor) {
	   return valor != null && valor.length() > 0;
	}
	
	static boolean validateUser(String email, String pass) throws Exception{
		 if (!valid(email)) throw new Exception("Email incorrecto");
	     if (!valid(pass)) throw new Exception("Password incorrecto");
	     return true;
	}
}
public class UserCreator {
   User create(String email, String pass) throws Exception  {
	   Validator.validateUser(email, pass);
       return new User(email, pass);
   }
}

