package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ1357{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		
		String x = in.next();
		String y = in.next();
		
		StringBuilder sb = new StringBuilder(x);
		StringBuilder sb2 = new StringBuilder(y);
		sb.reverse();
		sb2.reverse();
		
		BigInteger x2 = new BigInteger(sb.toString());
		BigInteger y2 = new BigInteger(sb2.toString());
		
		BigInteger z = x2.add(y2);
		
		StringBuilder sb3 = new StringBuilder(z.toString());
		sb3.reverse();
		
		System.out.println(Integer.parseInt(sb3.toString()));
		
	}
	
	
}

