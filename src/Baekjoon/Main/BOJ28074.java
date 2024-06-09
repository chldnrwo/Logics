package Baekjoon.Main;
import java.util.*;
 
public class BOJ28074{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s  = in.next();
		boolean[] arr = new boolean[5];
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c == 'M') {
				arr[0] = true;
			}else if(c == 'O') {
				arr[1] = true;
			}else if(c == 'B') {
				arr[2] = true;
			}else if(c == 'I') {
				arr[3] = true;
			}else if(c == 'S') {
				arr[4] = true;
			}
		}
		
		for(int i=0;i<5;i++) {
			if(!arr[i]) {
				System.out.println("NO");
				System.exit(0);
			}
		}
		System.out.println("YES");
	}
}