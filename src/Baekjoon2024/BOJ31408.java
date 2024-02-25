package Baekjoon2024;
import java.io.*;
import java.util.*;

public class BOJ31408 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		//int[] arr = new int[n];
		int[] arr2 = new int[100001];
		for(int i=0;i<n;i++) {
			int a = in.nextInt();
			arr2[a]++;
		}
		int max = 0;
		
		for(int i=0;i<100001;i++) {
			if(arr2[i] > max) {
				max = arr2[i];
			}
		}
		if((n-max) >= (max-1)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}
}