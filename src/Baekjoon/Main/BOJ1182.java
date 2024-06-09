package Baekjoon.Main;
import java.util.Arrays;
import java.util.Scanner;

class BOJ1182{
	static int[] arr;
	
	static int cnt,N,S;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		N = in.nextInt();
		S = in.nextInt();
		
		cnt = 0;
		arr = new int[N];
		
		for(int i = 0;i<N;i++) {
			arr[i] = in.nextInt();
		}
		
		bt(0, 0);
		if(S==0) cnt--;
		System.out.println(cnt);
	}
	
	public static void bt(int depth, int num) {	
		
		if(depth == N) {
			if(num == S) {
				cnt++;
			}
			return;
		}
		
		bt(depth+1, num);
		bt(depth+1, num+arr[depth]);
	}
}