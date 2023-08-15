package corejava;

import java.util.Scanner;

public class recur6lastoccurence {
	public static int lastoccr(int arr[],int index,int data)
	{
		if(index==arr.length)
		{
			return -1;
		}
		int f=lastoccr(arr,index+1,data);
		
		if(f==-1)
		{
			if(arr[index]==data)
				return index;
			else
				return -1;
			
		}
		else
		{
			return f;
		}
	}
	
	
	
	
	 public static void main(String[] args) {
		 int data;
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the size of an array:- ");
	     int n=sc.nextInt();
	     int [] arr=new int[n];
	     System.out.println("Enter the values of array:- ");
	     for(int i=0;i<n;i++)
	     {
	         arr[i]=sc.nextInt();
	     }
	     System.out.println("Enter the data:- ");
	     data=sc.nextInt();
	     System.out.println("Displaying the index of first occurence :- ");
	     int fi=lastoccr(arr,0,data);
	     System.out.print(fi);
	 }
}

