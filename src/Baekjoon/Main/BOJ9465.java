package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ9465{
	static Integer[][] res;
	static int[][] arr;
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int n = Integer.parseInt(st.nextToken()); 
		
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(bf.readLine());
			int m = Integer.parseInt(st.nextToken()); 
			arr = new int[2][100001];
			res = new Integer[2][100001];
			
			for(int j=0;j<2;j++) {
				st = new StringTokenizer(bf.readLine());
				for(int k=1;k<=m;k++) {
					arr[j][k] = Integer.parseInt(st.nextToken()); 
				}
			}
			
			res[0][0]=0;
			res[1][0]=0;
			res[0][1]=arr[0][1];
			res[1][1]=arr[1][1];
			
			for(int j=2;j<=m;j++) {
				res[0][j] = Math.max(res[1][j-1], res[1][j-2]) + arr[0][j];
				res[1][j] = Math.max(res[0][j-1], res[0][j-2]) + arr[1][j];
			}
			
//			for(int j=0;j<2;j++) {
//				for(int k=0;k<m;k++) {
//					System.out.print(res[j][k]+ " ");
//				}
//				System.out.println();
//			}
			
			System.out.println(Math.max(res[0][m], res[1][m]));
		}
		
	}

}

