package Cursors;
import java.util.*;
public class enumeration {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add("deepak");
		v.add(15.2);
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}
