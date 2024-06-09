package Baekjoon.Main;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class BOJ10971{
	static int n;
	static int[][] arr;
	static boolean[] visited;
	static int min = Integer.MAX_VALUE;
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		visited = new boolean[n];
		arr = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = in.nextInt();
			}
		}
		visited[1] = true;
		dfs(1, 1, 1, 0);
		System.out.println(min);
		
		
	}
	public static void dfs(int start, int now, int cnt, int cost) {
		
		if(now == start && cost>0) {
			min = Math.min(min, cost);
			return;
		}
		
		for(int i=0;i<n;i++) {
			if(arr[now][i]>0) {
				if(i == start && cnt == n) {
					cost += arr[now][i];
					dfs(start, i, cnt+1, cost);
				}
				
				else if(!visited[i]) {
					visited[i]=true;
					cost += arr[now][i];
					dfs(start, i, cnt+1, cost);
					cost -= arr[now][i];
					visited[i]=false;
					
				}
			}	
		}
		
	}
}
