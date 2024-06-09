package Baekjoon2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ1325_NOTGOOD{
	static List<ArrayList<Integer>> list;
	static int n,m;
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
		);
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		
		list = new ArrayList<>();
		for(int i=0;i<=n;i++) {
			list.add(new ArrayList<>());
		}
		
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list.get(b).add(a);
		}
		
		int[] arr = new int[n+1];
		
		int max = 0;
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=n;i++) {
			int a = BFS(i);
			//System.out.println(a);
			if(a>max) {
				sb = new StringBuilder();
				max = a;
				sb.append(i).append(" ");
			}else if(a == max) {
				sb.append(i).append(" ");
			}
		}
		System.out.println(sb);
	}
	
	public static int BFS(int num) {
		int cnt = 0;
		boolean[] visit = new boolean[n+1];
		Deque<Integer> dq = new LinkedList<>();
		dq.offer(num);
		
		while(!dq.isEmpty()) {
			int nx = dq.poll();
			
			for(int i=0;i<list.get(nx).size();i++) {
				int a = list.get(nx).get(i);
				if(visit[a]){
			       continue;
			    }
			    visit[a] = true;
			    cnt++;
				dq.offer(a);
			}
		}
		
		
		return cnt;
	}
}

