package Baekjoon2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ31428{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		String[] str = new String[n];
		for(int i=0;i<n;i++) {
			String s = in.next();
			str[i] = s;
		}
		String b = in.next();
		int  cnt = 0;
		for(int i=0;i<n;i++) {
			if(str[i].equals(b)) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}

