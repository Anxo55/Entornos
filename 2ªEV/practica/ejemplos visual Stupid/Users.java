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
    Date fechaNacim;

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

    // Ejemplo 

    public float calcularMedia(int[] numeros) {
		float media = 0;
		for(int n: numeros) {
			media += n;
		}
		return media;
        //System.out.println(media);
}
    public void main(String[] args) {
        float resultado = calcularMedia(new int[]{1,2,5});
}



//Ejemplo incorecto
class Vehiculo{
	String getMarca() { }
	String getMatricula() { }
    Date[] getFechasMultas(){ }
    float[] getImportesMulta(){ }
}

//CORRECTO
Class Vehiculo{
	String getMarca() { }
	String getMatricula() {  }

	Multa[] multas;

}

class Multa{
	Date getFecha() { };
	float getImporte(){  };
	float getTipo(){  };
}




//Ejemplo INCORRECTO
public class Sql {
	public Sql (String table, Column[] columns) {}
	public String insert (Object[] fields) {}
	public String findByKey (String keyColumn, String keyValue) {}
	public String select (Criteria criteria) {}
    {
}

//CORRECTO
abstract class Sql {
	public Sql (String table, Column[] columns) {}
	public abstract String generate();
}

public class InsertSql extends Sql {
	public InsertSql (String table, Column[] columns, Object[] fields) {}
	public String generate () {} 	
}
 
public class FindByKeySql extends Sql {
	public FindByKeySql (String table, Column[] columns, String keyColumn, String keyValue) {}
	public String generate () {} 	
}



//Ejemplo INCORECTO
abstract class Ave{
	abstract void volar();
}
	
class Aguila extends Ave{
@Override
	void volar() {
			
	}
}
class Pinguino extends Ave{
	@Override
void volar() {
		System.out.println("No puedo volar");
	}
}

//CORRECTO
abstract class Ave{

}

abstract class Mamifero{ 

}

interface Voladora{
	public void volar();
}

class Aguila extends Ave implements Voladora{
	@Override
	public void volar() {
		
	}
}

class AguilaCalva extends Aguila{

}

class Pinguino extends Ave{
	
}

class Murcielago extends Mamifero implements Voladora{
    @Override
    public void volar(){
        //..
    }

}

//INCORRECTO

interface Ave{
	void comer();
	void nadar();
	void volar();
	void correr();
}

class Avestruz implements Ave{
	@Override public void comer() {}
	@Override public void nadar() {}
	@Override public void volar() {}
	@Override public void correr() {}
}

class Loro implements Ave{
	@Override public void comer() {}
	@Override public void nadar() {}
	@Override public void volar() {}
	@Override public void correr() {}
}
class Pinguino implements Ave{
	@Override public void comer() {}
	@Override public void nadar() {}
	@Override public void volar() {}
	@Override public void correr() {}
}

//CORRECTO

abstract class Ave{
	abstract void comer();
}
interface iCorredor{
	void correr();
}

interface iNadador{
	void nadar();
}
interface iVolador{
	void volar();
}

class Avestruz extends Ave implements iCorredor{
	@Override public void comer() {}
	@Override public void correr() {}
}

class Gaviota extends Ave implements iVolador, iNadador{
	@Override public void comer() {}
	@Override public void nadar() {}
	@Override public void volar() {}
}
class Pinguino extends Ave implements iNadador{
	@Override public void comer() {}
	@Override public void nadar() {}
}






}





