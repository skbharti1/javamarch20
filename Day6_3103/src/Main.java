
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(101, "Vishal", "Shah", 3000.00);
		//Employee e2 = new Employee(102, "Sateesh", "Kota", 3000.00);
		
		Employee e2 = e1;
		
				
		System.out.println("e1's hashcode = " + e1.hashCode());
		System.out.println("e2's hashcode = " + e2.hashCode());


	}

}
