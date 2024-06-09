package Baekjoon2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ10448{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		
		int n = in.nextInt();
		boolean[] arr = new boolean[4000];
		int[] arr2 = new int[51]; 
		
		for(int i=0;i<51;i++) {
			arr2[i] = (i*i+i)/2;
		}
		
		
		for(int i=1;i<51;i++) {
			for(int j=1;j<51;j++) {
				for(int k=1;k<51;k++) {
					int a = arr2[i]+arr2[j]+arr2[k];
					arr[a] = true;
				}
			}
		}
		
		
		
		
		for(int i=0;i<n;i++) {
			int a = in.nextInt();
			if(arr[a] == true) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
	}
}

