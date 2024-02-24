package Baekjoon2024;
import java.io.*;
import java.util.*;

public class BOJ1325 {
	static int n, m;					// n개 컴퓨터, m개 컴퓨타 신뢰 관계
	static List<Integer>[] lists;		// 컴퓨터 신뢰 관계 (인접 리스트)
	static int[] hackCounts;			// [i]번 컴퓨터를 해킹 했을때, 해킹 가능한 컴퓨터 수
	static boolean[] visited;
	static Queue<Integer> queue = new LinkedList<>();

	static void bfs() {
		while (!queue.isEmpty()) {
			int currentIdx = queue.remove();

			for (int nextIdx : lists[currentIdx]) {
				if (!visited[nextIdx]) {
					visited[nextIdx] = true;
					hackCounts[nextIdx]++;
					queue.add(nextIdx);
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
		);
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		lists = new List[n + 1];			// 컴퓨터(정점) 번호 [1] ~ [n] 사용
		hackCounts = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			lists[i] = new ArrayList<>();
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());

			lists[start].add(end);
		}

		// 각 [i]번 컴퓨터를 시작 노드로 하여 BFS 탐색 수행
		for (int i = 1; i <= n; i++) {
			visited = new boolean[n + 1];	// 방문 처리 배열 초기화

			visited[i] = true;
			hackCounts[i]++;
			queue.add(i);

			bfs();
		}

		int maxHackCount = 0;
		for (int i = 1; i <= n; i++) {
			maxHackCount = Math.max(maxHackCount, hackCounts[i]);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			if (hackCounts[i] == maxHackCount) {
				sb.append(i).append(" ");
			}
		}
		System.out.println(sb);
	}
}