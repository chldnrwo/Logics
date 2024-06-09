package Baekjoon2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ10102{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		
		int n = in.nextInt();
		
		String s= in.next();
		int cnt=0;
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			if(c=='A') {
				cnt++;
			}
		}
		
		
		if(cnt*2 > n) {
			System.out.println("A");
		}else if(cnt*2 == n) {
			System.out.println("Tie");
		}else {
			System.out.println("B");
		}
	}
}

