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

public class BOJ28444{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int h = in.nextInt();
		int i = in.nextInt();
		int a = in.nextInt();
		int r = in.nextInt();
		int c = in.nextInt();
		
		System.out.println(h*i - a*r*c);
		
	}	
}
/*
0 1 -3
2 3 -1
 
 */