package Baekjoon.Main;
import java.util.Scanner;

class BOJ1009{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int T = in.nextInt();
		
		for(int i=0;i<T;i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			int res = 1;
			
			for(int j=1;j<=b;j++) {
				res = res * a %10;
			}
			if(res==0) {
				res = 10;
			}
			sb.append(res).append("\n");
		}
		
		System.out.println(sb);
	}

}