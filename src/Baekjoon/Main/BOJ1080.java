package Baekjoon.Main;
import java.util.Arrays;
import java.util.Scanner;

class BOJ1080{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		
		int[][] A = new int[n][m];
		int[][] B = new int[n][m];
		
		for(int i=0;i<n;i++) {
			String s = in.next();
			for(int j=0;j<m;j++) {
				A[i][j] = s.charAt(j)-48;
			}
		}

		for(int i=0;i<n;i++) {
			String s = in.next();
			for(int j=0;j<m;j++) {
				B[i][j] = s.charAt(j)-48;
			}
		}
		
		int cnt = 0;
		for(int i=0;i<n-2;i++) {
			for(int j=0;j<m-2;j++) {
				//System.out.println(A[i][j]+" "+B[i][j]);
				if(A[i][j] != B[i][j]) {
					
					cnt++;
					for(int k=i;k<i+3;k++) {
						for(int l=j;l<j+3;l++) {
							if(A[k][l]==0) {
								A[k][l]=1;
							}else {
								A[k][l]=0;
							}
						}
					}
					
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(A[i][j] != B[i][j]) {
					System.out.println(-1);
					return;
				}
			}
		}
		System.out.println(cnt);
	}
}