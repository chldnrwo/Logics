package Baekjoon.Main;

import java.util.*;

public class BOJ30458{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		String s = in.next();
		int[] arr = new int[26];
		
		
		
		for(int i=0;i<n;i++) {
			if(n%2!=0 && i==n/2) {	
				continue;
			}
			arr[s.charAt(i) - 'a']++;
		}
		
		for(int i=0;i<26;i++) {
			if(arr[i]%2!=0) {
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
	}
	
}

