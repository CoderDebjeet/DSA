package corejava;
import java.util.*;
public class recur18printmazepathwithjump {
	public static void main(String[] args) { 
		int n,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows");
		n=sc.nextInt();
		System.out.println("Enter no of columns");
		m=sc.nextInt();
		printmazepathwithjumps(1,1,n,m,"");
	}
	public static void printmazepathwithjumps(int sr,int sc,int dr, int dc,String path)
	{
		if(sr==dr && sc==dc)
		{
			System.out.println(path);
			return;
		}
		if(sc>dc || sr>dr)
		{
			return;
		}
		for(int jumph=1;jumph<=dc-sc;jumph++)
		{
			printmazepathwithjumps(sr, sc+jumph, dr, dc,path+"h"+jumph);
		}
		for(int jumpv=1;jumpv<=dr-sr;jumpv++)
		{
			printmazepathwithjumps(sr+jumpv, sc, dr, dc,path+"v"+jumpv);
		}
		for(int jumpd=1;jumpd<=dc-sc && jumpd<=dr-sr;jumpd++)
		{
			printmazepathwithjumps(sr+jumpd, sc+jumpd, dr, dc,path+"d"+jumpd);
		}
	}
}
