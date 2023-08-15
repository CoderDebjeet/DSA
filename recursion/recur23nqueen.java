/*The N Queen is the problem of placing N queens on an N*N chessboard so that 
 * no two queens attack each other.

Queen can kill other queens in all of the 
8 directions possible (left, right, up, down, and all the 4 diagonals).

Given the value of N, you have to print all the valid chess 
board configurations possible.

Example) For N = 4, there are two valid configurations:*/


package corejava;
import java.util.*;
public class recur23nqueen {
	public static void main(String[] args) {
		int n,m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows:- ");
		n=sc.nextInt();
		System.out.println("Enter the chessboard path");
		int arr[][]=new int[n][n];
		nqueen(arr,"",0);
	}
	public static void nqueen(int[][]arr,String qsf,int row)
	{
		if(row==arr.length)
		{
			System.out.println(qsf+".");
			return;
		}
		for(int col=0;col<arr.length;col++)
		{
			if(issafequeen(arr,row,col)==true)
			{
				arr[row][col]=1;
				nqueen(arr, qsf+row+"-"+col+",",row+1);
				arr[row][col]=0;
			}
		}
	}
	public static boolean issafequeen(int arr[][],int row,int col)
	{
	    for (int i = row - 1, j = col - 1;i >= 0 && j >= 0; i--, j--) {
	         if (arr[i][j] == 1) {
	           return false;
	         }
	       }

	       for (int i = row - 1, j = col; i >= 0; i--) {
	         if (arr[i][j] == 1) {
	           return false;
	         }
	       }

	       for (int i = row - 1, j = col + 1; i >= 0
	            && j < arr.length; i--, j++) {
	         if (arr[i][j] == 1) {
	           return false;
	         }
	       }

	       for (int i = row, j = col - 1; j >= 0; j--) {
	         if (arr[i][j] == 1) {
	           return false;
	         }
	       }

	       return true;
	}
}
