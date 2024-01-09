package Baekjoon2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ1550{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		
		long cnt = 0;
		
		for(int i=s.length()-1;i>=0;i--) {
			char a = s.charAt(s.length()-i-1);
			int b = 0;
			if(65<=a) {
				b = a - 55;
			}else {
				b = a - 48;
			}
			
			cnt += b * Math.pow(16, i);
			//System.out.println(b+" "+i+" "+cnt);
		}
		System.out.println(cnt);
	}
}

