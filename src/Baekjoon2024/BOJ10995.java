package Baekjoon2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ10995{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		
		int n = in.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
				if(i%2==0) {
					System.out.print("* ");
				}else {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}
}

