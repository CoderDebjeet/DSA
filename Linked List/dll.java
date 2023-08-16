package collections;
import java.util.*;

public class dll {
	private Node head;
	private Node tail;
	private int size;
	public  dll()
	{
		this.size=0;   // to keep a record on no of nodes in the list
	}
	public void insertfirst(int val)
	{
		Node newnode=new Node(val);
		if (head==null)
		{
			head=tail=newnode;
		}
		else
		{
			newnode.next=head;
			head.prev=newnode;
			newnode.prev=null;
			head=newnode;
			size++;
		}
	}
	public void insertlast(int val)
	{
		Node newnode= new Node(val);
		tail.next=newnode;
		newnode.prev=tail;
		newnode.next=null;
		tail=newnode;
		size++;
	}
	public void insertAtPos(int val,int index)
	{
		if (index==0)
		{
			insertfirst(val);
			return;
		}
		if (index== size)
		{
			insertlast(val);
			return;
		}
		Node temp=head;
		for(int i=1;i<index;i++)
		{
			temp=temp.next;
		}
		Node newnode=new Node(val,temp.prev,temp.next);
		newnode.prev=temp;
		newnode.next=temp.next;
		temp.next=newnode;
		newnode.next.prev=newnode;
		size ++;
		
	}
	public int deletefirst()
	{
		int val=head.value;
		Node temp=head;
		head=head.next;
		head.prev=null;
		size --;
		return val;
	}
	public int deletelast()
	{
		int val=tail.value;
		Node temp=tail;
		tail.prev.next=null;
		tail=tail.prev;
		size --;
		return val;
	}
	public int deletefrompos(int index)
	{	int i=1;
		if(index ==0 )
		{
			return deletefirst();
		}
		if(index==size-1)
		{
			return deletelast();
		}
		
		Node temp=head;
		while(i<index)
		{
				temp=temp.next;
				i++;
		}
		temp.prev.next=temp.next;
		temp.next.prev=temp.prev;
		int val=temp.value;
		return(val);	
	}
	
	public Node get(int index)
	{
		Node newnode=head;
		for(int i=0;i<index;i++)
		{
			newnode=newnode.next;
		}
		return newnode;
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
	
	private class Node
	{
		private int value;
		private Node prev;
		private Node next;
		public Node(int value)
		{
			this.value=value;
		}
		public Node(int value, Node prev,Node next)
		{
		    this.value = value;
		    this.prev=prev;
		    this.next = next;
		}
	}
	
	
	
}
