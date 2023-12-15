package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ30923{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		long cnt = 2*n;
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
			cnt+=(arr[i]*2);
		}
		//System.out.println(cnt);
		for(int i=0;i<n-1;i++) {
			cnt += (Math.abs(arr[i+1]-arr[i]));
			
		}
		
		System.out.println(cnt+arr[0]+arr[n-1]);
	}
	
	
}

