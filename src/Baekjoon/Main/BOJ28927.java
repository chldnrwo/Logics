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

public class BOJ28927{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int a3 = in.nextInt();
		int b1 = in.nextInt();
		int b2 = in.nextInt();
		int b3 = in.nextInt();
		
		int res = (a1 * 3 + a2 * 20 + a3 * 120) - (b1 * 3 + b2 * 20 + b3 * 120);
		if(res == 0 ) {
			System.out.println("Draw");
		}else if(res > 0) {
			System.out.println("Max");
		}else {
			System.out.println("Mel");
		}
	}	
}
