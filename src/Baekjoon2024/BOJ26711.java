package Baekjoon2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ26711{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		String s1 = in.next();
		String s2 = in.next();
		
		BigInteger b1 = new BigInteger(s1);
		BigInteger b2 = new BigInteger(s2);
		System.out.println(b1.add(b2));
	}
}

