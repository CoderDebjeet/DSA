package filehandling;
import java.io.*;
public class Readbuffreader {
	public static void main(String[] args)throws IOException {
		int ch;
		BufferedReader bf=new BufferedReader(new FileReader("D:\\\\Java Programming\\\\corejava\\\\src\\\\filehandling\\\\name1.txt"));
		while((ch=bf.read())!=-1)
		{
			System.out.print((char)ch);
		}
		 bf.close();		
	}
}
