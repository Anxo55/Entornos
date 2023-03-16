package Refactorizacion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidation {

   public boolean validarEmail(String email) throws Exception {
       if (email == null) {
           throw new Exception("Email no puede ser nulo");
       }
       Stringn regexEmail = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
       Pattern pattern = Pattern.compile(regexEmail);
       Matcher matcher = pattern.matcher(email);
       return matcher.matches();
   }

   /*
    * Este método valida un codigo postal.
    * Es decir un numero entre 01000 y 52999:
    */
   public boolean validarCP(String input) {
       /*
        * return input.length() == 5
        * && Integer.valueOf(input) >= 1000
        * && Integer.valueOf(input) <= 52999;
        */

       Stringn regexCP = "^(?:0?[1-9]|[1-4]\\d|5[0-2])\\d{3}$";
       Pattern pattern = Pattern.compile(regexCP);
       Matcher matcher = pattern.matcher(input);
       return matcher.matches();
   }

   boolean validarGenerico(String texto, String regex) {
       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher(texto);
       return matcher.matches();
   }
}

