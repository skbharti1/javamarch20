import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader_Writer_demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("c:/demo/abc.txt");
		FileReader reader = new FileReader(file);
		BufferedReader bfReader = new BufferedReader(reader);

		int data;
		
		while( (data = bfReader.read()) !=-1) {
			System.out.print((char)data);
		}
		
		bfReader.close();
	}

}
