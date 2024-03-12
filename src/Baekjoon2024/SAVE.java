package Baekjoon2024;
import java.io.*;
import java.util.*;

public class SAVE {
	static int m,n;
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		m = in.nextInt();
		n = in.nextInt();
		
		int inv = in.nextInt(); //인벤
		int[][] arr = new int[n][m];
		// 블럭 놓는데 1초, 제거에는 2초
		// 블럭 놓아서 해결할 수 있는지를 판단해야하고
		// 깎아서 해결할 수 없는 경우는 없다 음수가 올 수 없으니 0까지
		// 깍아도 되기 때문,
		// 일부를 깎아서 인벤토리를 확보하고 채우는 경우도 생각해야됨
		// 시간이 최소가 되야함
		int top = 0;
		int bot = Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				int a = in.nextInt();
				arr[i][j] = a;
				if(a > top) {
					top = a;
				}
				if(a < bot) {
					bot = a;
				} 
			}
		}
		//System.out.println(top);
		//System.out.println(bot);
		// 현재 최고 높이를 기준으로 채울 경우
		int minTime = Integer.MAX_VALUE;
		int cost = 0; 
		for(int i=top;i>=bot;i--) {
			
	
			if(check(top, inv, arr)) {
				int a = cal(i, inv, arr);
				if(a<minTime) {
					minTime = a;
				}
			}
		}
		
		
			
	}
	public static boolean check(int top, int inv, int[][] arr) {
		int cnt = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				int b = top - arr[i][j];
				cnt+=b;
			}
		}
		if(cnt <= inv) {
			return true;
		}
		
		return false;
	}
	public static int cal(int top, int inv, int[][] arr) {
		int cnt = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				int b = top - arr[i][j];
				cnt+=b;
			}
		}
		
		return cnt;
	}
}