package corejava;
import java.util.*;
public class recur12getmazepath {
	public static void main(String[] args) {
		int n,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row: - ");
		n=sc.nextInt();
		System.out.println("Enter the column: - ");
		m=sc.nextInt();
		ArrayList <String> paths=getmazepath(1,1,n,m);
		System.out.println(paths);	
	}
	public static ArrayList<String> getmazepath(int sr,int sc,int dr,int dc)
	{
		if(sc==dc && sr==dr)
		{
			ArrayList<String> base=new ArrayList<>();
			base.add("");
			return base;
		}
		ArrayList <String> hpath=new ArrayList<>();
		ArrayList <String> vpath=new ArrayList<>();
		if(sc<dc)
		{
			hpath=getmazepath(sr, sc+1, dr, dc);
		}
		if(sr<dr)
		{
			vpath=getmazepath(sr+1, sc, dr, dc);
		}
		ArrayList <String> paths=new ArrayList<>();
		for(String val:hpath)
		{
			paths.add("h"+val);
		}
		for(String val:vpath)
		{
			paths.add("v"+val);
		}
		return paths;
	}
}
