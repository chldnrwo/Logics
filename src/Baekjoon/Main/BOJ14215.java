package Baekjoon.Main;
import java.util.Arrays;
import java.util.Scanner;

class BOJ14215{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		int[] arr = {a,b,c};
		Arrays.sort(arr);
		int sum;
		if(arr[0]+arr[1]<=arr[2]) {
			sum = (arr[0]+arr[1])*2-1;
		}else {
		sum = arr[0]+arr[1]+arr[2];
		}
		System.out.println(sum);
	}
}