package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ30889{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		char[][] arr = new char[10][20];
		for(int i=0;i<10;i++) {
			for(int j=0;j<20;j++) {
				arr[i][j] = '.';
			}
		}
		for(int i=0;i<n;i++) {
			String s = in.next();
			
			int a = s.charAt(0)-65;
			int b = Integer.parseInt(s.substring(1))-1;
			
			arr[a][b] = 'o';
		}
		
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<20;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}

