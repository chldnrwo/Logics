package Baekjoon.Main;
import java.util.*;

public class BOJ30045{

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int cnt = 0;
		for(int i=0;i<n;i++) {
			String s = in.next();
			for(int j=0;j<s.length()-1;j++) {
				String s2 = s.substring(j,j+2);
				if(s2.equals("01") || s2.equals("OI")) {
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
	}
	
}

