package Baekjoon.Main;
import java.util.Scanner;

class BOJ1225{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String a = in.next();
		String b = in.next();
		
		
		long sum = 0;
		for(int i=0;i<a.length();i++) {
			long a1 = a.charAt(i) - '0';
			for(int j=0;j<b.length();j++) {
				long b1 = b.charAt(j) - '0';
				sum+=a1*b1;
			}
		}
		System.out.println(sum);
		
		
	}
}