package Baekjoon.Main;
import java.util.Scanner;

class BOJ1072{
	static long x,y,r;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		x = in.nextInt();
		y = in.nextInt();
		
		r = y*100/x;  //88
		if(r>=99) {
			System.out.println(-1);
			return;
		}
		bi(0, 1000000000);
		
	}
	public static void bi(int bot, int top) {
		int mid = (bot+top)/2;
		int z = (int) ((y+mid)*100/(x+mid));
		
		if(bot>top) {
			System.out.println(mid+1);
			return;
		}
		
		if(r >= z) {
			bi(mid+1, top);
		}else {
			bi(bot, mid-1);
		}
	}
}
//시간초과 시뮬레이션 말고 수학으로 풀어야됨
//이분탐색문제였음