package Cursors;
import java.util.*;
public class foreachiterator4 {
	public static void main(String[] args) {
		List <String> list=new ArrayList<>();
		list.add("Jane");
		list.add("mali");
		list.add("pani");
		Iterator <String> itr=list.iterator();
		itr.forEachRemaining((element)->{
			System.out.println(element);
	});
	
	} 
	
}
/*Sliding more functional manner*/