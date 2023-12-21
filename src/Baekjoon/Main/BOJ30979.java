package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ30979{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int n = in.nextInt();
		int cnt=0;
		for(int i =0;i<n;i++) {
			cnt+=in.nextInt();
		}
		
		
		if(cnt>=t) {
			System.out.println("Padaeng_i Happy");
		}else {
			System.out.println("Padaeng_i Cry");
		}
	}
}

