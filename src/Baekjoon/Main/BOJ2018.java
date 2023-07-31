package Baekjoon.Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ2018 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int cnt = 0;
		
		for(int i=1;i*(i-1)/2 < n;i++) {
			int a = (n - i * (i-1)/2)/i;
			if(a * i + i * (i-1)/2 == n) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}