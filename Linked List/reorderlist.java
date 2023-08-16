package collections;
import java.util.*;


public class reorderlist {
//	private ListNode head;
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode reverse(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;
        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode mid = middleNode(head);
        ListNode hs = reverse(mid);
        ListNode hf = head;

        // Rearrange
        while (hf != null && hs != null) {
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }

        if (hf != null) {
            hf.next = null;
        }
    }
    public static ListNode rotateRight(ListNode head,int k)
    {
    	if(k<=0 || head==null ||head.next==null)
    	{
    		return head;
    	}
    	ListNode last=head;
    	int length=1;
    	while(last.next!=null)
    	{
    		last=last.next;
    		length++;
    	}
    	last.next=head;
    	int rotations=k%length;
    	int skip=length-rotations;
    	ListNode newLast=head;
    	for(int i=0;i<skip-1;i++)
    	{
    		newLast=newLast.next;
    	}
    	head=newLast.next;
    	newLast.next=null;
    	return head;
    }
    
    public static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        // Create the linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println("Original linked list:");
        display(head);
        rotateRight(head,2);
        display(head);
        reorderList(head);
        
        System.out.println("Reordered linked list:");
        display(head);
        // Print the reordered linked list
       
    }
}


