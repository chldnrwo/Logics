package Baekjoon2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ31090{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for(int i=0;i<n;i++){
			float a = in.nextInt();
			
			float b = a%100;
			
			//System.out.println(a+" "+b);
			
			if((a+1)%b == 0) {
				System.out.println("Good");
			}else {
				System.out.println("Bye");
			}
		}
		
		
		
	}
}

