package Baekjoon2024;
import java.util.*;
import java.io.*;
 

 
class BOJ2644 {
	static int n, m, tar, get;
	static List<ArrayList<Integer>> list;
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        n = in.nextInt();
        tar = in.nextInt();
        get = in.nextInt();
        
        m =in.nextInt();
        list = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=n;i++) {
        	list.add(new ArrayList<Integer>());
        }
        
        for(int i=0;i<m;i++) {
        	int a = in.nextInt();
        	int b = in.nextInt();
        	
        	list.get(a).add(b);
        	list.get(b).add(a);
        }
        
        bfs();
        
    }
    public static void bfs() {
    	int cnt = 0;
    	Deque<Integer> dq = new LinkedList<Integer>();
    	Integer[] visit = new Integer[n+1];
    	visit[tar] = 0;
    	dq.offer(tar);
    	
    	while(!dq.isEmpty()) {
    		int nex = dq.poll();
    		
    		for(int i=0;i<list.get(nex).size();i++) {
    			int ne = list.get(nex).get(i);
    			
    			if(visit[ne] == null) {
    				visit[ne] = visit[nex] + 1;
    				dq.offer(ne);
    			}
    		}
    	}
    	
    	if(visit[get] != null) {
    		System.out.println(visit[get]);
    	}else {
    		System.out.println(-1);
    	}
    	
    }
}