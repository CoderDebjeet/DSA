package corejava;

import java.util.Scanner;

public class recur7allindices {
	
	public static int [] allindex(int[]arr,int x,int index,int fnf)
	{
		if(index==arr.length)
		{
			return new int[fnf];
		}
		if(arr[index]==x)
		{
			int[]iarr=allindex(arr,x,index+1,fnf+1);
			iarr[fnf]=index;
			return iarr;
		}else
		{
			int[]iarr=allindex(arr,x,index+1,fnf);
			return iarr;
		}
	}
	
	

	 public static void main(String[] args) {
		 int x;
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
	     x=sc.nextInt();
	     System.out.println("Displaying the index of all occurence :- ");
	     int []iarr =allindex(arr,x,0,0);
	     for(int i=0;i<iarr.length;i++)
	     {
	    	 System.out.println(iarr[i]);
	     }
	   
	 	}
}
