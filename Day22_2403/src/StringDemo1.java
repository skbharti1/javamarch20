import java.util.Scanner;

public class StringDemo1 {

	public static void main(String[] args) {
		//perform input operations from Keyword using Scanner class
		//"in" is an object of type InputStream, which is associated with 
		//the physical keyboard via underlying OS
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter some text :" );
		
		String str = scan.nextLine();
		
		System.out.println("enter some number : ");
		int i = scan.nextInt();
		

		System.out.println("Entered Text  : " + str);
		System.out.println("Entered Number :" + i);
	
	}
}
