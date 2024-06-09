package Baekjoon2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ5596{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int res1 = 0;
		int res2 = 0;
		for(int i=0;i<4;i++) {
			res1 += in.nextInt();
		}
		for(int i=0;i<4;i++) {
			res2 += in.nextInt();
		}
		
		System.out.println(Math.max(res1, res2));
	}
}

