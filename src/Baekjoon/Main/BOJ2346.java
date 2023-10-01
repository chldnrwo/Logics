package Baekjoon.Main;
import java.util.*;

public class BOJ2346{
	
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		Deque<Pair> q = new ArrayDeque<>();
		
		for(int i=1;i<=n;i++) {
			int a = in.nextInt();
			q.offer(new Pair(a, i));
		}
		
		System.out.print(1+" ");
		
		int a = q.poll().a;
				
		while(!q.isEmpty()) {
			if(a>0) {
				for(int i=1;i<a;i++) {
					Pair tmp = q.poll();
					q.add(tmp);
				}
				
				Pair tm = q.poll();
				a = tm.a;
				System.out.print(tm.b+" ");
			}else {
				for(int i=1;i<-a;i++) {
					Pair tmp = q.pollLast();
					q.addFirst(tmp);
				}
				Pair tm = q.pollLast();
				a = tm.a;
				System.out.print(tm.b+" ");
			}
			
		}
	}
	static class Pair{
		int a;
		int b;
		
		Pair(int a, int b){
			this.a = a;
			this.b = b;
		}
	}
}

