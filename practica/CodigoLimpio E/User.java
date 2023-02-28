
public class UserCreator {
	public String name;
	private final static float LIBRARY_COST = 10;
	public UserCreator(String name) {
		this.name=name;
	}
	public float costOfLibrary() {
		return LIBRARY_COST;
	}
}

class Teacher extends UserCreator{
	private final static float LIBRARY_COST = 2;
	public Teacher(String name) {
		super(name);
	}
	public float costOfLibrary() {
		return LIBRARY_COST;
	}
}

class HeadMaster extends UserCreator{
	private final static float LIBRARY_COST = 0;
	public HeadMaster(String name) {
		super(name);
	}
	public float costOfLibrary() {
		return LIBRARY_COST;
	}
}



 
