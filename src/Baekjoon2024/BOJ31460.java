package Baekjoon2024;
import java.io.*;
import java.util.*;

public class BOJ31460 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		StringBuilder sb;
		for(int i=0;i<t;i++) {
			int n = in.nextInt();
			
			if(n==1) {
				System.out.println(0);
				continue;
			}
			
			sb = new StringBuilder();
			sb.append(1);
			for(int j=0;j<n-2;j++) {
				sb.append(2);
			}
			sb.append(1);
			
			System.out.println(sb);
		}
		//11
		//121
		//1221
		//12221
		//수학문제
	}
}