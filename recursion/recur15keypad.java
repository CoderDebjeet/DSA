package corejava;
import java.util.*;
public class recur15keypad {
	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:-");
		str=sc.next();
		System.out.println("The Keypad combination is");
		printkeys(str,"");
	}
	public static String[] codes={".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx","yz"};
	public static void printkeys(String ques,String ans)
	{
		if(ques.length()==0)
		{
			System.out.print(ans+", ");
			return;
		}
		char subfirstchar=ques.charAt(0);  //6
		String seq=ques.substring(1); //78
		String codeforch=codes[subfirstchar-'0'];
		for(int i=0;i<codeforch.length();i++)
		{
			char cho=codeforch.charAt(i);
			printkeys(seq,cho+ans);
			/*The function printkeys is recursively
			called on seq i.e. 78 as the "ques" and "ans" as the sum 
			of previous answer and character corresponding to cho
(i.e. character at each index of the string corresponding to codeforch)*/
		}
	}
}
/*Time Complexity :
O(2^n)

This time complexity is exponential.

SPACE COMPLEXITY :
O(1)
As no extra space is required,therefore space complexity is constant. 
However, if we include the space used in the recursive stack then the 
space complexity is O(n).*/