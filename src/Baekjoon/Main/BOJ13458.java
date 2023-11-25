package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ13458{
	static Integer[][] res;
	static int[][] arr;
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		long n = in.nextLong();
		long[] arr = new long[(int)n];
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
		}
		
		int b = in.nextInt();
		int c = in.nextInt();
		
		long cnt = n;
		for(int i=0;i<n;i++) {
			Long tar = arr[i] - b;
			
			if(tar <= 0) {
				continue;
			}
			
			if(tar%c==0) {
				cnt += tar/c;
			}else {
				cnt += tar/c + 1;
			}
		}
		System.out.println(cnt);
	}

}

