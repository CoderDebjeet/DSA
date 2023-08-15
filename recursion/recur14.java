package corejava;
import java.util.*;
public class recur14 {
	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String :- ");
		s=sc.next();
		printss(s,"");
		
	}
	public static void printss(String ques,String ans)
	{
		char str;String sub;
		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
		}
		str=ques.charAt(0);
		sub=ques.substring(1);
		printss(sub,ans+"");
		printss(sub,ans+str);
		
	}
}
