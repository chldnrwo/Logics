package Baekjoon.Main;
import java.util.Scanner;

class BOJ24267 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		long n = in.nextLong();
		
//		int cnt = 0;
//		
//		for(int i=1;i<=n-2;i++) {
//			for(int j=i+1;j<=n-1;j++) {
//				for(int k=j+1;k<=n;k++) {
//					cnt++;
//				}
//			}
//		}
		Long result = n * (n-1) * (n-2) / 6;
		System.out.println(result);
		System.out.println(3);
		
	}
}
//직접돌리면 안된다
// 1~5 