package Baekjoon.Main;

import java.util.*;

public class BOJ30394{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			
			arr[i] = y;
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[arr.length-1] - arr[0]);
	}
	
}

