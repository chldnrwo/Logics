package Baekjoon.Main;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class BOJ15654{
	static int n,m;
	static int[] arr;
	static boolean[] visit;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		m = in.nextInt();
		
		arr = new int[n];
		visit = new boolean[n];
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		d("",0);
		System.out.println(sb);
	}
	public static void d(String s, int cnt) {
		
		if(cnt == m) {
			sb.append(s).append("\n");
			return;
		}		
		
		for(int i=0;i<n;i++) {
			if(!visit[i]) {
				visit[i] = true;
				d(s+arr[i]+" ", cnt+1);
				visit[i] = false;
			}
		}
	}
}
