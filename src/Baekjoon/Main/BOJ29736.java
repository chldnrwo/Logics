package Baekjoon.Main;
import java.util.*;

public class BOJ29736{

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		int k = in.nextInt();
		int x = in.nextInt();
		int cnt =0;
		for(int i=a;i<=b;i++) {
			if(k-x<=i && i<=k+x) {
				cnt++;
			}
		}
		
		if(cnt==0) {
			System.out.println("IMPOSSIBLE");
		}else {
			System.out.println(cnt);
		}
		
		
	}
	
}
