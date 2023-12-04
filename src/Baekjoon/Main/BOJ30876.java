package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ30876{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int souX = 0;
		int souY = Integer.MAX_VALUE;
				
		
		for(int i=0;i<n;i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			if(b<souY) {
				souX = a;
				souY = b;
			}
			
			
			
		}
		System.out.println(souX +" "+ souY);
	}

}

