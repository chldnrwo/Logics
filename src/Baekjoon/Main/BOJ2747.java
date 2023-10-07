package Baekjoon.Main;
import java.util.*;

public class BOJ2747{
	static Integer[] arr;
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		arr = new Integer[n+1];
		arr[0] = 1;
		arr[1] = 1;
		
		
		System.out.println(dp(n-1));
	}
	public static int dp(int n) {
		
		if(arr[n]!=null) {
			return arr[n];
			
		}
		arr[n] =  dp(n-1) + dp(n-2);
		return arr[n];
	}
	
}

