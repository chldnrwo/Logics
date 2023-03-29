package Baekjoon.Main;
import java.util.Scanner;

class BOJ6603{
	static int[] arr;
	static int[] arrS = new int[6];
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			int a = in.nextInt();
			if(a==0) {
				break;
			}
			
			arr = new int[a];
			for(int i=0;i<a;i++) {
				arr[i] = in.nextInt();
			}
			
			bt(0, 0);
			sb.append("\n");
		}
		System.out.println(sb);
	}
	public static void bt(int depth, int start) {
		if(depth==6) {
			for(int i=0;i<6;i++) {
				sb.append(arrS[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=start;i<arr.length;i++) {
			arrS[depth] = arr[i];
			bt(depth+1, i+1);
		}
	}
}