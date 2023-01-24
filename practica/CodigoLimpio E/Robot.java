
public class Robot {
	String name = "";
	String type = "biped";
	int numLegs = 2;
	int leg1;
	int leg2;
	int leg3;
	int leg4;
	int leg5;
	int leg6;
	
	public Robot(String name, String type, int numLegs) {
		this.name=name;
		this.type=type;
		this.numLegs = numLegs;
	}
	public void move() {
		if(type.equals("biped")) {
			// mover las 2 piernas
			leg1+=1;
			leg2+=1;
		}else if(type.equals("cuadruped")) {
			// mover las 4 piernas
			leg1+=1;
			leg2+=1;
			leg3+=1;
			leg4+=1;
		}else if(type.equals("hexapod")) {
			// mover las 6 piernas
			leg1+=1;
			leg2+=1;
			leg3+=1;
			leg4+=1;
			leg5+=1;
			leg6+=1;
		}
	}
}

