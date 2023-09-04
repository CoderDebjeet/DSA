package Cursors;
import java.util.*;
public class listitr {
	public static void main(String[] args) {
		List l=new ArrayList<>();
		l.add(10);
		l.add("deepak");
		l.add("rahul");
		ListIterator li=l.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("---------------------");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		li.set(200);
		System.out.println(l);
	}
}
