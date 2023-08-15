package corejava;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.*;
class recur4max {
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
     System.out.println("Displaying the maximum value :- ");
     int max =maximym(arr,0);
     System.out.print(max);
 }
 
 
 public static int maximym(int []arr,int index)
 {
     if(index==arr.length-1)
     {
    	 return arr[index];
     }
     int m;
     m=maximym(arr,index+1);
     if (m>arr[index])
     {
    	 return m;
     }
     else
     {
    	 return arr[index];
     }
 }
}