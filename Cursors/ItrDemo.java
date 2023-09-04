package Cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItrDemo {
	public static void main(String[] args) {
		List l =new ArrayList<>();
		l.add(10);
		l.add("deepak");
		l.add("rahul");
		Iterator itr=l.iterator();//without any type of elemnets
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
/*l[10
 * deepak
 * rahul]
 */
		
/*itr[
 * -> 10
 * -> deepak
 * -> rahul
 * ]*/
 