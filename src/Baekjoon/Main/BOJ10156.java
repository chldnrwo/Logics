package Baekjoon.Main;
import java.util.*;

public class BOJ10156{
	static Integer[] arr;
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int k = in.nextInt();
		int n = in.nextInt();
		int m = in.nextInt();
		int result = k*n - m;
		if(result<0) {
			System.out.println(0);
		}else {
			System.out.println(result);
		}
		
	}
	
}

