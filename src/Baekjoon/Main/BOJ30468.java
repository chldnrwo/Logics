package Baekjoon.Main;

import java.util.*;

public class BOJ30468{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int str = in.nextInt();
		int dex = in.nextInt();
		int in2 = in.nextInt();
		int luk = in.nextInt();
		int n = in.nextInt();
		
		int sum = (str+dex+in2+luk)/4;
		if(sum < n) {
			System.out.println(n*4 - (str+dex+in2+luk));
		}else {
			System.out.println(0);
		}
	}
	
}

