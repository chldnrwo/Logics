package Baekjoon.Main;
import java.math.BigInteger;
import java.util.*;

public class BOJ29683{
	static Integer[] arr;
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int a = in.nextInt();
		int sum=0;
		for(int i=0;i<n;i++) {
			int a1 = in.nextInt();
			int a2 = a1 / a;
			
			sum+=a2;
		}
		System.out.println(sum);
	}
	
}

