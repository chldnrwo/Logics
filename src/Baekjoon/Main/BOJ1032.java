package Baekjoon.Main;

import java.util.Scanner;

public class BOJ1032 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		String str = in.next();
		
		char[] arr = new char[str.length()];
		for(int i=0;i<str.length();i++) {
			arr[i] = str.charAt(i);
		}
		
		for(int i=0;i<n-1;i++) {
			String str2 = in.next();
			
			for(int j=0;j<str.length();j++) {
				String a = str.substring(j,j+1);
				String b = str2.substring(j,j+1);
				
				if(!a.equals(b)) {
					arr[j]='?';
				}
			}
			
		}
		
		for(int i=0;i<str.length();i++) {
			System.out.print(arr[i]);
		}
	}
}
