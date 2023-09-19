package Baekjoon.Main;
import java.util.*;

public class BOJ30017{

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int m = in.nextInt();
		
		if(n>m) {
			System.out.println(2*m+1);
		}else {
			System.out.println(2*n-1);
		}
	}
	
}

