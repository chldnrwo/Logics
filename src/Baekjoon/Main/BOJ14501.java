package Baekjoon.Main;
import java.util.*;

public class BOJ14501{
	static int[] arr;
	static int[] arr2;
	static int[] darr;
	static int n;
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		//브루트포스 필요
		//dp사용
		arr = new int[n+1];
		arr2 = new int[n+1];
		darr = new int[n+1];
		
		for(int i=1;i<=n;i++) {
			arr[i] = in.nextInt();
			arr2[i] = in.nextInt();
		}
		for(int i=1;i<=n;i++) {
			dp(i);
		}
		System.out.println(darr[darr.length-1]);
	}
	public static void dp(int i) {
		int idx = arr[i];
		int val = arr2[i];
		
		if((idx+i-1)<=n) {
			darr[idx+i-1] = Math.max(darr[idx+i-1], darr[i-1]+val);
		}
		
		darr[i] = Math.max(darr[i], darr[i-1]);
		 
	}
	
}

