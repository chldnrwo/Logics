package Baekjoon.Main;

import java.util.*;

public class BOJ30454{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int l = in.nextInt();
		int max = 0;
		int mxCnt = 0;
		for(int i=0;i<n;i++) {
			String s = in.next();
			StringBuilder sb = new StringBuilder(s);
			String s2 = sb.reverse().toString();
			int cnt = 0;
			int cnt2 = 0;
			for(int j=0;j<l-1;j++) {
				
				if(s.substring(j, j+2).equals("10")) {
					cnt++;
				}
				if(s2.substring(j, j+2).equals("10")) {
					cnt2++;
				}
				
			}
			if(s.charAt(s.length()-1) == '1') {
				cnt++;
			}
			if(s2.charAt(s2.length()-1) == '1') {
				cnt2++;
			}
			
			int res = Math.max(cnt, cnt2);
			//System.out.println(res);
			if(res > max) {
				max = res;
				mxCnt = 1;
			}else if(res == max) {
				mxCnt++;
			}
		}
		
		System.out.println(max+" "+mxCnt);
	}
	
}

