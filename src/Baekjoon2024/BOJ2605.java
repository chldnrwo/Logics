package Baekjoon2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ2605{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		Stack<Integer> st = new Stack<>();
		Stack<Integer> st2 = new Stack<>();
		
		
		for(int i=1;i<=n;i++) {
			//System.out.println(st.toString());
			int a = in.nextInt();
			if(a==0) {
				st.push(i);
			}else {
				for(int j=0;j<a;j++) {
					int b = st.pop();
					st2.push(b);
				}
				st.push(i);
				while(!st2.isEmpty()) {
					st.push(st2.pop());
				}
			}
			
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<st.size();i++) {
			System.out.print(st.get(i)+" ");
		}
	}
}

