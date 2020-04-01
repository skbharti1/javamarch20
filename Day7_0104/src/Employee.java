import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee implements Comparable {

	private int empId;
	private String firstName;
	private String lastName;
	private Date joinDate; 
	private long salary;
	
	
	public Employee() {
		super();
	}

	public Employee(int empId, String firstName, String lastName, Date joinDate, long salary) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.joinDate = joinDate;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		return "\nEmployee [" + empId + ", " + firstName + ", " + lastName + ", "
				+ sdf.format(joinDate) + ", " + salary + "]";
	}

	@Override
	public int compareTo(Object o) {
		Employee other = (Employee)o;
		if(this.salary >= other.salary)
			return 1;
		else if(this.salary == other.salary)
			return 0;
		else 
			return -1;
	} 
	
	
}
