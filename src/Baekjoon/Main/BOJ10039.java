package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ10039{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int cnt = 0;
		for(int i=0;i<5;i++) {
			int n = in.nextInt();
			if(n<=40) {
				n = 40;
			}
			cnt +=n;
		}
		System.out.println(cnt/5);
	}
	
	
}

