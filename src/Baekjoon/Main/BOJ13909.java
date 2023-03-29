package Baekjoon.Main;
import java.util.Scanner;

class BOJ13909{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
//		int cnt=0;
//		for(int i=1;i<=x;i++) {
//			if(ys(i)) {
//				cnt++;
//			}
//		}
//		System.out.println(cnt);
		int a = (int)Math.sqrt(x);
		System.out.println(a);
	}
	public static boolean ys(int a) {
		boolean x = false;
		for(int i=1;i*i<=a;i++) {
			if(i*i==a) {
				x = true;
			}
		}
		
		return x;
	}
}
/*

 */