package Baekjoon2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ2506{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] arr = new int[n];
		int[] arr2 = new int[n];
		
		arr[0] = in.nextInt();
		if(arr[0] == 1) {
			arr2[0] = 1;
		}
		
		for(int i=1;i<n;i++) {
			arr[i] = in.nextInt();
			
			if(arr[i]==1) {
				arr2[i] = 1;
				if(arr[i-1]==1) {
					arr2[i] = arr2[i-1] + 1;
				}
			}
			
		}
		
		int cnt =0;
		for(int i=0;i<n;i++) {
			cnt += arr2[i];
		}
		System.out.println(cnt);
	}
}

