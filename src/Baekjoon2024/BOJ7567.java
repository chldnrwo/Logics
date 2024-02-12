package Baekjoon2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ7567{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		int cnt = 10;
		for(int i=0;i<s.length()-1;i++) {
			char a = s.charAt(i);
			char b = s.charAt(i+1);
			if(a == b) {
				cnt+=5;
			}else {
				cnt+=10;
			}
		}
		System.out.println(cnt);
	}
}

