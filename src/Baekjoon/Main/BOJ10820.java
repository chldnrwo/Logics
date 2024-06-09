package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ10820{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()) {
			String s = in.nextLine();
			int small = 0;
			int big = 0;
			int num =0;
			int space =0;
			
			for(int i=0;i<s.length();i++) {
				char c = s.charAt(i);
				if(48<=c && c<=57) {
					num++;
				}else if(97<=c && c<=122) {
					small++;
				}else if(65<=c && c<=90) {
					big++;
				}else if(c == ' ') {
					space++;
				}
			}
			
			System.out.println(small+" "+big+" "+num+" "+space);
		}
		
	}
	
	
}

