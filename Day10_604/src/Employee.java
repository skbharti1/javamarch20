
public class Employee {

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("employee object is deleted....");
		
		
	}

	
}
