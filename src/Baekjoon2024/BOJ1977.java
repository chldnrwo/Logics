package Baekjoon2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ1977{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		
		int n2 = (int) Math.sqrt(n);
		int m2 = (int) Math.sqrt(m);
		
		if(Math.sqrt(n) -n2 != 0) {
			n2++;
		}
		
		long cnt = 0; 
		for(int i=n2;i<=m2;i++) {
			cnt+=(i*i);
		}
		if(cnt==0) {
			System.out.println(-1);
		}else {
			System.out.println(cnt);
			System.out.println(n2*n2);
		}
		
	}
}

