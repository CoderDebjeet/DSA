package corejava;
import java.io.*;
import java.util.Scanner;
public class recur16printstairpath {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth floor:- ");
		n=sc.nextInt();
		printstairpath(n,"");
		}
	public static void printstairpath(int n,String path)
	{
		if(n==0)
		{
			System.out.print("["+path+"] ");
			return;
		}
		if(n<0)
		{
			return;
		}
		printstairpath(n-1, "1"+path);
		printstairpath(n-2, "2"+path);
		printstairpath(n-3, "3"+path);
	}
}
