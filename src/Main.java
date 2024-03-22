import java.util.*;
import java.io.*;
 

 
class Main {
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
        
        
        
    }
    public static int bfs() {
    	int cnt = 0;
    	Deque<Integer> dq = new LinkedList<Integer>();
    	boolean[] visit = new boolean[n+1];
    	visit[tar] = true;
    	dq.offer(tar);
    	
    	while(!dq.isEmpty()) {
    		int nex = dq.poll();
    		
    		for(int i=0;i<list.get(nex).size();i++) {
    			int ne = list.get(nex).get(i);
    			
    			if(!visit[ne]) {
    				visit[ne] = true;
    				
    				dq.offer(ne);
    			}
    		}
    	}
    	
    	
    	
    	
    	return 0;
    }
}