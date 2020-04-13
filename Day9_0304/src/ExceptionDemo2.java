import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
		 
		 try {
			 System.out.print("Enter value for a: ");
			 int a = scan.nextInt();
			 
			 System.out.print("Enter value for b: ");
			 int b = scan.nextInt();
			 
			 int result = a/b;
			 System.out.println("result = " + result);
			 
		 }catch(InputMismatchException ex) {
			 System.out.println("Invalid input");
			 ex.printStackTrace();
		 }catch (ArithmeticException ex) {
			 System.out.println("cannot divide a number by 0");
			 ex.printStackTrace();
		}catch (Exception e) {
			 
		}
		 
		 System.out.println("End of Program");
	}

}
