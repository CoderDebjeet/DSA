package collections;

import java.util.*;
class doublell
{
    class node
    {
        int data;
        node next;
        public node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public node head=null;
    public node tail=null;
    public void Addnode(int data)
    {
    node newnode=new node(data);
    if (head==null)
    {
        head=newnode;
        tail=newnode;
    }
    else{
        tail.next=newnode;
        tail=newnode;
    }
    }
    public void display()
    {
        node start=head;
        if(start==null){
            System.out.println("List is empty");
            return;
        }
        while(start!=null){
            System.out.print(start.data);
            start=start.next;
        }
    }
    public void doublelist(){
        
        int num=0,newnum=0,c=0;
        node start=head;
       
        while(start!=null){
            num=num*10+start.data;
            start=start.next;
        }
        num=num*2;
        
        while(num!=0){
        newnum=newnum*10+num%10;   
        num=num/10;
        c++;
        }
        head=null;
        while(newnum!=0){
          Addnode(newnum%10);
          newnum=newnum/10;
          c--;
        }
        while(c!=0){
            c--;
            Addnode(0);
        }
    }
    public static void main(String args[]){
        doublell lst=new doublell();
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("press -1 if you don't want to insert data :-\n");
        while(true){
            System.out.println("Enter data :- ");
            n=sc.nextInt();
            if(n==-1)
            break;
            lst.Addnode(n);
        }
      System.out.println("Old lsit is: ");
        lst.display();
        lst.doublelist();
        System.out.println("\nNew list is: ");
         lst.display();
        
    }
}