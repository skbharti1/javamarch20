import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("c:/demo/image1.png");
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream(new File("c:/demo/image2.png"));
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int data;
		
		long beginTime = System.nanoTime();
		System.out.println("Starting copying the file... ");
		System.out.println("size of the file = "+ file.length()/1024 + " KB");
		
		while( (data = bis.read()) !=-1) {
			bos.write(data);
		}
		
		long endTime = System.nanoTime();
		long elapsedtime = (endTime-beginTime)/1000000;
		System.out.println("it took " + elapsedtime + " seconds");
		
		bis.close();
		bos.close();
		
 
	}

}
