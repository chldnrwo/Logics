package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ30501{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for(int i=0;i<n;i++) {
			String s= in.next();
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j)=='S') {
					System.out.println(s);
					System.exit(0);
				}
			}
		}
	}
	
}

