package Baekjoon.Main;
import java.util.*;

public class BOJ30204{
	static Integer[] arr;
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int x = in.nextInt();
		
		int[] arr = new int[n];
		int sum = 0;
		for(int i=0;i<n;i++) {
			int a = in.nextInt();
			a%=x;
			arr[i] = a;
			sum+=a;
		}
		
		sum%=x;
		
		if(sum == 0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
	}
	
}

