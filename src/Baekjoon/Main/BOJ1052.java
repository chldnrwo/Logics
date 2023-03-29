package Baekjoon.Main;
import java.util.Scanner;

class BOJ1052{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int K = in.nextInt();
		int cnt=0;
		if(N<=K) {
			System.out.println(0);
			return;
		}
		int buy = 0;
		while(true) {
			cnt = 0;
			int copyN = N;
			while(copyN !=0) {
				if(copyN %2 == 1) {
					cnt+=1;
				}
				copyN /=2;
			}
			if(cnt<=K) {
				break;
			}
			N+=1;
			buy+=1;
		}
		System.out.println(buy);
	}
}