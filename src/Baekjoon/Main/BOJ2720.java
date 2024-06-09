package Baekjoon.Main;
import java.util.Arrays;
import java.util.Scanner;

class BOJ2720{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int a = in.nextInt();
		for(int i=0;i<a;i++) {
			int x = in.nextInt();
			int q = x/25;
			x %=25;
			int d = x/10;
			x %= 10;
			int n = x/5;
			x %= 5;
			int p = x/1;
			sb.append(q+" "+d+" "+n+" "+p).append("\n");
			
		}
		System.out.println(sb);
	}
}