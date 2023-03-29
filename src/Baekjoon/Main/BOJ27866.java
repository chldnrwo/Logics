package Baekjoon.Main;
import java.util.Scanner;

class BOJ27866{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String S = in.next();
		int i = in.nextInt();
		
		System.out.println(S.charAt(i-1));
	}
}