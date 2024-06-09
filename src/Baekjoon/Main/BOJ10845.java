package Baekjoon.Main;
import java.util.*;
 
public class BOJ10845{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Deque<Integer> q = new LinkedList<>();
		int n = in.nextInt();
		
		for(int i=0;i<n;i++) {
			String s = in.next();
			
			if(s.equals("push")) {
				int n1 = in.nextInt();
				q.offer(n1);
			}else if(s.equals("front")) {
				if(q.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(q.peekFirst()).append("\n");
				}
			}else if(s.equals("back")) {
				if(q.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(q.peekLast()).append("\n");
				}
			}else if(s.equals("size")) {
				sb.append(q.size()).append("\n");
			}else if(s.equals("empty")) {
				if(q.isEmpty()) {
					sb.append(1).append("\n");
				}else {
					sb.append(0).append("\n");
				}
			}else if(s.equals("pop")) {
				if(q.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(q.pop()).append("\n");
				}
			}
		}
		System.out.println(sb);
	}
}