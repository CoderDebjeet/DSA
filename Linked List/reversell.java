package collections;
import java.util.*;
public class reversell {
		private Node head;
		private Node tail;
		private int size;
		public reversell()
		{
			this.size=0;
		}
		public void insertFirst(int val)
		{
			Node node=new Node(val);
			node.next=head;
			head=node;
			if(tail==null)
			{
				tail=head;
			}
			size+=1;
		}
		
		
		
		public Node middleNode()
		{
			Node s=head;
			Node f=head;
			while(f!=null && f.next!=null)
			{
				s=s.next;
				f=f.next.next;
			}
			return s;
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
		//recursion reverse
		private void reverse(Node node)
		{
			 if(node==tail)
			 {
				 head=tail;
				 return;
			 }
			 reverse(node.next);
			 tail.next=node;
			 tail=node;
			 tail.next=null;
		}
		//in place reversal in linked list
		public void reverse()
		{
			if(size<2)
			{
				return;
			}
			Node prev=null;
			Node present=head;
			Node next=present.next;
			while(present!=null)
			{
				present.next=prev;
				prev=present;
				present=next;
				if(next!=null)
				{
					next=next.next;
				}
			}
			head=prev;
		}
		
		// reverse between Leetcode reverse II
		public void reversebtn(int left,int right)
		{
			if(left==right)
			{
				return;
			}
			Node current=head;
			Node prev=null;
			for(int i=0;current!=null && i<left-1;i++)
			{
				prev=current;
				current=current.next;
			}
			Node last=prev;
			Node newEnd=current;
			// reverse between left and right
			Node next=current.next;
			for(int i=0;current!=null && i<right-left+1;i++)
			{
				current.next=prev;
				prev=current;
				current=next;
				if(next!=null)
				{
					next=next.next;
				}
			}
			if(last!=null)
			{
				last.next=prev;
			}
			else
			{
				head=prev;
				
			}
			newEnd.next=current;
			
		}
		
		public boolean isPalindrome()
		{
			Node mid=middleNode();
			Node headSecond=reverse(mid);
			Node reversehead=headSecond;
			while(head !=null && headSecond !=null)
			{
				if(head.value !=headSecond.value)
				{
					break;
				}
				head=head.next;
				headSecond=headSecond.next;
			}
			reverse(reversehead);
			return head==null || headSecond==null;
			
		}
		
		public void reorderList(ListNode head) 
		{
		        if(head == null || head.next=null)
		        {
		        	return;
		        }
		        ListNode mid=middleNode(head);
		        ListNode hs=reverse(mid);
		        ListNode hf=head;
		        
		        //rearrange
		        while(hf!=null && hs!=null)
		        {
		        	ListNode temp=hf.next;
		        	hf.next=hs;
		        	hf=temp;
		        	
		        	temp=hs.next;
		        	hs.next=hf;
		        	hs=temp;
		        }
		        if(hf!=null)
		        {
		        	hf.next=null;
		        }
		    }
		
		public void display()
		{
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.value+" -> ");
				temp=temp.next;
			}
			System.out.println("End ");
		}
		
		private class Node
		{
			private int value;
			private Node next;
			public Node(int value)
			{
				this.value=value;
			}
			public Node(int value,int index)
			{
				this.value=value;
				this.next=next;
			}
		}
		
		public static void main(String args[])
		{
			reversell list=new reversell();
			for(int i=7;i>0;i--)
			{
				list.insertFirst(i);
			}
			list.display();
			//list.reverse();
			System.out.println(list.middleNode());
			list.reversebtn(2, 5);
			list.display();
		}
		
}
