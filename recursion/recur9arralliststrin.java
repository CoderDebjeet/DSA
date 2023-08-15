package corejava;
import java.io.*;
import java.util.*;
public class recur9arralliststrin {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:- ");
		String str=sc.next();
		ArrayList <String> res=gss(str);
		System.out.println(res);
		
	}
	//bc->[--,-c ,b-, bc]
	//abc->[ ---,--c, -b-, -bc, a--,ab-,abc]
	public static ArrayList <String> gss(String str)
	{
		if(str.length()==0)
		{
			ArrayList <String> base=new ArrayList<>();
			base.add("");
			return base;
		}
		char ch=str.charAt(0);
		String faith=str.substring(1);
		ArrayList <String> rres=gss(faith);
		ArrayList <String> mres=new ArrayList<>();
		for(String val:rres)
		{
			mres.add(""+val);
		}
		for(String val:rres)
		{
			mres.add(ch+val);
		}
		return mres;
	}
	
	
	
	
	
	
}

