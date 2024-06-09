package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ30642{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		String m = in.next();
		int k = in.nextInt();
		
		
		if(m.equals("induck")) {
			if(k%2==0) {
				System.out.println(k);
			}else {
				if(k+1 > n) {
					System.out.println(k-1);
				}else {
					System.out.println(k+1);
				}
				
			}
		}else {
			if(k%2==0) {
				if(k+1 > n) {
					System.out.println(k-1);
				}else {
					System.out.println(k+1);
				}
			}else {
				System.out.println(k);
			}
		}
	}
	
}

