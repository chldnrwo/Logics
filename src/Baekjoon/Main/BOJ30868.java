package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ30868{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for(int i=0;i<n;i++) {
			int a = in.nextInt();
			int b = a/5;
			int c = a%5;
			for(int j=0;j<b;j++) {
				System.out.print("++++ ");
			}
			for(int j=0;j<c;j++) {
				System.out.print("|");
			}
			System.out.println();
		}
	}

}

