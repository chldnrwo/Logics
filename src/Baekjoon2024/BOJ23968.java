package Baekjoon2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ23968{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n =in.nextInt();
		int m = in.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
		}
	
		int cnt = 0;
		while(true) {
			int z = cnt;
			
			for(int i=0;i<n-1;i++) {
				if(arr[i] > arr[i+1]) {
					int tmp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = tmp;
					cnt++;
				}
				if(cnt == m) {
					if(arr[i]>arr[i+1]) {
						System.out.println(arr[i+1] +" "+ arr[i]);
					}else {
						System.out.println(arr[i] +" "+ arr[i+1]);
					}
					System.exit(0);
				}
			}
			if(z == cnt) {
				System.out.println(-1);
				System.exit(0);
			}
		}
	}
}

