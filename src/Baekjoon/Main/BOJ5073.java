package Baekjoon.Main;
import java.util.Arrays;
import java.util.Scanner;

class BOJ5073{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			
			if(a==0&&b==0&&c==0) {
				break;
			}
			
			int[] arr = {a,b,c};
			Arrays.sort(arr);
			
			if(arr[0]+arr[1]<=arr[2]) {
				sb.append("Invalid").append("\n");
			}else if(a==b&&b==c&&c==a) {
				sb.append("Equilateral").append("\n");
			}else if(a==b||b==c||c==a) {
				sb.append("Isosceles").append("\n");
			}else {
				sb.append("Scalene").append("\n");
			}
			
		}
		System.out.println(sb);
	}
}