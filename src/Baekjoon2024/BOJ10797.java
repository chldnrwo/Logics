package Baekjoon2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ10797{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		
		int n = in.nextInt();
		int cnt = 0;
		
		for(int i=0;i<5;i++) {
			int a = in.nextInt();
			if(a%10 == n) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}

