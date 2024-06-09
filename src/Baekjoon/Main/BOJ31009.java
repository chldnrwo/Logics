package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ31009{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int cnt = 0;
		int rule = -1;
		
		int[] arr = new int[n+1];
		
		for(int i=0;i<n;i++) {
			String s = in.next();
			int a = in.nextInt();
			arr[i] = a;
			
			if(s.equals("jinju")) {
				rule = a;
			}
			
		}
		for(int i=0;i<n;i++) {
			if(arr[i]>rule) {
				cnt++;
			}
		}
		System.out.println(rule);
		System.out.println(cnt);
	}
}

