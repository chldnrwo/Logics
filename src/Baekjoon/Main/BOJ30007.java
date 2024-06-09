package Baekjoon.Main;
import java.util.*;

public class BOJ30007{

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for(int i=0;i<n;i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int x = in.nextInt();
			x--;
			System.out.println(a*x+b);
		}
				
	}
	
}

