package Baekjoon.Main;
import java.util.Scanner;

class BOJ1007{
	static int N;
	static double result;
	static boolean[] check;
	static int[][] arr;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		for(int t=0;t<T;t++) {
			N = in.nextInt();
			result = Double.MAX_VALUE;
			check = new boolean[N];
			arr = new int[N][2];
			for(int i=0;i<N;i++) {
				arr[i][0]=in.nextInt();
				arr[i][1]=in.nextInt();
			}
			
			comb(0, N/2);
			
			System.out.println(result);
		}
	}
	public static void comb(int idx, int cnt) {
		if(cnt == 0) {
			result = Math.min(result, vector());
		}else {
			for(int i=idx;i<N;i++) {
				check[i] = true;
				
				comb(i+1, cnt-1);
				
				check[i] = false;
			}
		}
	}
	public static double vector() {
		int x = 0;
		int y = 0;
		
		for(int i = 0;i<N;i++) {
			if(check[i]) {
				x+=arr[i][0];
				y+=arr[i][1];
			}
			else {
				x-=arr[i][0];
				y-=arr[i][1];
			}
		}
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
}