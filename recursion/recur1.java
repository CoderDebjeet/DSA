package corejava;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.*;
class recur1 {
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
     displayarray(arr,0);
 }
 
 
 public static void displayarray(int []arr,int index)
 {
     if(index==arr.length)
     {
         return;
     }
     System.out.println(arr[index]);
     displayarray(arr,index+1);
 }
}