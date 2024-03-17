package Baekjoon2024;
import java.io.*;
import java.util.*;

public class BOJ1926 {
	static int cnt,max,n,m;
	static int[] nx = {-1,0,1,0};
	static int[] ny = {0,-1,0,1};
	static int[][] arr;
	static boolean[][] visit;
	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		max = 0;
		cnt = 0;
		n = in.nextInt();
		m = in.nextInt();
		arr = new int[n][m];
		visit = new boolean[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr[i][j]==1 && !visit[i][j]) {
					check(i,j);
				}
			}
		}
		System.out.println(cnt);
		System.out.println(max);
		
	}
	public static void check(int a, int b) {
		cnt++;
		Deque<Pair> dq = new LinkedList<>();
		visit[a][b] = true;
		dq.offer(new Pair(a, b));
		int cnt2 = 1;
		while(!dq.isEmpty()) {
			Pair nex = dq.poll();
			
			for(int i=0;i<4;i++) {
				int x = nex.x+nx[i];
				int y = nex.y+ny[i];
				
				if( 0<=x && x<n &&
					0<=y && y<m	
						) {
					if(!visit[x][y] && arr[x][y]==1) {
						visit[x][y] = true;
						dq.offer(new Pair(x,y));
						cnt2++;
					}
					
				}
			}
			
			max = Math.max(max, cnt2);
		}

	}
	static class Pair{
		private int x;
		private int y;
		
		Pair(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }
	}
}


