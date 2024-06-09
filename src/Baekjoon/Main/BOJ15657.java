package Baekjoon.Main;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class BOJ15657{
	static int n,m;
	static int[] arr;
	
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		m = in.nextInt();
		
		arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		d("", 0, 0);
		System.out.println(sb);
	}
	public static void d(String s,int last, int cnt) {
		
		if(cnt == m) {
			sb.append(s).append("\n");
			return;
		}		
		
		for(int i=0;i<n;i++) {
			if(last <= arr[i]) {
				d(s+arr[i]+" ",arr[i], cnt+1);
			}
		}
	}
}
