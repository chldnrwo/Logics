package Baekjoon.Main;
import java.util.Scanner;

class BOJ27433{
	static long sum = 1;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		long a = in.nextLong();
		
		d(a);
		System.out.println(sum);
	}
	
	public static void d(long a) {
		
		if(a==0) {
			return;
		}
		
		sum *= a;
		d(a-1);
	}
}