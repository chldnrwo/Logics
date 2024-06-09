package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ30700{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
	
		String s = in.next();
		
		int cnt = 0;
		int i = 0;
		
		while(i<s.length()) {
			for(;i<s.length();i++) {
				if(s.charAt(i) == 'K') {
					cnt++;
					break;
				}
			}
			for(;i<s.length();i++) {
				if(s.charAt(i) == 'O') {
					cnt++;
					break;
				}
			}
			for(;i<s.length();i++) {
				if(s.charAt(i) == 'R') {
					cnt++;
					break;
				}
			}
			for(;i<s.length();i++) {
				if(s.charAt(i) == 'E') {
					cnt++;
					break;
				}
			}
			for(;i<s.length();i++) {
				if(s.charAt(i) == 'A') {
					cnt++;
					break;
				}
			}
		}
		
		
		
		System.out.println(cnt);
	}
	
}

