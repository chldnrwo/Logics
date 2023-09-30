package Baekjoon.Main;
import java.util.*;

public class BOJ2239{
	static int[][] arr;
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		arr = new int[9][9];
		
		for(int i=0;i<9;i++) {
			String s = in.next();
			for(int j=0;j<9;j++) {
				char c = s.charAt(j);
				int a = c-48;
				arr[i][j] = a;
			}
		}
		
		dfs(0);
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	public static boolean dfs(int depth) {
		if(depth == 81) {
			return true;
		}
		//뎁스 정보로 위치 값 변환
		int y = depth / 9;
		int x = depth % 9;
		
		//이미 값이 있을 경우 다음 뎁스 진행 
		if(arr[y][x] !=0) {
			return dfs(depth + 1);
		}else {
			for(int i=1;i<=9;i++) {
				//넣을 수 있는 i 중에 가장 낮은 i를 먼저 넣음
				if(check(y,x,i)) {
					arr[y][x] = i;
					if(dfs(depth+1)) return true;
					arr[y][x] = 0;
				}
			}
		}
		return false;
	}
	public static boolean check(int y, int x, int n) {
		//소속된 행이나 열에 같은 숫자가 있으면 거짓
		for(int i=0;i<9;i++) {
			if(arr[y][i] == n || arr[i][x] == n) {
				return false;
			}
		}
		
		//소속된 정사각형안에 같은 숫자 있으면 거짓
		 int startY = y / 3 * 3;
		 int startX = x / 3 * 3;
		 for (int i = startY; i < startY + 3; ++i) {
		     for (int j = startX; j < startX + 3; ++j) {
		         if (arr[i][j] == n) return false;
		     }
		 }
		 return true;
		
	}
}

