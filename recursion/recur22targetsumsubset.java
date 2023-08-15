package corejava;

import java.util.Scanner;

public class recur22targetsumsubset {
	public static void main(String[] args) {
		int target;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of an array:- ");
		n=sc.nextInt();
		System.out.println("Enter the target:- ");
		target=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array:- ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The subsets are:- ");
		targetsubset(arr,0,"",0,target);
	}
	public static void targetsubset(int[] arr, int idx, String set, int sos, int tar)
	{
		if(idx==arr.length) {
			if(sos==tar)
			{
			System.out.println(set+".");
			}
			return;
		}
		targetsubset(arr, idx+1, set+arr[idx]+",", sos+arr[idx], tar);
		targetsubset(arr, idx+1, set, sos, tar);
	}
}
