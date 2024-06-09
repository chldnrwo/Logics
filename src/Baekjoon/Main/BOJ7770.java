package Baekjoon.Main;
import java.util.*;

public class BOJ7770{
	static Integer[] arr;
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		// 1 6 19 46
		// 5 13 26
		//  8 12
		
		int n = in.nextInt();
		
		int a = 1;
		int b = 1;
		int cnt = 1;
		while(true) {
			if(a>n) {
				break;
			}
			b+=4 * cnt;
			a+=b;
			cnt++;
		}
		
		System.out.println(cnt-1);
	}
	
}

