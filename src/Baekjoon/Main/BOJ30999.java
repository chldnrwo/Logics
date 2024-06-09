package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ30999{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		int total =0;
		
		for(int i=0;i<n;i++) {
			String s = in.next();
			
			int O = 0;
			int X = 0;
			
			for(int j=0;j<m;j++) {
				char c = s.charAt(j);
				if(c=='O') {
					O++;
				}else {
					X++;
				}
			}
			
			if(O > X) {
				total++;
			}
		}
		
		System.out.println(total);
	}
}

