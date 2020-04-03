import java.io.IOException;

public class ExceptionDemo1 {
	
	
	static void divideANumber(int a, int b) {
		int result = a/b;	//Exception is created "ArithmaticException"
		System.out.println(result);
	}
	
	static void calculate() {
	
			divideANumber(10, 0);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting the execution of main() method...");
		
		
			calculate();
		
		System.out.println("End of program");
	}

}
