package Baekjoon.Main;

import java.util.Scanner;

public class BOJ2501 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int K = in.nextInt();
		int cnt = 0;
		
		for(int i=1;i<=N;i++) {
			if(N%i==0) {
				cnt++;
			}
			if(cnt==K) {
				System.out.println(i);
				System.exit(0);
			}
		}
		System.out.println(0);
	}
}
