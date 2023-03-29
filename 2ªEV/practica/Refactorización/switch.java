interface Dibujable{
    public void dibujar();
}

abstract class Figura{
	abstract float getArea();
    abstract void dibujar();
}
class Teseracto extends Figura{
    float getArea() {
        return 55;
    }
    void dibujar() {

    }
}
class Triangulo extends Figura implements Dibujable{
	int base;
	int altura;
	
	public Triangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	float getArea() {
		return base * altura / 2.0f;
	}
    public void dibujar(){

    }
}

class Cuadrado extends Figura implements Dibujable{
	int lado;
	
	public Cuadrado(int lado) {
		super();
		this.lado = lado;
	}

	float getArea() {
		return lado * lado;
	}
}

class Rectangulo extends Cuadrado implements Dibujable{

	int lado2;
	
	public Rectangulo(int lado1, int lado2) {
		super(lado1);
		//this.lado1 = lado1;
		this.lado2 = lado2;
	}

	float getArea() {
		return super.lado * lado2;
	}

    public void dibujar() {

    }
}

public class Principal {
	
	public static void main(String[] args) {
		float resultado;
		Figura f = new Triangulo(4,5);
		resultado = f.getArea();
		System.out.println(resultado);
		
		f = new Rectangulo(4,5);
		resultado = f.getArea();
		System.out.println(resultado);

	}
}

