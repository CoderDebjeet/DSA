package corejava;

import java.util.Scanner;

public class recur5firstoccurence {
	public static int firstoccr(int arr[],int index,int data)
	{
		if(index==arr.length)
		{
			return -1;
		}
		if(arr[index]==data)
		{
			return index;
		}
		else
		{
			int f=firstoccr(arr,index+1,data);
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
	     int fi=firstoccr(arr,0,data);
	     System.out.print(fi);
	 }
}
