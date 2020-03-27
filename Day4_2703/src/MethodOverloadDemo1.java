
public class MethodOverloadDemo1 {

	static void arithAdd(double a, double b) {
		System.out.println("method 1");
		//....
	}
	
	static float arithAdd(float a, float b) {
		System.out.println("method 2");
		return 0;
	}
	
	static void show(Person p) {
		System.out.println("method 1");
	}
	
	static void show(Employee e) {
		System.out.println("method 2");
	}
	
	
	static void print(String s) {
		System.out.println("method 1");
	}
	
	static void print(StringBuilder s) {
		System.out.println("method 2");
	}
	
	public static void main(String[] args) {
		 
//		Person obj = new Employee();	// super class ref variable can reference to child object
//		show(null);
		
		print("a string"); //method1
		print(new StringBuilder("slfj")); //method 2
		//print(null);
		
	}
}
