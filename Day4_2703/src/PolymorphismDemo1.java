
abstract class Car{
	//brandname
	//model
	//....
	//....
	
	public abstract void move();
}

class TataCar extends Car{

	//override / redefine the superclass method
	public void move() {
		System.out.println("This car moves normally...");
	}
}

class BMWCar extends Car{
	
	public void move() {
		System.out.println("This car moves fast...");
	}
}


abstract class HondaCar extends Car{
	
}


public class PolymorphismDemo1 {

	public static void main(String[] args) {
		
		Car car1 = new TataCar();
		car1.move();
		
		Car car2 = new BMWCar();
		car2.move();
	}
}
