package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ3986{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		
		int n = in.nextInt();
		
		
		int cnt = 0;
		for(int i=0;i<n;i++) {
			Stack<Character> stack = new Stack<>();
			
			String s = in.next();
			
			for(int j=0;j<s.length();j++) {
			
				if(stack.isEmpty()) {
					stack.add(s.charAt(j));
				}else if(stack.peek() == s.charAt(j)) {
					stack.pop();
				}else {
					stack.add(s.charAt(j));
				}
			}
			
			if(stack.size()<1) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	
}

