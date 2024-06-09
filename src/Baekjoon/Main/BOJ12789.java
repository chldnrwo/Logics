package Baekjoon.Main;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class BOJ12789{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			int a = in.nextInt();
			arr[i] = a;
		}
		Stack<Integer> stack = new Stack<>();
		int cnt = 1;
		for(int i=0;i<n;i++) {	
			
			int a = arr[i];
			
			if(cnt == a) {
				cnt++;
			}else{
				if(!stack.isEmpty() && (cnt == stack.peek())){
					cnt++;
					i--;
					stack.pop();
				}else {
					stack.push(a);
				}
			}
		}
		while(!stack.isEmpty()) {
			int st = stack.pop();
			if(cnt == st) {
				cnt++;
			}else {
				System.out.println("Sad");
				System.exit(0);
			}
		}
		
		System.out.println("Nice");
		
		
		
	}	
}
