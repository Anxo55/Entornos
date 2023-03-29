abstract public class Car {
	String model;
	String brand;
	String registration;
	abstract boolean validateRegistration();
}

class NewCar extends Car{
	@Override
	boolean validateRegistration() {
		return registration.length() == 7;
	}
}

class OldCar extends Car{
	@Override
	boolean validateRegistration() {
		return registration.length() == 8;
	}
}

class SuperNewCar extends Car{
	@Override
	boolean validateRegistration() {
		return registration.length() == 10;
	}
}

