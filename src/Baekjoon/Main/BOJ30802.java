package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ30802{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] arr = new int[6];
		
		int cnt = 0;
		for(int i=0;i<6;i++) {
			int a = in.nextInt();
			arr[i] = a;
		}
		
		int t = in.nextInt();
		int p = in.nextInt();
		
		for(int i=0;i<6;i++) {
			int a = arr[i];
			if(a%t==0) {
				cnt+=(a/t);
			}else {
				cnt+=(a/t+1);
			}
		}
		System.out.println(cnt);
		System.out.println(n/p+" "+n%p);
	}

}

