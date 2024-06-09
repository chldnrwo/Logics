package Baekjoon2024;
import java.io.*;
import java.util.*;

public class BOJ18111 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int inv = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][m];
		int min = Integer.MAX_VALUE;
		int max = -1;
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<m;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				//min = Math.min(min, arr[i][j]);
				//max = Math.max(max, arr[i][j]);
			}
		}
		int res = Integer.MAX_VALUE;
		int floor = 0;
				
		for(int t=0;t<257;t++) {
			int use = 0;
			int take = 0;
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(arr[i][j] > t) {
						take += arr[i][j] - t;
					}else {
						use += t - arr[i][j];
					}
				}
			}
			
			if(use > take+inv) {
				continue;
			}
			
			int cnt = take*2 + use;
			
			if(cnt <= res) {
				res = cnt;
				floor = t;
			}
		}
		
		
		System.out.println(res+" "+floor);
	
		
			
	}
	
}