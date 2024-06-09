package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ30803{
	public static void main(String[] args) throws Exception{
		//Scanner in = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		boolean[] barr = new boolean[n];
		long res =0;
		st = new StringTokenizer(bf.readLine());
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			res+=arr[i];
		}
		st = new StringTokenizer(bf.readLine());
		int m = Integer.parseInt(st.nextToken());
		sb.append(res).append("\n");
		
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			if(a==1) {
				int b = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				if(!barr[b-1]) {
					res += (c - arr[b-1]); 
				}
				
				arr[b-1] = c;
				
			}else if(a==2) {
				int b = Integer.parseInt(st.nextToken());
				
				if(!barr[b-1]) {
					res -= arr[b-1];
				}else {
					res += arr[b-1];
				}
				
				barr[b-1] = !barr[b-1];
			}
			
			
			sb.append(res).append("\n");
		}
		System.out.println(sb);
	}

}

