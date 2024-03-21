import java.io.*;
import java.util.*;

public class Main {
	static int n,m;
	static List<ArrayList<Integer>> list ;
	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		
		list = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<=n;i++) {
			list.add(new ArrayList<Integer>());
		}
		
		for(int i=0;i<m;i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			// 양방향이어야됨
			list.get(a).add(b);
			list.get(b).add(a);
		}
		BFS(1);
		
	}
	public static int BFS(int num) {
		int cnt = 0;
		//boolean[] visit = new boolean[n+1];
		Integer[] road = new Integer[n+1];
		Deque<Integer> dq = new LinkedList<Integer>();
		dq.offer(num);
		road[num] = 0;
		while(!dq.isEmpty()) {
			int nex = dq.poll();
			
			for(int i=0;i<list.get(num).size();i++) {
				int n = list.get(nex).get(i);
				System.out.println(n);
				if(road[n] == null && num != n) {
					road[n] = road[nex] + 1;
					dq.offer(n);
				}
			}
		}
		System.out.println(Arrays.toString(road));
		
		
		return cnt;
	}  
}
// 그래프 이론으로 한번
// 그래프 이론만으로 풀려면 같은 루트를 여러번 가선 안됨
// 배열 만들어 놓고 
// 플로이드 워셜은 참고

