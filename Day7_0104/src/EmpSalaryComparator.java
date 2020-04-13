import java.util.Comparator;

public class EmpSalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		 Long emp1Salary = o1.getSalary();
		 Long emp2Salary = o2.getSalary();
		 return emp1Salary.compareTo(emp2Salary);
	}

}
