package Baekjoon.Main;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class BOJ27959{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		
		n *= 100;
		
		if(n >= m) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
}
