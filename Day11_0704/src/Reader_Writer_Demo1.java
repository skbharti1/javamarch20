import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Reader_Writer_Demo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("c:/demo/abc.txt");
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader reader = new InputStreamReader(fis);
		BufferedReader bfReader = new BufferedReader(reader);
		
		int data;
		
		while( (data = bfReader.read()) !=-1) {
			System.out.print((char)data);
		}
		
		bfReader.close();
		
		
//		File file = new File("c:/demo/xyz.txt");
//		FileOutputStream fos = new FileOutputStream(file);
//		OutputStreamWriter writer = new OutputStreamWriter(fos);
//		
//		writer.write("Welcome to file write...");
//		writer.close();
		
	}

}
