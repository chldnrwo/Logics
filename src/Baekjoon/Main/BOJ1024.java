package Baekjoon.Main;
import java.util.Arrays;
import java.util.Scanner;

class BOJ1024{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int L = in.nextInt();
		int[] arr;
		while(true) {
			int a = N - (L * (L-1) / 2);
			
			if(a%L == 0) {
//				System.out.println(a);
//				System.out.println(L);
				arr = new int[L];
				for(int i=0;i<L;i++) {
					arr[i] = i+a/L;
					if(a/L<0 || 100<L) {
						System.out.println(-1);
						System.exit(0);
					}
				}
				break;
			}
			
			L++;
		}
		
		for(int A : arr) {
			System.out.print(A+" ");
		}
	}
}