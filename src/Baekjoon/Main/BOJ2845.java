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

public class BOJ2845{

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int l = in.nextInt();
		int p = in.nextInt();
		
		int sum = l*p;
		
		for(int i=0;i<5;i++) {
			int a = in.nextInt();
			System.out.print((a-sum)+" ");
		}
	}
	
}
