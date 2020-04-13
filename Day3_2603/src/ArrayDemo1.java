import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] nums = new int[] {20,30,2,4,54,76,3,4,43};
//		
//		System.out.println("Before sort, values");
//		for(int value : nums) {
//			System.out.print(value + "\t");
//		}
//
//		Arrays.sort(nums);
//		
//		System.out.println("\nAfter sort, values");
//		for(int value : nums) {
//			System.out.print(value + "\t");
//		}
		
//		String[] names = {"Syed","Amrutha","Saurabh", "Adesh","Jayalakshmi", "Akanksha", "Rabia"};
//		
//		Arrays.sort(names);
//		
//		System.out.println("Names after sorting...");
//		for(String name : names) {
//			System.out.println(name);
//		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd / MMM / yyyy");
		
		Date[] birthDays = new Date[5]; 
		birthDays[0] = new Date("06/21/1983");
		birthDays[1] = new Date("4/12/1982");
		birthDays[2] = new Date("4/3/1982");
		birthDays[3] = new Date("5/5/1984");
		birthDays[4] = new Date("2/12/1988");
		
		Arrays.sort(birthDays);
		
		for(Date dob : birthDays) {
			System.out.println(sdf.format(dob));
		}
		
		
	}

}
