package Baekjoon2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ2217{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
		}
		
		Arrays.sort(arr);
		int max = 0;
		for(int i=0;i<n;i++) {
			int res = arr[i] * (n - i);
			if(res > max) {
				max = res;
			}
		}
		System.out.println(max);
	}
}

