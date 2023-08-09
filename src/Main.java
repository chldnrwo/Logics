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

public class Main{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		Deque<Integer> q = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<t;i++) {
			int n = in.nextInt();
			
			if(n == 1) {
				q.addFirst(in.nextInt());
			}else if(n == 2) {
				q.addLast(in.nextInt());
			}else if(n==3) {
				if(q.isEmpty()) {
					sb.append(-1).append("\n");
				}else{
					sb.append(q.pollFirst()).append("\n");
				}
			}else if(n==4) {
				if(q.isEmpty()) {
					sb.append(-1).append("\n");
				}else{
					sb.append(q.pollLast()).append("\n");
				}
			}else if(n==5) {
				sb.append(q.size()).append("\n");
			}else if(n==6) {
				if(q.isEmpty()) {
					sb.append(1).append("\n");
				}else {
					sb.append(0).append("\n");
				}
			}else if(n==7) {
				if(q.isEmpty()) {
					sb.append(-1).append("\n");
				}else{
					sb.append(q.peekFirst()).append("\n");
				}
			}else if(n==8) {
				if(q.isEmpty()) {
					sb.append(-1).append("\n");
				}else{
					sb.append(q.peekLast()).append("\n");
				}
			}
		}
				
			System.out.println(sb);
		
	
	}	
}
