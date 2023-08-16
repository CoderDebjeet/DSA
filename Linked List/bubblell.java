package collections;
import java.util.*;

public class bubblell {
	private Node head;
	private Node tail;
	private int size;
	public bubblell()
	{
		this.size=0;
	}
	public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }
	public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
	private class Node
	{
		private int value;
		private Node next;
		public Node(int value)
		{
			this.value=value;
		}
		public Node(int value,Node next)
		{
			this.value=value;
			this.next=next;
			
		}
	}
	
	public Node get(int index)
	{
		Node node=head;
		for(int i=0;i<index;i++)
		{
			node=node.next;
		}
		return node;
	}
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.value+" -> ");
			temp=temp.next;
		}
		System.out.println("End");
	}
	public void bubbleSort()
	{
		bubbleSort(size-1,0);
	}
	public void bubbleSort(int row, int col)
	{
		if(row==0)
		{
			return;
		}
		if(col<row)
		{
			Node first=get(col);
			Node second=get(col+1);
			if(first.value>second.value)
			{
				if(first==head)
				{
					head=second;
					first.next=second.next;
					second.next=first;
				}
				else if(second== tail)
				{
					Node prev=get(col-1);
					prev.next=second;
					tail=first;
					first.next=null;
					second.next=tail;
				}
				else
				{
					Node prev=get(col-1);
					prev.next=second;
					first.next=second.next;
					second.next=first;
				}
			}
			bubbleSort(row,col+1);
		}else
		{
			bubbleSort(row-1,0);
		}
	}
	public static void main(String args[])
	{
		
		
		
		bubblell list=new bubblell();
		for(int i=7;i>0;i--)
		{
			list.insertLast(i);
		}
		
		
		list.display();
		list.bubbleSort();
		list.display();
	}
}	
