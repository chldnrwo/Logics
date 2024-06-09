package Baekjoon.Main;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class BOJ1058{
	static boolean[] visit;	
	static int N;
	static List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		N = in.nextInt();
		
		for(int i=0;i<=N;i++) {
			list.add(new ArrayList<>());
		}

		for(int i=0;i<N;i++){
		String s  = in.next();
			for(int j=0;j<N;j++){
				char a = s.charAt(j);
				if(a == 'Y') {
					list.get(i+1).add(j+1);
				}
			}
		}
		int max=0;
		for(int i=1;i<=N;i++) {
			int z = bfs(i);
			if(z>max) {
				max = z;
			}
		}
		System.out.println(max);
		
	}
	public static int bfs(int n){
		
		visit = new boolean[N+1];
		Deque<Integer> q = new LinkedList<>();
		
		visit[n] = true;
		int cnt=0;
		int[] lim = new int[N+1];
		q.offer(n);
		
		while(!q.isEmpty()) {
			int a = q.poll();
			if(lim[a]==2) {
				return cnt;
			}
			
			for(int i=0;i<list.get(a).size();i++) {
				int nex = list.get(a).get(i);
				
				if(visit[nex]) {
					continue;
				}
				visit[nex] = true;
				lim[nex] = lim[a]+1;
				cnt++;
				q.offer(nex);
			}
		}
		
		
		return cnt;
	}
}

//a와 직접 친구거나
//c친구가 중계해주거나
//최대는 N일수 밖에 없음
//완전탐색 써야되고, N이 50보다 작아서 시간복잡도도 버틸 수 있음
//두단계만