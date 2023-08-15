package corejava;
import java.util.*;
public class recur19printpermutations {
	public static void main(String[] args) {
		String a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:-");
		a=sc.next();
		System.out.println("The permutations for the String are:- ");
		printpermutation(a,"");
	}
	public static void printpermutation(String ques,String answersofar)
	{
		if(ques.length()==0)
		{
			System.out.println(answersofar);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch=ques.charAt(i);
			String leftpart=ques.substring(0,i);
			String rightpart=ques.substring(i+1);
			String restofquestion=leftpart+rightpart;
			printpermutation(restofquestion, answersofar+ch);
		}
	}
}
