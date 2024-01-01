package Baekjoon2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ31067{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
		}
		int cnt=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i] >= arr[i+1]) {
				arr[i+1]+=k;
				cnt++;
			}
			
			if(arr[i] >= arr[i+1]) {
				System.out.println(-1);
				System.exit(0);
			}
		}
		
		
		System.out.println(cnt);
		
		
		
	}
}

