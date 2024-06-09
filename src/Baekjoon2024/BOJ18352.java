package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ18352 {
	static int n,m,k,start;
	static List<ArrayList<Integer>> list;
	static StringBuilder sb;
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        sb = new StringBuilder();
        n = in.nextInt();
        m = in.nextInt();
        k = in.nextInt();
        start = in.nextInt();
        
        list = new ArrayList<>();
        
        for(int i=0;i<=n;i++) {
        	list.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++) {
        	int a = in.nextInt();
        	int b = in.nextInt();
        	
        	list.get(a).add(b);
        }
       
        
        bfs(start);
        System.out.println(sb);
        
        
    }
   public static void bfs(int num) {
	   Deque<Integer> dq = new LinkedList<>();
	   Integer[] visit = new Integer[n+1];
	   dq.offer(num);
	   visit[num] = 0;
	   
	   while(!dq.isEmpty()) {
		   int nex = dq.poll();
		   
		   for(int i=0;i<list.get(nex).size();i++) {
			   int ne = list.get(nex).get(i);
			   
			   if(visit[ne]==null) {
				   visit[ne] = visit[nex]+1;
				   dq.offer(ne);
			   }
			   
		   }
	   }
	   
	   //System.out.println(Arrays.toString(visit));
	   
	   for(int i=1;i<visit.length;i++) {
		   if(visit[i]==k) {
			   sb.append(i).append("\n");
		   }
	   }
   }
  
} 
 