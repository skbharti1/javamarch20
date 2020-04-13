
public class Main {

	
	static void method() {
		System.out.println("method starts...");
		Employee emp1 = new Employee();
		System.out.println("method ends...");
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp = null;
		
		method();
		
		System.gc();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main program ended....");
	}
}
