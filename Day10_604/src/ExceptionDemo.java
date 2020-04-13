import java.io.BufferedReader;
import java.io.FileReader;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		try {
//			System.out.println("this is try block");
//			
//			Object obj = new Object();
//			Employee e = (Employee)obj;
//			Thread t = new Thread();
//			t.start();
//			t.start();
//			
//		}catch (IllegalThreadStateException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
 		try(BufferedReader reader  = new BufferedReader(new FileReader("demo.txt"))) {
			
			//perform some operations on the file demo.txt 
			//if any exception...
			
		}catch (Exception ex) {
			ex.printStackTrace();
 		} 
		
		
		
		
	}

}
