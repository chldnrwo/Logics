package Baekjoon2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ5543{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int h = in.nextInt();
		int m = in.nextInt();
		int l = in.nextInt();
		
		int co = in.nextInt();
		int ci = in.nextInt();
		
		int cnt = 0;
		
		cnt+=Math.min(h, Math.min(m, l));
		cnt+=Math.min(co, ci);
		
		System.out.println(cnt-50);
	}
}

