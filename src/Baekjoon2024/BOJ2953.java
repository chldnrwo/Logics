package Baekjoon2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ2953{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		
		int max = 0;
		int winner = 0;
		
		for(int i=1;i<=5;i++) {
			int cnt = 0;
			for(int j=0;j<4;j++) {
				int n = in.nextInt();
				cnt+=n;
			}
			
			if(cnt > max) {
				max = cnt;
				winner = i;
			}
		}
		
		System.out.println(winner+" "+max);
		
	}
}

