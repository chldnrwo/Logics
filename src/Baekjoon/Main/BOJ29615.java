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

public class BOJ29615{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
		}
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<m;i++) {
			int a = in.nextInt();
			list.add(a);
		}
		int cnt = 0;
		
		for(int i=0;i<m;i++) {
			if(!list.contains(arr[i])) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
}
