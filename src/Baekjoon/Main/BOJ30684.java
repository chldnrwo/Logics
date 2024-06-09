package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ30684{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
	
		int n = in.nextInt();
		
		String[] arr = new String[n];
		for(int i=0;i<n;i++) {
			arr[i] = in.next();
		}
		
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			if(arr[i].length()==3) {
				System.out.println(arr[i]);
				System.exit(0);
			}
		}
		
	}
	
}

