package Baekjoon2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ5355{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		
		int n = in.nextInt();
		for(int i=0;i<n;i++) {
			double a = in.nextDouble();
			String s = in.nextLine();
			
			for(int j=0;j<s.length();j++) {
				char b = s.charAt(j);
				if(b == '@') {
					a*=3;
				}else if(b == '%') {
					a+=5;
				}else if(b == '#') {
					a-=7;
				}
			}
			
			System.out.println(String.format("%.2f", a));
		}
	}
}

