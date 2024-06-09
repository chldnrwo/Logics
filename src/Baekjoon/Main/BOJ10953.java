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

public class BOJ10953{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		
		for(int i=0;i<n;i++) {
			String s = in.next();
			
			
			int a = Integer.parseInt(s.substring(0,1));
			int b = Integer.parseInt(s.substring(2));
			System.out.println(a+b);
		}
	}
}
