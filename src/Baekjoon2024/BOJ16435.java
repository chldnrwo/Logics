package Baekjoon2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ16435{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int len = in.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			int a = in.nextInt();
			arr[i] = a;
			
		}
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			if(arr[i]<=len) {
				len++;
			}
		}
		System.out.println(len);
	}
}

