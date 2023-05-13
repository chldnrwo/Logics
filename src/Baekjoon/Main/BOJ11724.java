package Baekjoon.Main;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BOJ11724 {
	static List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	static boolean[] visit;
	static int cnt=0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int m = in.nextInt();
        
        for(int i = 0 ;i<=n; i++) {
        	list.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++) {
        	int a = in.nextInt();
        	int b = in.nextInt();
        	
        	list.get(a).add(b);
        	list.get(b).add(a);
        }
        visit = new boolean[n+1];
        
        for(int i=1;i<=n;i++) {
        	if(!visit[i]) {
        		bfs(i);
        	}
        }
        System.out.println(cnt);
    }
    public static void bfs(int num) {
    	cnt++;
    	Deque<Integer> q = new LinkedList<>();
    	visit[num] = true;
    	q.offer(num);
    	
    	while(!q.isEmpty()) {
    		int n = q.poll();
    		for(int i : list.get(n)) {
    			if(visit[i]) {
    				continue;
    			}
    			visit[i] = true;
    			
    			q.offer(i);
    		}
    	}
    	
    }
}
