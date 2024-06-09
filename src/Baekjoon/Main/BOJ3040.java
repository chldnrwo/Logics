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

public class BOJ3040{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int[] arr = new int[9];
		boolean[] check = new boolean[9];
		int sum = 0;
		for(int i=0;i<9;i++) {
			arr[i] = in.nextInt();
			sum += arr[i];
		}
		
		sum -= 100;
		
		for(int i=0;i<9;i++) {
			for(int j=i+1;j<9;j++) {
				if(arr[i] + arr[j] == sum) {
					check[i] = true;
					check[j] = true;
				}
			}
		}
		
		for(int i=0;i<9;i++) {
			if(!check[i]) {
				System.out.println(arr[i]);
			}
		}
	}	
}
/*
0 1 -3
2 3 -1
 
 */