package Baekjoon.Main;
import java.util.Arrays;
import java.util.Scanner;

class BOJ1026{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		int[] A = new int[N];
		int[] B = new int[N];
		
		for(int i=0;i<N;i++) {
			A[i]=in.nextInt();
		}
		for(int i=0;i<N;i++) {
			B[i]=in.nextInt();
		}
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		//System.out.println(Arrays.toString(A));
		//System.out.println(Arrays.toString(B));
		int sum=0;
		for(int i=0;i<N;i++){
			sum+=A[i] * B[N-1-i];
		}
		System.out.println(sum);
	}
}
//가장 낮은수랑 매칭해야됨