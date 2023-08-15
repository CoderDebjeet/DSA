package corejava;
import java.util.*;
public class recur10getkeypadcompinations {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Digits : - ");
		String str=sc.next();
		ArrayList <String> words=getkpc(str);
		System.out.println("There Keypad Combination is:- ");
		System.out.println(words);
	}
	static String[] codes= {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx","yz"};
	public static ArrayList <String> getkpc(String str)
	{
		if(str.length()== 0)
		{
			ArrayList <String>  base=new ArrayList<>();
			base.add("");
			return base;
		}
		char ch=str.charAt(0);
		String faith=str.substring(1);
		ArrayList<String> rres=getkpc(faith);
		ArrayList<String> mres=new ArrayList<>();
		String codeforce= codes[ch-'0'];
		for(int i=0;i<codeforce.length();i++)
		{
			char ch1=codeforce.charAt(i);
			for(String rstr:rres)
			{
				mres.add(ch1+rstr);
			}
		}
		return mres;
		
	}
}
