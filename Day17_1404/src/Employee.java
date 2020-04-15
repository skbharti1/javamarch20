
public class Employee {

	private int empId;
	private String eName;
	private String city;
	private int salary;
	
	public Employee() {
		super();
	}

	public Employee(int empId, String eName, String city, int salary) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.city = city;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", eName=" + eName + ", city=" + city + ", salary=" + salary + "]";
	}
	
	
	
}
