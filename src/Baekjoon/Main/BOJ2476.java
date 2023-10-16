package Baekjoon.Main;
import java.util.*;

public class BOJ2476{
	static Integer[] arr;
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int res = 0;
		for(int i=0;i<n;i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int sum = 0;
			if(a==b && b==c) {
				sum = 10000 + a * 1000;
			}else if(a==b || c==a) {
				sum = 1000 + a*100;
			}else if(b==c){
				sum = 1000 + b * 100;
			}else {
				sum = Math.max(a, Math.max(b, c)) * 100;
			}
			
			
			if(sum>res) {
				res = sum;
			}
		}
		System.out.println(res);
	}
	
}

