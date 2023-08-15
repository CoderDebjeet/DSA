package corejava;
import java.util.*;
public class recur17printmazepath {
	public static void main(String[] args)
	{
		int m,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of rows:- ");
		m=sc.nextInt();
		System.out.println("Enter the value of columns:- ");
		n=sc.nextInt();
		printmazepath(1,1,m,n,"");
	}
	public static void printmazepath(int sr,int sc,int dr,int dc,String psf)
	{
		if(sr==dr && sc==dc)
		{
			System.out.println(psf);
			return;
		}
		if(sc<dc)
		{
			printmazepath(sr, sc+1, dr, dc,psf+"h");
		}
		if(sr<dr)
		{
			printmazepath(sr+1, sc, dr, dc,psf+"v");
		}
		
	}
}
