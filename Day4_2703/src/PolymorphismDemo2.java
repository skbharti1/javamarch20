import java.util.Scanner;

class Shape{
	
	static void show() {
		System.out.println("this is Shape class show() method");
	}
	
	public void calcArea() {
		System.out.println("Calculating Area....");
	}
}

class Square extends Shape {
	
	//method hiding
	static void show() {
		System.out.println("this is Square class show() method");
	}
	
	//override calcArea()
	public void calcArea() {
		System.out.println("Calculating area of square....");
	}
}

class Circle extends Shape{
	
	//override calcArea()
	public void calcArea() {
		System.out.println("Calculating area of circle....");
	}
}


public class PolymorphismDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		Scanner scan = new Scanner(System.in);
		System.out.print("\n\t Enter a choice!... \n\t 1. Square \n\t 2. Circle");
		int choice = scan.nextInt();
		
		Shape shape = null;
		
		switch (choice) {
			case 1:
				shape = new Square();
				shape.show();
				break;
				
			case 2:
				shape = new Circle();
				shape.show();
				break;

			default:
				break;
		}
		
		if(shape!=null) {
			shape.calcArea();
		}
		
	}

}
