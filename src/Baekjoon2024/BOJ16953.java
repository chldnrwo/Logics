package Baekjoon2024;
import java.io.*;
import java.util.*;

public class BOJ16953 {
	static int a, b;
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		a = in.nextInt();
		b = in.nextInt();
		
		
		int cnt = 1;
	
		
		while(b != a) {
			if(b< a) {
				cnt = -1;
				break;
			}
			
			String s = String.valueOf(b);
			
			if(s.charAt(s.length()-1) != '1' && b%2 !=0) {
				cnt = -1;
				break;
			}
			
			if(b%2 == 0) {
				b/=2;
			}else {
				s = s.substring(0, s.length()-1);
				b = Integer.parseInt(s);
			}
			cnt++;
		}
		
		System.out.println(cnt);
		
	}
	
}