package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ4158{
	public static void main(String[] args) throws Exception{
		//Scanner in = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int cnt = 0;
			if(n==0 && m==0) {
				break;
			}
			
			Set<Integer> set = new HashSet<>();
			for(int i=0;i<n;i++) {
				st = new StringTokenizer(bf.readLine());
				int a = Integer.parseInt(st.nextToken());
				set.add(a);
			}
			
			for(int i=0;i<m;i++) {
				st = new StringTokenizer(bf.readLine());
				int a = Integer.parseInt(st.nextToken());
				if(set.contains(a)) {
					cnt++;
				}
			}
			System.out.println(cnt);
			
		}
		
	}

}

