import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		FileOutputStream fos = new FileOutputStream(new File("c:/demo/aaa.txt"));
//		DataOutputStream dos = new DataOutputStream(fos);
//		
//		dos.writeInt(10);
//		dos.writeDouble(54.23);
//		dos.writeUTF("Welcome");
//		dos.writeBoolean(true);
//		dos.writeChar('C');
//		
//		dos.close();
		
		FileInputStream fis = new FileInputStream(new File("c:/demo/aaa.txt"));
		DataInputStream dis = new DataInputStream(fis);
		
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		System.out.println(dis.readUTF());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		
	}

}
