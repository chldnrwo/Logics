package Baekjoon2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ2003{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		long n = in.nextLong();
		long m = in.nextLong();
		long[] arr = new long[(int) n+1];
		
		
		
		for(int i=1;i<=n;i++) {
			long a = in.nextLong();
			arr[i] = arr[i-1] + a; 
		}
		
		
		int cnt = 0;
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<i;j++) {
				long b = arr[i] - arr[j];
				if(b==m) {
					cnt++;
					//System.out.println(j+" "+i);
				}
			}
		}
		System.out.println(cnt);
	}
}

