package filehandling;
import java.io.*;
public class readex2 {
	public static void main(String[] args)throws IOException{ 
		int i;
		FileInputStream fin=new FileInputStream("D:\\\\Java Programming\\\\corejava\\\\src\\\\filehandling\\\\name1.txt");
		do
		{
			 i=fin.read();
			// if(i!=-1)
		//	 {
				 System.out.print((char)(i));
			 //}
		}
		while(i!=-1);
		
	}
}
