import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListDemo1 {
	
	public static void main(String[] args) {
		
//		List<Integer> numsList = new LinkedList<>();
//		
//		numsList.add(20);
//		numsList.add(10);
//		numsList.add(2999);
//		numsList.add(20);
//		numsList.add(30);
//		numsList.add(2999);
//		
//		//numsList.remove(2);
//		numsList.remove(new Integer(2999));
//		
//		System.out.println("numsList = " + numsList);
		
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(101, "vishal","shah", 2000.00));
		empList.add(new Employee(102, "sateesh","kota", 3000.00));
		empList.add(new Employee(103, "Siddhant","Raje", 4000.00));

		//empList.remove(1);
		
		
//		Employee e = new Employee(102, "sateesh","kota", 3000.00);
//		System.out.println(empList.remove(e));
		
		
//		for(Employee emp: empList) {
//			System.out.println(emp.getEmpId() + "  " + emp.getFirstName() + "  " + emp.getLastName() + "  " + emp.getSalary());
//		}
		
		Iterator<Employee> listIterator = empList.iterator();
		
		while(listIterator.hasNext()) {
			Employee emp = listIterator.next();
			System.out.println(emp.getEmpId() + "  " + emp.getFirstName() + "  " + emp.getLastName() + "  " + emp.getSalary());
		}
		
	}

}
