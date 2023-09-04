package Cursors;
import java.util.*;
public class modifyacollectionduringiteration {
	public static void main(String[] args) {
		List<String> list =new ArrayList<>();
		list.add("Jane");
		list.add("jannah");
		list.add("Heida");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		//	list.remove(list.size()-1);
		}
		list.remove(list.size()-1);
		Iterator<String> itr2=list.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
			itr2.remove(); //All the elements are remove in iteration
		}
		System.out.println(list.size());
	}
}
