package Baekjoon.Main;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class BOJ28455{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		int sumL = 0;
		int sumA = 0;
		int cnt = 0;
		while(true) {
			//System.out.println(n+" "+cnt);
			if(cnt == n || cnt == 42) {
				break;
			}
			
			int level = arr[n-1-cnt];
			sumL+=level;
			if(250<=level) {
				sumA+=5;
			}else if(200<=level) {
				sumA+=4;
			}else if(140<=level) {
				sumA+=3;
			}else if(100<=level) {
				sumA+=2;
			}else if(60<=level) {
				sumA+=1;
			}
			cnt++;
		}
		
		
		
		System.out.println(sumL+" "+sumA);
	}	
}
/*
0 1 -3
2 3 -1
 
 */