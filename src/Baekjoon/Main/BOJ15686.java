package Baekjoon.Main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BOJ15686{
	static int[][] arr;
	static List<Pair> listC = new ArrayList<>();
	static List<Pair> listH = new ArrayList<>();
	static int ans = Integer.MAX_VALUE;
	static boolean[] open;
	static int N,M;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		N = in.nextInt();
		M = in.nextInt();
		arr = new int[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				arr[i][j] = in.nextInt();
				if(arr[i][j]==1) {
					listH.add(new Pair(i, j));
				}else if(arr[i][j]==2) {
					listC.add(new Pair(i, j));
				}
			}
		}
		open = new boolean[listC.size()];
		
		dfs(0, 0);
		System.out.println(ans);
	}
	static class Pair{
		private int a;
		private int b;
		
		Pair(int a, int b){
			this.a = a;
			this.b = b;
		}
	}
	public static void dfs(int depth, int num) {
		if(num == M) {
			int res = 0;
			
			for(int i=0;i<listH.size();i++) {
				int temp = Integer.MAX_VALUE;
				for(int j=0;j<listC.size();j++) {
					if(open[j]) {
						int dis = Math.abs(listH.get(i).a - listC.get(j).a) +
								Math.abs(listH.get(i).b - listC.get(j).b);
						
						temp = Math.min(temp, dis);
					}
				}
				res += temp;
			}
			ans = Math.min(ans, res);
			return;
		}
		
		for(int i=depth;i<listC.size();i++) {
			open[i] = true;
			dfs(i+1, num+1);
			open[i] = false;
		}
	}
	
}