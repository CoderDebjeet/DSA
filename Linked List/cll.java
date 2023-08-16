package collections;

import java.util.*;

public class cll {
	
	private Node head;
	private Node tail;
	private int size;
	public  cll()
	{
		this.head=null;
		this.tail=null;
		this.size=0;   // to keep a record on no of nodes in the list
	}
	
	public void insertfirst(int val)
	{
		Node newnode=new Node(val);
		if (head==null)
		{
			head=tail=newnode;
			tail.next=head;
		}
		else
		{
		newnode.next=tail.next;
		tail.next=newnode;
		head=newnode;
		size ++;
		}
	}
	public void insertlast(int val)
	{
		Node newnode = new Node(val);
		if(tail==null)
		{
			tail=newnode;
			tail.next=newnode;
		}
			newnode.next=tail.next;
			tail.next=newnode;
			//tail=newnode;
			size++;
	}
	public int deletefirst()
	{
		int val=tail.next.value;
		Node temp=tail.next;
		if (tail==null)
		{
			System.out.println("List is empty");
		}
		if(temp.next == temp)
		{
			tail=null;
		}
		tail.next=temp.next;
		size--;
		return val;
	}
	public void delete(int val)
	{
		Node node = head;
        if (node == null) {
            return;
        }

        if (head == tail){
            head = null;
            tail = null;
            return;
        }
        if (node.value == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.value == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);
	}
	
	public void display()
	{
		Node temp=head;
		while(temp.next !=head)
		{
			System.out.print(temp.value + " -> ");
			temp=temp.next;
		}
		System.out.print(temp.value);
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
}
