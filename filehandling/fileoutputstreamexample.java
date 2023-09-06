package filehandling;
import java.io.*;
public class fileoutputstreamexample {
	public static void main(String[] args)throws IOException {
		FileOutputStream fout=new  FileOutputStream("D:\\Java Programming\\corejava\\src\\filehandling\\name1.txt",true);
		String s="TATA";
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			fout.write(ch[i]);
		}
		fout.close();
	}
}
 