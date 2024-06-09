package Baekjoon2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ10093{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		long n = in.nextLong();
		long m = in.nextLong();
		
		StringBuilder sb = new StringBuilder();
		if(n>m) {
			sb.append(n-m-1).append("\n");
			for(long i=m+1;i<n;i++) {
				sb.append(i).append(" ");
			}
		}else if(n==m){
			sb.append(0);
		}else {
			sb.append(m-n-1).append("\n");
			for(long i=n+1;i<m;i++) {
				sb.append(i).append(" ");
			}
		}
		
		
		
		
		System.out.println(sb);
		
	}
}

