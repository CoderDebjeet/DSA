package Cursors;
import java.util.*;

public class MyListIterator<T> implements Iterator<T> {
    private List<T> source = null;
    private int index = 0;

    public MyListIterator(List<T> source) {
        this.source = source;
    }

    @Override
    public boolean hasNext() {  // Corrected method name to hasNext() and added @Override annotation
        return this.index < this.source.size();
    }

    @Override
    public T next() {  // Corrected method name to next() and added @Override annotation
        if (!hasNext()) {
            throw new NoSuchElementException(); // Add this to match the Iterator interface contract
        }
        return this.source.get(this.index++);
    }
}
/*MyListIterator: This is the name of the class.

<T>: This is a generic type parameter declaration. 
It indicates that the class MyListIterator is a generic class that can work with a
 type T. The T is a placeholder for a type that will be specified when you create an
  instance of MyListIterator. 
This allows you to create instances of MyListIterator that can work with different 
types of elements.

For example, if you want to create a MyListIterator for a list of integers, 
you would do something like this:


List<Integer> myList = new ArrayList<>();
// Add some integers to myList

MyListIterator<Integer> iterator = new MyListIterator<>(myList);
In this case, T is replaced with Integer, and the MyListIterator instance can iterate over elements of type Integer. 
You can similarly create MyListIterator instances for other types by
 specifying the appropriate type argument when creating the instance.
 */