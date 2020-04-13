import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		File file = new File("c:/demo/bbb.txt");
		FileOutputStream fos =new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Employee.cName = "Capgemini";
		
		Employee emp = new Employee(102, "Atul", 4000.00);
		 
		
		oos.writeObject(emp);
		oos.close();
		
		
		Employee.cName = "Capgemini India";
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee e = (Employee)ois.readObject();
		System.out.println(e);
		
	}

}
