package Baekjoon.Main;
import java.util.Scanner;

class BOJ24723{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = (int) Math.pow(2, a);
		System.out.println(b);
	}
}