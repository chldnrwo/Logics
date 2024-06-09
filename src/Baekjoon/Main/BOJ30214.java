package Baekjoon.Main;
import java.util.*;

public class BOJ30214{
	
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		
		double t = n/(double)m;
		if(t >= 0.5) {
			System.out.println("E");
		}else {
			System.out.println("H");
		}
		
		
	}
	
}

