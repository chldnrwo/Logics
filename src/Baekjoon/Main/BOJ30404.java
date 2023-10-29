package Baekjoon.Main;

import java.util.*;

public class BOJ30404{
	static Integer[] arr;
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt(); 	
		}
		
		int clapCnt = 0;
		int lastCnt = 0;
		
		for(int i=0;i<n;i++) {
			if(arr[i] > lastCnt) {
				clapCnt++;
				lastCnt = arr[i] + k;
			}
		}
		System.out.println(clapCnt);
	}
	
}

