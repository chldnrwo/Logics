package Baekjoon.Main;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class BOJ28278{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int t = in.nextInt();
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<t;i++) {
			int n = in.nextInt();
			
			if(n == 1) {
				int num = in.nextInt();
				stack.push(num);
			}else if(n == 2) {
				if(!stack.isEmpty()) {
					sb.append(stack.pop()).append("\n");
				}else{
					sb.append(-1).append("\n");
				}
				
			}else if(n == 3) {
				sb.append(stack.size()).append("\n");
			}else if(n == 4) {
				if(!stack.isEmpty()) {
					sb.append(0).append("\n");
				}else{
					sb.append(1).append("\n");
				}
			}else if(n == 5) {
				if(!stack.isEmpty()) {
					sb.append(stack.peek()).append("\n");
				}else{
					sb.append(-1).append("\n");
				}
			}
		}
		System.out.println(sb);
	}	
}
