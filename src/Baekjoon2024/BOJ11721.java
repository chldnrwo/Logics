package Baekjoon2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ11721{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		
		for(int i=0;i<s.length();i+=10) {
			
			String s2;
			if(i+10 > s.length()) {
				s2 = s.substring(i);
			}else {
				s2 = s.substring(i,i+10);
			}
			
			System.out.println(s2);
		}
	}
}

