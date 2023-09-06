package filehandling;
import java.io.*;
public class fh {
	public static void main(String[] args) throws IOException {
		File f1=new File("D:\\Java Programming\\corejava\\src\\filehandling\\name1.txt");
		f1.createNewFile();
		System.out.println("Can file read: "+f1.canWrite());
		System.out.println("Is it exists: "+f1.exists());
		System.out.println("File Size: "+f1.length());
	}
}
