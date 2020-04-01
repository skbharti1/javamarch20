import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SetDemo1 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
//		List<Integer> numbers = new ArrayList<>();
//		numbers.add(10);
//		numbers.addAll(Arrays.asList(10,22,43,2,32,54,33));
//		
//		System.out.println("numbers = " + numbers);
//		
//		Collections.sort(numbers);
//		
//		System.out.println("numbers = " + numbers);

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(101, "Vishal", "Shah", sdf.parse("30-07-2018"), 8000));
		employees.add(new Employee(102, "Sateesh", "Kota", sdf.parse("01-02-2019"), 7000));
		employees.add(new Employee(103, "Siddhant", "Raje", sdf.parse("03-04-2017"), 3000));
		
		System.out.println(employees);
		
		Collections.sort(employees);
		
		System.out.println("after sort," + employees);

	}

}
