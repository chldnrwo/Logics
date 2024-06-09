package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ2979{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		
		int a= in.nextInt();
		int b= in.nextInt();
		int c= in.nextInt();
		
		int[] arr = new int[101];
		int[] brr = new int[101];
		int[] crr = new int[101];
		
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int b1 = in.nextInt();
		int b2 = in.nextInt();
		int c1 = in.nextInt();
		int c2 = in.nextInt();
		
		for(int i = a1;i<a2;i++) {
			 arr[i] =  1;
		}
		for(int i = b1;i<b2;i++) {
			 brr[i] =  1;
		}
		for(int i = c1;i<c2;i++) {
			 crr[i] =  1;
		}
		
		int cnt = 0;
		for(int i=1;i<=100;i++) {
			if(arr[i]+brr[i]+crr[i]==3) {
				cnt+=(3*c);
			}else if(arr[i]+brr[i]+crr[i]==2) {
				cnt+=(2*b);
			}else if(arr[i]+brr[i]+crr[i]==1) {
				cnt+=a;
			}
		}
		System.out.println(cnt);
	}
	
	
}

