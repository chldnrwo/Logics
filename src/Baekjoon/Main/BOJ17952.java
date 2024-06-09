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

public class BOJ17952{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int term = in.nextInt();
		Stack<Pair> stack = new Stack();
		int sum = 0;
		
		for(int i=0;i<term;i++) {
			int n = in.nextInt();
			Pair p = null;
			
			if(n == 1) {
				int a = in.nextInt();
				int t = in.nextInt();
				t--;
				p = new Pair(a,t);
				stack.push(p);
				
			}else {
				if(!stack.isEmpty()) {
					p = stack.peek();
					p.b--;
				}
			}
			
			if(!stack.isEmpty() && p.b == 0) {
				
				sum += p.a;
				stack.pop();
			}
		}
		
		
		System.out.println(sum);
	}
	static class Pair {
	    int a;
	    int b;

	    Pair(int a, int b) {
	        this.a = a;
	        this.b = b;
	    }
	}
}
