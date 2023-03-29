interface Movable{
	public void move();
}

class BipedRobot extends Robot implements Movable{
	int[] legs;
	public BipedRobot(String name) {
		super(name);
		numLegs = 2;
		legs = new int[numLegs];
	}
	public void move() {
		legs[0]+=1;		legs[1]+=1;
	}
}
class CuadrupedRobot extends Robot implements Movable{
	int[] legs;
	int leg1;int leg2;int leg3;int leg4;
	public CuadrupedRobot(String name) {
		super(name);
		numLegs=4;
		legs = new int[numLegs];
	}
	public void move() {
		legs[0]+=1;	legs[1]+=1;	legs[2]+=1;	legs[3]+=1;
	}
}
class HexapodRobot extends Robot implements Movable{
	int[] legs;
	//int leg1;int leg2;int leg3;int leg4;int leg5;int leg6;
	public HexapodRobot(String name) {
		super(name);
		numLegs=6;
		legs = new int[numLegs];
	}
	public void move() {
		legs[0]+=1;	legs[1]+=1;	legs[2]+=1;	legs[3]+=1;	legs[4]+=1;	legs[5]+=1;
	}
}
class TurretRobot extends Robot{
	public TurretRobot(String name) {
		super(name);
	}
}


abstract public class Robot {
	public String name = "";
	protected int numLegs;
	public Robot(String name) {
		this.name=name;
	}
	
	static void destroyRobot(Robot r) {
		System.out.println("El robot se destruido:"+r.name+" "+r.numLegs);
	}
	static void jumpRobot(Movable r) {
		r.move();
	}
	public static void main(String[] args) {
		BipedRobot terminator = new BipedRobot("t800");
		CuadrupedRobot bostom = new CuadrupedRobot("atlas");
		TurretRobot aniquilator = new TurretRobot("ani");
		destroyRobot(bostom);
		jumpRobot(terminator);
		//jumpRobot(aniquilator);
	}
}