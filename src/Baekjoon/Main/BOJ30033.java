package Baekjoon.Main;
import java.util.*;

public class BOJ30033{

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int[] plan = new int[n];
		int[] real = new int[n];
		for(int i=0;i<n;i++) {
			plan[i] = in.nextInt();
		}
		for(int i=0;i<n;i++) {
			real[i] = in.nextInt();
		}
		int cnt = 0;
		for(int i=0;i<n;i++) {
			if(real[i]>=plan[i]) {
				cnt++;
				
			}
		}
		System.out.println(cnt);
	}
	
}

