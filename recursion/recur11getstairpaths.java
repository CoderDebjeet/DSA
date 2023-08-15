package corejava;
import java.util.*;
public class recur11getstairpaths {
	public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Nth floor no : --");
	n=sc.nextInt();
	ArrayList <String> paths=getstairpath(n);
	System.out.println(paths);
}
public static ArrayList<String> getstairpath(int n)
{
	if(n==0)
	{
		ArrayList <String> bres=new ArrayList<>();
		bres.add("");
		return bres;
	}
	else if(n<0)
	{
		ArrayList <String> bres=new ArrayList<>();
		return bres;
	}
	ArrayList <String> path1=getstairpath(n-1);
	ArrayList <String> path2=getstairpath(n-2);
	ArrayList <String> path3=getstairpath(n-3);
	ArrayList <String> paths=new ArrayList<>();
	for(String val:path1)
	{
		paths.add("1"+val);
	}
	for(String val:path2)
	{
		paths.add("2"+val);
	}
	for(String val:path3)
	{
		paths.add("3"+val);
	}
	return paths;
}
}