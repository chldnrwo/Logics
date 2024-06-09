package Baekjoon.Main;
import java.util.Scanner;

class BOJ9063{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		int maxX = Integer.MIN_VALUE;
		int maxY = Integer.MIN_VALUE;
		int minX = Integer.MAX_VALUE;
		int minY = Integer.MAX_VALUE;
		
		for(int i=0;i<t;i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			if(maxX <= a) {
				maxX = a;
			}
			if(maxY <= b) {
				maxY = b;
			}
			
			if(minX >= a) {
				minX = a;
			}
			if(minY >= b) {
				minY = b;
			}
		}
		
		int result = (maxX - minX) * (maxY - minY);
		System.out.println(result);
	}
}