package Cursors;
/*
 *  Iterate an Iterable With the for-each Loop
	Iterate an Iterable via an Iterator
	Iterate an Iterable via its forEach() Method
	Iterable Interface Definition
	Implementations of Iterable in Java
	Implementing the Iterable Interface
	Obtaining a Spliterator
	Iterable Performance
*/
import java.util.*;
public class IterableExaple {
 public static void main(String[] args) {
	 List<String> list = new ArrayList<>();

	 list.add("one");
	 list.add("two");
	 list.add("three");

	 for( String element : list ){
	     System.out.println( element.toString() );
	 }
	 
	 /*Iterate an Iterable via an Iterator
	 The second way you can iterate the elements of a Java Iterable is by
	  obtaining a Java Iterator from it by calling the Iterable iterator() method.
	   You can then iterate through that Iterator like you would with any other Iterator
	   . You can read more about the Java Iterator in my Java Iterator tutorial .
	    Here is an example of iterating the elements of a Java Iterable (a Java List in this example):*/

	 List<String> list2 = new ArrayList<>();

	 list2.add("one");
	 list2.add("two");
	 list2.add("three");

	 Iterator<String> iterator = list2.iterator();

	 while(iterator.hasNext()) {
	     String element = iterator.next();
	     System.out.println( element );
	 }
	/* Iterate an Iterable via its forEach() Method
	 The third way to iterate the elements of a Java Iterable
	  is via its forEach() method. The forEach() method takes a Java Lambda
	   Expression as parameter. This lambda expression is called once for each
	    element in the Iterable. Here is an example of iterating the elements of an
	     Iterable via its forEach() method:*/

	 List<String> list3 = new ArrayList<>();

	 list.add("one");
	 list.add("two");
	 list.add("three");

	 list.forEach( (element) -> {
	     System.out.println( element );
	 });
	
	 /*Obtaining a Spliterator
	 You can obtain a Java Spliterator from a Java Iterable via its spliterator() method. I won't go into the the Spliterator interface here - 
	 just show how to obtain a Spliterator from an Iterable:*/

	 List<String> list4 = new ArrayList<>();

	 list4.add("one");
	 list4.add("two");
	 list4.add("three");

	 Spliterator<String> spliterator = list4.spliterator();
	 /*Iterable Performance
	 If you are writing some code that needs to iterate a collection lots of times in a tight loop, let's say iterate a Java List thousands of times per second, iterating the List via the Java for-each loop is slower than iterating the list via a standard for-loop as seen here: () .
*/
	 for(int i=0; i<list4.size(); i++) {
	     Object obj = list4.get(i);
	 }
	/* The reason the for-each loop is slower is, that each 
	 * iteration will call the List iterator() method, which will 
	 * create a new Iterator object. Creating a new object thousands, 
	 * perhaps even millions of times per second does have a small performance 
	 * penalty compared to just iterating the List using a standard for-loop.

	 For most standard business applications where collections are iterated 
	 occasionally, this performance difference is irrelevant. It only matters
	  for very tight loops that are executed thousands of times per second.
	 */
	 
	 
}
}
