package corejava;

import java.util.Scanner;

public class recur2 {
	 public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the size of an array:- ");
	     int n=sc.nextInt();
	     int [] arr=new int[n];
	     System.out.println("Enter the values of array:- ");
	     for(int i=0;i<n;i++)
	     {
	         arr[i]=sc.nextInt();
	     }
	     System.out.println("Displaying the  array:- ");
	     System.out.println((checksort(arr,0)));
	   
	 }
	 public static boolean checksort(int arr[],int i)
	 {
		 int c=0;
		 if(i==arr.length-1)
		 {
			 return true;
		 }
		 return (arr[i]<arr[i+1] && checksort(arr,i+1)); 

	 }
}
