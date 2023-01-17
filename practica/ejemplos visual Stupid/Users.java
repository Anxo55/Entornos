class gestionBD{
    Connection AbirBD(){

    }
    Conecction CerrarBD(){
    }
}

class UsersBD extends GestionBD{

    Users[] listUsers(){
        //
        return null;
    }
    void deleteUser (int id) {
        //
    }
    User addUser(userr newUser) {
        //
    }

}

class UsersBDMongo{
    
     Users[] listUsers(){
        //
        return null;
    }
    void deleteUser (int id) {
        //
    }
    User addUser(userr newUser) {
        //

        // - bajo acoplamieno alta cohesion
        // - que nestras clase no esten enganchadas
        // - que las clases solo hagan una cosa
    }
}

class users{
    String nombre;
    String apellidos;
    int edad;

    Users[] listUsers(){
        // Abrir la BD
        // select * from Users
        // Cerrar BD
        return null;
    }
    void deleteUser (int id) {
        //Abri la BD
        //delete from Users Where id=xxx
        //Cerrar BD
    }
    User addUser(userr newUser) {
        // Abrir la BD
        //insertar into Users .....
        //Cerrar BD
        return null;
    }
}