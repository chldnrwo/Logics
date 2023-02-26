package Baekjoon.Main;

import java.util.Scanner;

//백준 10798 세로읽기
//2차원 배열

class BOJ10798{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		char[][] arr = new char[5][15];
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<15;j++) {
				arr[i][j] = '-';
			}
		}
		
		for(int t=0;t<5;t++) {
			String str = in.next();
			for(int i=0;i<str.length();i++) {
				char a = str.charAt(i);
				arr[t][i] = a;
			}
		}
		
		for(int i=0;i<15;i++) {
			for(int j=0;j<5;j++) {
				if(arr[j][i]=='-') {
				continue;
				}
				sb.append(arr[j][i]);
				
			}
		}
		System.out.println(sb);
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<15;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
	}
}