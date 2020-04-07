import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExpcetionDemo2 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		Thread.sleep(2000);
		
		
		//Scanner scan = new Scanner(System.in);
		DataInputStream dis = new DataInputStream(System.in);
		
		try {
			System.out.print("Enter Age :");
			int age = Integer.parseInt(dis.readLine());
			
			if(age<=0 || age>=100) {
				throw new InvalidAgeException("age is not valid");
			}
			
			System.out.println("age = " +age );
		}catch (InvalidAgeException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}catch (IOException e) {
			// TODO: handle exception
		}
	}

}
