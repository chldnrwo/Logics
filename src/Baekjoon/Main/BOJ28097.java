package Baekjoon.Main;
import java.util.*;
 
public class BOJ28097{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum+=in.nextInt();
		}
		sum += (n-1) * 8;
		
		int a = sum/24;
		int b = sum%24;
		
		System.out.println(a+" "+b);
	}
}