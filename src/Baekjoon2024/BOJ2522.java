package Baekjoon2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ2522{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		
		int n = in.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=n;j>i+1;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(" ");
			}
			for(int j=n;j>i+1;j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}

