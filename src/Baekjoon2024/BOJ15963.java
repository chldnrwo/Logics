package Baekjoon2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ15963{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		long n = in.nextLong();
		long m = in.nextLong();
		
		if(n==m) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}

