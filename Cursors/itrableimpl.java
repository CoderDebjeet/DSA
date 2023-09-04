package Cursors;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class itrableimpl implements Iterable<String>{
	private List<String> elements=new ArrayList<>();
	public void add(String ele)
	{
		this.elements.add(ele);
	}
	@Override
	public Iterator<String> iterator()
	{
		return this.elements.iterator();
	}
}
