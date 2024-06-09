package Baekjoon.Main;

import java.util.*;

public class BOJ30425{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		String s = in.next();
		
		int min = n;
		
		for(int i=1;i<n;i++) {
			boolean re = true;
			for(int j=0;j<n-i;j++) {
				if(s.charAt(j) != s.charAt(j + i)) {
					re = false;
					break;
				}
			}
			if(re) {
				min = i;
				break;
			}
		}
		System.out.println((n-1)/min+1);
	}
	
}

