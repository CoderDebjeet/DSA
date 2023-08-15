package corejava;
import java.io.*;

import java.util.*;

public class recur21floodfill {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows:-");
		int n=sc.nextInt();
		System.out.println("Enter no of colums:-");
		int m=sc.nextInt();
		int maze[][]=new int[n][m];
		System.out.println("Enter the maze:- ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				maze[i][j]=sc.nextInt();
			}	
		}
		boolean[][] visited=new boolean[n][m];
		floodfill(maze,0,0,"",visited);
		
	}
	public static void floodfill(int[][]maze,int row,int col,String rsf,boolean visited[][])
	{
		if(row<1 || col<1 || row==maze.length || col==maze[0].length || maze[row][col]==1 || visited[row][col]==true)
		{
			return;
		}
		if(row==maze.length-1 && col==maze[0].length-1)
		{
			System.out.println(rsf);
			return;
		}
		visited [row][col]=true;
		floodfill(maze, row-1, col,"t"+ rsf, visited);
		floodfill(maze, row, col-1, "l"+rsf, visited);
		floodfill(maze, row+1, col, "d"+rsf, visited);
		floodfill(maze, row, col+1, "r"+rsf, visited);
		visited[row][col]=false;
	}
}
