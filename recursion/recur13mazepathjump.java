package corejava;
import java.util.*;
public class recur13mazepathjump {
	public static void main(String[] args) {
		int n,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row: - ");
		n=sc.nextInt();
		System.out.println("Enter the column: - ");
		m=sc.nextInt();
		ArrayList <String> paths=getmazepathjump(1,1,n,m);
		System.out.println(paths);	
	}
	public static ArrayList<String> getmazepathjump(int sr,int sc,int dr,int dc)
	{
		if(sc==dc && sr==dr)
		{
			ArrayList <String> base=new ArrayList<>();
			base.add("");
			return base;
		}
		else if (sr > dr || sc > dc)
	    {
	      ArrayList< String> bres = new ArrayList< >();
	      return bres;
	    }
		ArrayList <String> paths=new ArrayList<>();
		for(int jumph=1;jumph<=dc-sc;jumph++)
		{
			ArrayList<String> hpaths=getmazepathjump(sr, sc+jumph, dr, dc);
			for(String val:hpaths)
			{
				paths.add("h"+jumph+val);
			}
		}
		for(int jumpv=1;jumpv<=dr-sr;jumpv++)
		{
			ArrayList<String> vpaths=getmazepathjump(sr+jumpv, sc, dr, dc);
			for(String val:vpaths)
			{
				paths.add("v"+jumpv+val);
			}
		}
		for(int jumpd=1;jumpd<=dc-sc && jumpd<=dr-sr;jumpd++)
		{
			ArrayList<String> dpaths=getmazepathjump(sr+jumpd, sc+jumpd, dr, dc);
			for(String val:dpaths)
			{
				paths.add("d"+jumpd+val);
			}
		}
		return paths;
	}
	
}
