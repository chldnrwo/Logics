package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ30617{
	public static void main(String[] args) throws Exception{
		//Scanner in = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		int cnt = 0;
		int rRight = 0;
		int rLeft = 0;
		
		
		for(int i=1;i<=n;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			
			if((a==-1 && b==-1)||(a==1 && b==1)) {
				cnt++;
			}
			
			if(i>=2) {
				if(rRight==a && a!=0) {
					cnt++;
				}
				if(rLeft==b && b!=0) {
					cnt++;
				}
			}
			rRight = a;
			rLeft = b;
		}
		
		System.out.println(cnt);
		
	}
	
}

