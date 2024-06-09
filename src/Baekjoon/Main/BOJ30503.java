package Baekjoon.Main;

import java.util.*;

public class BOJ30503{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] arr = new int[n+1];
		for(int i=1;i<=n;i++) {
			arr[i] = in.nextInt();
		}
		int m = in.nextInt();
				
		for(int i=0;i<m;i++) {
			int a = in.nextInt();
			if(a==1) {
				int b =in.nextInt();
				int c =in.nextInt();
				int d =in.nextInt();
				int cnt = 0;
				for(int j=b;j<=c;j++) {
					if(arr[j]==d) {
						cnt++;
					}
				}
				System.out.println(cnt);
			}else if(a==2) {
				int b =in.nextInt();
				int c =in.nextInt();
				for(int j=b;j<=c;j++) {
					arr[j] = 0;
				}
			}
		}
	}
	
}

