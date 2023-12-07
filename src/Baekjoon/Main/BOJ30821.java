package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ30821{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int res = 1;
		for(int i=1;i<=5;i++) {
			res *= n;
			res /= i;
			n--;
		}
		System.out.println(res);
	}
	
	
}

