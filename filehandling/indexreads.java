package filehandling;
import java.io.*;
public class indexreads {
	public static void main(String[] args)throws IOException {
		BufferedReader bf= new BufferedReader(new FileReader("D:\\Java Programming\\corejava\\src\\filehandling\\name1.txt"));
		char[]s=new char[20];
		bf.read(s,0,15);
		System.out.println(s);
		bf.close();
	}
}
