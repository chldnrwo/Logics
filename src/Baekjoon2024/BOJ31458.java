package Baekjoon2024;
import java.io.*;
import java.util.*;

public class BOJ31458 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		
		for(int i=0;i<n;i++) {
			
			boolean b;
			String s = in.next();
	
			String s1, s2, s3;
			int res;
			for(int j=0;j<s.length();j++) {
				char c = s.charAt(j);
				if(c == '0' || c == '1') {
					s1 = s.substring(0, j);
					s2 = s.substring(j, j+1);
					s3 = s.substring(j+1);
					res = Integer.valueOf(s2);
					
					if(s3.length()>0) {
						res = 1;
					}
					
					if(s1.length()%2!=0) {
						if(res==1) {
							res = 0;
						}else {
							res = 1;
						}
					}
					System.out.println(res);
				}
			}
			
			
			
		}
		
	}
}