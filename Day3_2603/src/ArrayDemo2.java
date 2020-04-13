import java.util.Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee[] employees = new Employee[3];
		
		employees[0] = new Employee(101, "Saurabh", 3000.00);
		employees[1] = new Employee(102, "Amrutha", 1000.00);
		employees[2] = new Employee(103, "Adesh", 2500.00);
		
		Arrays.sort(employees);

	}

}
