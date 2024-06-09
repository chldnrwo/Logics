package Baekjoon.Main;
import java.util.Scanner;

class BOJ1049{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
		
		int[][] arr = new int[M][2];
		
		int min6 = Integer.MAX_VALUE;
		int min1 = Integer.MAX_VALUE;
		for(int i=0;i<M;i++) {
			arr[i][0] = in.nextInt();
			arr[i][1] = in.nextInt();
			
			if(min6 > arr[i][0]){
				min6 = arr[i][0];
			}
			if(min1 > arr[i][1]){
				min1 = arr[i][1];
			}
		}
		
		//System.out.println(min6+" "+min1);
		
		int A;
		int B1 = N/6;
		int B2 = N%6;
		if(N%6==0) {
			A = N/6;
		}else {
			A = N/6+1;
		}
		
		int result = Math.min(A * min6, B1 * min6 + B2 * min1);
		result = Math.min(result, N * min1);
		System.out.println(result);
	}
}