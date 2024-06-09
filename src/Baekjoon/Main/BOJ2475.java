package Baekjoon.Main;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class BOJ2475{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		int[] arr = new int[5];
		for(int i=0;i<5;i++) {
			arr[i] = in.nextInt();
		}
		int sum = 0;
		for(int i=0;i<5;i++) {
			int a = (int) Math.pow(arr[i], 2);
			sum+=a;
		}
		sum = sum%10;
		
		System.out.println(sum);
		
	}
}
